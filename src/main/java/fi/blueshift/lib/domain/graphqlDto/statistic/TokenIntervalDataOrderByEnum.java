package fi.blueshift.lib.domain.graphqlDto.statistic;


import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "TokenIntervalData_orderBy")
public enum TokenIntervalDataOrderByEnum {
    dateTime("tokenStatistic", "dateTime"),
    tokenAddress("token", "addressId"),
    ;

    private final String entityName;
    private final String entityField;

    TokenIntervalDataOrderByEnum(String entityName, String entityField) {
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
