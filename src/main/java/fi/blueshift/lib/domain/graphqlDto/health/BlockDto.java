package fi.blueshift.lib.domain.graphqlDto.health;

import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigInteger;

@GraphQLType(name = "Block")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BlockDto {

    @GraphQLId
    String id;

    @GraphQLInputField
    String hash;

    @GraphQLInputField
    BigInteger number;
}
