package fi.blueshift.lib.domain.dto.bluesbots;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.List;

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

    @JsonSetter("signature")
    Object signatureObject;
//    "v":27,"r":"0x2417dadb1c2bfb84ba12a00b39bffd59eabb1e781bfcb2753753fde3180fcbbb","s":"0x4534f19d632d7b109946d8de3fc3f1625c1593cf14d5db6c239d8250af6722cc"
}
