package fi.blueshift.lib.util;


import fi.blueshift.lib.exception.EntityMappingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SignalType;

import java.util.Optional;
import java.util.logging.Level;

@Slf4j
@Component
public class ReactiveUtils {

    public static <T> Mono<T> processWithErrorCheck(Mono<T> monoToCheck, String errorMessage, boolean enableErrors) {
        if (!enableErrors) {
            return monoToCheck;
        }
        return monoToCheck.switchIfEmpty(Mono.defer(() -> {
            log.error(errorMessage);
            return Mono.error(new EntityMappingException(errorMessage));
        }));
    }

    public static <T> Flux<T> processWithErrorCheck(Flux<T> fluxToCheck, String errorMessage, boolean enableErrors) {
        if (!enableErrors) {
            return fluxToCheck;
        }
        return fluxToCheck.switchIfEmpty(Flux.defer(() -> {
            log.error(errorMessage);
            return Flux.error(new EntityMappingException(errorMessage));
        }));
    }

    @SuppressWarnings("rawtypes")
    public static <T> Mono<T> processWithLog(Class className, Mono<T> monoToLog) {
        return monoToLog
                .log(className.getName() + '.', Level.INFO, SignalType.ON_NEXT, SignalType.ON_COMPLETE);
    }

    @SuppressWarnings("rawtypes")
    public static <T> Flux<T> processWithLog(Class className, Flux<T> fluxToLog) {
        return fluxToLog
                .log(className.getName() + '.', Level.INFO, SignalType.ON_NEXT, SignalType.ON_COMPLETE);
    }

    public static <T> Mono<Optional<T>> optional(Mono<T> in) {
        return in.map(Optional::of).switchIfEmpty(Mono.just(Optional.empty()));
    }
}
