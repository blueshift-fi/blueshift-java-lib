package fi.blueshift.lib.domain.model.bluesbots;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.domain.enums.LiquidityOperationType;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiquidityEventDto extends TransactionEventDto {

    LiquidityOperationType operationType;

    //amount of LP token (liquidityOut / liquidityIn)
    BigDecimal lpTokensAmount;

    //amount in Token
    BigDecimal amount;

    //token address
    @JsonProperty("token")
    String tokenAddress;

    //address for base token in portfolio
    @JsonProperty("baseToken")
    String baseTokenAddress;

    //address for base token in portfolio
    Long baseTokenDecimals;
}
