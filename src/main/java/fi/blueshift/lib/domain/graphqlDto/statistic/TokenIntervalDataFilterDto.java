package fi.blueshift.lib.domain.graphqlDto.statistic;


import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import fi.blueshift.lib.domain.enums.FrequencyIntervalType;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@GraphQLType(name = "TokenIntervalData_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TokenIntervalDataFilterDto {

    String tokenAddress;

    LocalDateTime dateTime_gt;

    LocalDateTime dateTime_lt;

    FrequencyIntervalType interval;

    CryptoNetworkType network;
}
