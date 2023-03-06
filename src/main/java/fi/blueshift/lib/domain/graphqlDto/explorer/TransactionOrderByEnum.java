package fi.blueshift.lib.domain.graphqlDto.explorer;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Transaction_orderBy")
public enum TransactionOrderByEnum {
    timestamp("transaction", "timestamp"),
    dateTime("transaction", "dateTime");

    private final String entityName;
    private final String entityField;

    TransactionOrderByEnum(String entityName, String entityField) {
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
