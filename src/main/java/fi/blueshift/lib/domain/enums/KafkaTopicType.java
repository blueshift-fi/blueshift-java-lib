package fi.blueshift.lib.domain.enums;

public enum KafkaTopicType {

    PORTFOLIOS("portfolios"),
    LIQUIDITY_EVENT("liquidity"),
    SWAP_EVENT("swap"),
    PRICE_UPDATES_EVENT("price"),
    BLOCKCHAIN_STATUS("blockchain-status"),
    STATISTIC_EVENT("statistic"),
    YIELD_POOL_TVL("yield-pool-tvl"),
    ;

    private final String topicName;

    KafkaTopicType(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }
}
