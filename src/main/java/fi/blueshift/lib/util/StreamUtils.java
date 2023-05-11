package fi.blueshift.lib.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamUtils {
    public static <T> Predicate<T> distinctByKey(
            Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> keyMapper,
                                                             Function<? super T, ? extends U> valueMapper) {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    Map<K, U> result = new LinkedHashMap<>();
                    for (T item : list) {
                        K key = keyMapper.apply(item);
                        U value = valueMapper.apply(item);
                        if (value == null || (isAllNull(value))) continue;
                        if (result.putIfAbsent(key, value) != null) {
                            throw new IllegalStateException(String.format("Duplicate key %s", key));
                        }
                    }
                    return result;
                });
    }

    public static boolean isAllNull(Object list) {
        if (list instanceof Collection) {
            for (Object obj : (Iterable<?>) list) {
                if (obj != null)
                    return false;
            }
            return true;
        } else if (list instanceof Map) {
            for (Object obj : (Iterable<?>) list) {
                if (obj != null)
                    return false;
            }
            return true;
        }
        return false;
    }
}
