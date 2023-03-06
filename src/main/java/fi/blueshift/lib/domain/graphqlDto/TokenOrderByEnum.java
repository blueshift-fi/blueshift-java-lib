package fi.blueshift.lib.domain.graphqlDto;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Token_orderBy")
public enum TokenOrderByEnum {
    id("token", "id"),
    symbol("token", "symbol"),
    name("token", "name"),
    tvlUSD("token", "tvlUSD");

    private final String entityName;
    private final String entityField;

    TokenOrderByEnum(String entityName, String entityField) {
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
