package fi.blueshift.lib.domain.graphqlDto.explorer;


import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@GraphQLType(name = "Explorer_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExplorerFilterDto {
    String addressId;

    LocalDateTime dateTime_gte;

    Long timestamp_gte;
}
