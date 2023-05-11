package fi.blueshift.lib.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class TokenPairTradingConfigDto implements Serializable {

    private static final long serialVersionUID = -310194046034457676L;
    BigDecimal baseTokenMinTradingAmount;

    BigDecimal baseTokenMaxTradingAmount;

    BigDecimal baseTokenMinProfitAmount = BigDecimal.ZERO;

    BigDecimal quoteTokenMinProfitAmount = BigDecimal.ZERO;
}
