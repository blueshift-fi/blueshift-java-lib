package fi.blueshift.lib.domain.graphqlDto.statistic;


import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "TotalFactory_orderBy")
public enum TotalSummaryStatisticOrderByEnum {
    dateTime("totalSummaryStatistic", "dateTime"),
    ;

    private final String entityName;
    private final String entityField;

    TotalSummaryStatisticOrderByEnum(String entityName, String entityField) {
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
