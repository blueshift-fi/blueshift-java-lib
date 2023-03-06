package fi.blueshift.lib.domain.graphqlDto.explorer;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Explorer_orderBy")
public enum ExplorerOrderByEnum {
    timestamp("transaction", "timestamp"),
    dateTime("transaction", "dateTime");

    private final String entityName;
    private final String entityField;

    ExplorerOrderByEnum(String entityName, String entityField) {
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
