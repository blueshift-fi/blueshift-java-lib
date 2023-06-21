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
//    public void build() {
//        if (tokenInDecimals != tokenOutDecimals) {
//            BigDecimal amountOutput;
//            if (nonNull(amountOutDecimals)) {
//                amountOutput = StatisticUtil.getAmountFromDecimalAmount(amountOutDecimals, tokenOutDecimals);
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
//            } else {
//                amountOutput = StatisticUtil.getAmountFromDecimalAmount(amountInDecimals, tokenInDecimals);
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
//            }
//            price = amountOutput.divide(amountSource, RoundingMode.HALF_DOWN);
//        } else {
//            if (nonNull(amountOutDecimals)) {
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
//            } else {
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
//            }
//            price = amountOutDecimals.divide(amountSource, this.tokenInDecimals, RoundingMode.HALF_DOWN);
//        }
//    }

    public void build() {
        BigDecimal amountOutputRaw;
        BigDecimal amountSourceRaw;
        if (nonNull(amountOutDecimals)) {
            if (tokenInDecimals != tokenOutDecimals) {
                amountOutputRaw = StatisticUtil.getAmountFromDecimalAmount(amountOutDecimals, tokenOutDecimals);
                amountSourceRaw = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
                amountSource = amountSourceRaw;
            } else {
                amountOutputRaw = amountOutDecimals;
                amountSourceRaw = amountDecimalsSource;
                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
            }
            price = amountOutputRaw.divide(amountSourceRaw, this.tokenOutDecimals, RoundingMode.DOWN);
        } else {
            if (tokenInDecimals != tokenOutDecimals) {
                amountOutputRaw = StatisticUtil.getAmountFromDecimalAmount(amountInDecimals, tokenInDecimals);
                amountSourceRaw = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
                amountSource = amountSourceRaw;
            } else {
                amountOutputRaw = amountInDecimals;
                amountSourceRaw = amountDecimalsSource;
                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
            }
            price = amountOutputRaw.divide(amountSourceRaw, this.tokenInDecimals, RoundingMode.UP);
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

//    private void build2() {
//        if (tokenInDecimals != tokenOutDecimals) {
//            BigDecimal amountOutputWithFee;
//            BigDecimal amountSourceWithFee;
//            if (nonNull(amountOutDecimals)) {
//                amountOutputWithFee = StatisticUtil.getAmountFromDecimalAmount(amountOutDecimals, tokenOutDecimals);
//                amountSourceWithFee = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource.add(dexCommissionAmountDecimals).add(crossChainCommissionAmountDecimals), tokenInDecimals);
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
//            } else {
//                amountOutputWithFee = StatisticUtil.getAmountFromDecimalAmount(amountInDecimals.add(dexCommissionAmountDecimals).add(crossChainCommissionAmountDecimals), tokenInDecimals);
//                amountSourceWithFee = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
//                amountSource = amountSourceWithFee;
//            }
//            price = amountOutputWithFee.divide(amountSourceWithFee, RoundingMode.HALF_UP);
//        } else {
//            BigDecimal amountDecimals;
//            BigDecimal amountSourceDecimalsWithFee;
//            if (nonNull(amountOutDecimals)) {
//                amountDecimals = amountOutDecimals;
//                amountSourceDecimalsWithFee = amountDecimalsSource.add(dexCommissionAmountDecimals).add(crossChainCommissionAmountDecimals);
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenInDecimals);
//            } else {
//                amountDecimals = amountInDecimals.add(dexCommissionAmountDecimals).add(crossChainCommissionAmountDecimals);
//                amountSourceDecimalsWithFee = amountDecimalsSource;
//                amountSource = StatisticUtil.getAmountFromDecimalAmount(amountDecimalsSource, tokenOutDecimals);
//            }
//            price = amountDecimals.divide(amountSourceDecimalsWithFee, this.tokenInDecimals, RoundingMode.HALF_UP);
//        }
//    }
}