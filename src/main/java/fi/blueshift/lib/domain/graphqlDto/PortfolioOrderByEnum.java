package fi.blueshift.lib.domain.graphqlDto;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Portfolio_orderBy")
public enum PortfolioOrderByEnum {
    id("portfolio", "id"),
    name("portfolio", "name"),
    addressId("portfolio", "addressId"),
    tvlUSD("portfolio", "tvlUSD");

    private final String entityName;
    private final String entityField;

    PortfolioOrderByEnum(String entityName, String entityField) {
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
