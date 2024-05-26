package fi.blueshift.lib.domain.model.bluesbots;

import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.domain.model.bluesdex.Signature;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotPricesResponse extends BotPricesRequest implements Serializable {
    private static final long serialVersionUID = -2332084921192074250L;

    @JsonProperty("price")
    List<BigDecimal> tokenPriceList;

    Long timestamp;

    Signature signature;

    public BotPricesResponse(BotPricesRequest request) {
        super(request.toBuilder());
    }

    public Long getTtlTimestamp() {
        return timestamp + TimeUnit.SECONDS.toMillis(59);
    }
}
