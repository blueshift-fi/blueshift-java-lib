package fi.blueshift.lib.domain.graphqlDto;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "SupportedChains_orderBy")
public enum CryptoNetworkSettingsOrderByEnum {
    typeName("supportedNetworks", "typeName"),
    shortName("supportedNetworks", "shortName"),
    ;

    private final String entityName;
    private final String entityField;

    CryptoNetworkSettingsOrderByEnum(String entityName, String entityField) {
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
