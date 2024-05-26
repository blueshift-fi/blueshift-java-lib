package fi.blueshift.lib.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ChainEventType {
    LIQUIDITY_POOL_UPDATE("liquidity_pool", "creation or updates to pool or portfolios"),
    LIQUIDITY_EVENT("liquidity_change", "deposit or withdraw event to contract"),
    TRADE_EVENT("trade", "change tokens operation within  pool or portfolios, e.g. swap"),
//    PRICE_UPDATES_EVENT("price"),
//    BLOCKCHAIN_STATUS("blockchain-status"),
//    STATISTIC_EVENT("statistic"),
//    YIELD_POOL_TVL("yield-pool-tvl"),
    ;

    @Getter
    private final String topicName;
    private final String description;

    public static List<String> getAllValueNames() {
        return Arrays.stream(ChainEventType.values()).parallel().map(ChainEventType::name).toList();
    }
}
