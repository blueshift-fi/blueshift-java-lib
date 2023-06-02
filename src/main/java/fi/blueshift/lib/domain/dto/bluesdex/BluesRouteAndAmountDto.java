package fi.blueshift.lib.domain.dto.bluesdex;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.util.StatisticUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.nonNull;

@Data
@SuperBuilder
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BluesRouteAndAmountDto {
    BluesRoute route;

    @JsonProperty("amountOut")
    BigDecimal amountOutDecimals;

    @JsonIgnore
    int tokenOutDecimals;


    @JsonProperty("amountIn")
    BigDecimal amountInDecimals;

    @JsonIgnore
    int tokenInDecimals;

    @JsonIgnore
    BigDecimal amountDecimalsSource;

    /**
     * Amount of source/goal token for receive
     */
    @JsonIgnore
    private BigDecimal amountSource;


    @JsonProperty("priceImpact")
    BigDecimal priceImpact;

    @JsonProperty("lpFee")
    BigDecimal dexCommissionAmountDecimals;

    @JsonProperty("crossChainFee")
    BigDecimal crossChainCommissionAmountDecimals;

    @JsonIgnore
    BigDecimal price;

    /**
     * Define main calculated properties from RouteData
     */
    public void build() {
        if (tokenInDecimals != tokenOutDecimals) {
            BigDecimal amountOutputWoFee;
            BigDecimal amountSourceWoFee;
            if (nonNull(amountOutDecimals)) {
                amountOutputWoFee = StatisticUtil.getAmountFromDecimalAmount(amountOutDecimals, tokenOutDecimals);
                amountSourceWoFee = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource.subtract(dexCommissionAmountDecimals).subtract(crossChainCommissionAmountDecimals), tokenInDecimals);
                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
            } else {
                amountOutputWoFee = StatisticUtil.getAmountFromDecimalAmount(amountInDecimals.subtract(dexCommissionAmountDecimals).subtract(crossChainCommissionAmountDecimals), tokenInDecimals);
                amountSourceWoFee = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
                amountSource = amountSourceWoFee;
            }
            price = amountOutputWoFee.divide(amountSourceWoFee, RoundingMode.HALF_UP);
        } else {
            BigDecimal amountDecimals;
            BigDecimal amountSourceDecimalsWoFee;
            if (nonNull(amountOutDecimals)) {
                amountDecimals = amountOutDecimals;
                amountSourceDecimalsWoFee = amountDecimalsSource.subtract(dexCommissionAmountDecimals).subtract(crossChainCommissionAmountDecimals);
                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
            } else {
                amountDecimals = amountInDecimals.subtract(dexCommissionAmountDecimals).subtract(crossChainCommissionAmountDecimals);
                amountSourceDecimalsWoFee = amountDecimalsSource;
                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
            }
            price = amountDecimals.divide(amountSourceDecimalsWoFee, this.tokenInDecimals, RoundingMode.HALF_UP);
        }
    }

    @Data
    @NoArgsConstructor
    public static class BluesRoute {
        @JsonProperty("path")
        LinkedList<String> pathList;

        @JsonProperty("chains")
        LinkedList<String> chainList;

        @JsonProperty("portfolios")
        List<String> availablePortfolioList;

        //"crossChainPortfolioIndex": "-1"
        String crossChainPortfolioIndex;
    }
}