package fi.blueshift.lib.util;

import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class KafkaUtil {

    public static Map<String, Object> parseHeaders(Headers kafkaHeaders) {
        Map<String, Object> headerMap = new HashMap<>();
        for (Header headerItem : kafkaHeaders) {
            Object value;
            switch (headerItem.key()) {
                case "historical":
                    value = parseHistoricalByte(headerItem.value());
                    break;
                case "network":
                    value = parseNetworkByte(headerItem.value());
                    break;
                default:
                    value = new String(headerItem.value());
            }
            headerMap.put(headerItem.key(), value);
        }
        return headerMap;
    }

    private static CryptoNetworkType parseNetworkByte(byte[] byteString) {
        try {
            return CryptoNetworkType.fromType(new String(byteString));
        } catch (Exception e) {
            log.error("!> can't parse bytes '{}' to CryptoNetworkType for Kafka header. Original exception is\n{}",
                    byteString, e.toString());
            return null;
        }
    }

    private static Boolean parseHistoricalByte(byte[] byteString) {
        try {
            return Boolean.parseBoolean(new String(byteString));
        } catch (Exception e) {
            log.error("!> can't parse bytes '{}' to boolean for Kafka header. Original exception is\n{}",
                    byteString, e.toString());
            return null;
        }
    }
}
