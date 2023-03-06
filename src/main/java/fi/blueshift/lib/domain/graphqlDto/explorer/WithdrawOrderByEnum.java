package fi.blueshift.lib.domain.graphqlDto.explorer;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Burn_orderBy")
public enum WithdrawOrderByEnum {
    timestamp("withdraw", "timestamp"),
    dateTime("withdraw", "dateTime");

    private final String entityName;
    private final String entityField;

    WithdrawOrderByEnum(String entityName, String entityField) {
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
