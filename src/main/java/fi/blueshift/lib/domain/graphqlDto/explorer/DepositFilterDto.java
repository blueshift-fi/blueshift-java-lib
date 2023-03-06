package fi.blueshift.lib.domain.graphqlDto.explorer;


import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@GraphQLType(name = "Mint_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepositFilterDto {
    String tokenAddress;

    String portfolioAddress;
}
