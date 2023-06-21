package fi.blueshift.lib.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenPairTradingConfigDto implements Serializable {

    private static final long serialVersionUID = -310194046034457676L;

    boolean enabled = true;

    BigDecimal baseTokenMinTradingAmount;

    BigDecimal baseTokenMaxTradingAmount;

    @JsonProperty("pricePrecision")
    Integer pricePrecisionDecimals;

    BigDecimal baseTokenMinProfitAmount;

    BigDecimal quoteTokenMinProfitAmount;

    List<OrderBookPlacerConfigDto> orderBookPlacerConfigLevels;

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OrderBookPlacerConfigDto implements Serializable {
        Integer levelIndex;
        Double minProfitPercentage;
        Double maxProfitPercentage;
        BigDecimal liquidityAmount;
        Integer ordersCountForLevel;
    }
}
