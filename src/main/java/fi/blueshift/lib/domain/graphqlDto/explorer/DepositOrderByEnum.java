package fi.blueshift.lib.domain.graphqlDto.explorer;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Mint_orderBy")
public enum DepositOrderByEnum {
    timestamp("deposit", "timestamp"),
    dateTime("deposit", "dateTime");

    private final String entityName;
    private final String entityField;

    DepositOrderByEnum(String entityName, String entityField) {
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
