package fi.blueshift.lib.domain.graphqlDto;

import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@GraphQLType(name = "SupportedChains_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CryptoNetworkSettingsFilterDto {
    CryptoNetworkType type;
}
