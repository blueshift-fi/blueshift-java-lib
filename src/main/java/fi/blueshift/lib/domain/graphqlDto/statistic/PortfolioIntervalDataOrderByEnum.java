package fi.blueshift.lib.domain.graphqlDto.statistic;


import io.leangen.graphql.annotations.types.GraphQLType;


@GraphQLType(name = "PortfolioIntervalData_orderBy")
public enum PortfolioIntervalDataOrderByEnum {
    portfolioAddress("portfolio", "addressId"),
    volumeUSD("portfolioStatistic", "volumeUSD"),
    tvlUSD("portfolioStatistic", "tvlUSD"),
    feesUSD("portfolioStatistic", "feesUSD"),
    dateTime("portfolioStatistic", "dateTime");

    private final String entityName;
    private final String entityField;

    PortfolioIntervalDataOrderByEnum(String entityName, String entityField) {
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
