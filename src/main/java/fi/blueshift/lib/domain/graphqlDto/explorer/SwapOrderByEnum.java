package fi.blueshift.lib.domain.graphqlDto.explorer;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Swap_orderBy")
public enum SwapOrderByEnum {
    timestamp("swap", "timestamp"),
    dateTime("swap", "dateTime");

    private final String entityName;
    private final String entityField;

    SwapOrderByEnum(String entityName, String entityField) {
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
