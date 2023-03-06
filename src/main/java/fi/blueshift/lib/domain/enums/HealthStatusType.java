package fi.blueshift.lib.domain.enums;

import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "HealthStatus")
public enum HealthStatusType {
    HEALTHY,
    UNHEALTHY,
    FAILED
}
