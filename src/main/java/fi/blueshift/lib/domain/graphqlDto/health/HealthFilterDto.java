package fi.blueshift.lib.domain.graphqlDto.health;


import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@GraphQLType(name = "Health_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HealthFilterDto {

    @GraphQLNonNull
    CryptoNetworkType network;
}
