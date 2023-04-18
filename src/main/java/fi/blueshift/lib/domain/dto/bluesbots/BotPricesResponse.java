package fi.blueshift.lib.domain.dto.bluesbots;

import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.domain.dto.bluesdex.Signature;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotPricesResponse extends BotPricesRequest {
    @JsonProperty("price")
    List<BigDecimal> tokenPriceList;

    Long timestamp;

    Signature signature;

    public Long getTtlTimestamp() {
        return timestamp + TimeUnit.SECONDS.toMillis(59);
    }
}
