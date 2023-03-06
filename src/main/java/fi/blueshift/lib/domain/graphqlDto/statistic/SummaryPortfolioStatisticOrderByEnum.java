package fi.blueshift.lib.domain.graphqlDto.statistic;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Factory_orderBy")
public enum SummaryPortfolioStatisticOrderByEnum {
    dateTime("summaryStatistic", "dateTime"),
    volume24hUSD("summaryStatistic", "volume24hUSD"),
    tvlUSD("summaryStatistic", "tvlUSD"),
    fees24hUSD("summaryStatistic", "fees24hUSD"),
    ;

    private final String entityName;
    private final String entityField;

    SummaryPortfolioStatisticOrderByEnum(String entityName, String entityField) {
        this.entityName = entityName;
        this.entityField = entityField;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getEntityField() {
        return entityField;
    }
}
