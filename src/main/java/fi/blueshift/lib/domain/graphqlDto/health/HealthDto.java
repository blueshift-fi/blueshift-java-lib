package fi.blueshift.lib.domain.graphqlDto.health;

import fi.blueshift.lib.domain.enums.HealthStatusType;
import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@GraphQLType(name = "Health")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HealthDto {

    @GraphQLId
    String id;

    @GraphQLInputField
    Boolean synced;

    @GraphQLInputField
    HealthStatusType status;

    @GraphQLInputField
    String chainStatusError;

    @GraphQLInputField
    ChainStatusDto chainStatus;
}
