package fi.blueshift.lib.exception;

import fi.blueshift.lib.domain.model.exception.ApiError;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InnerServiceFeignException extends RuntimeException {

    private ApiError apiError;

    public InnerServiceFeignException(ApiError apiError) {
        super(apiError.getMessage());
        this.apiError = apiError;
    }
}
