package fi.blueshift.lib.domain.graphqlDto.statistic;


import io.leangen.graphql.annotations.types.GraphQLType;
import io.swagger.annotations.ApiParam;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@GraphQLType(name = "TotalFactory_filter", isStrictName = true)
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TotalSummaryStatisticFilterDto {

    @ApiParam(name = "dateTime_gt", value = "date to, DateTimeFormat = ISO", example = "2022-03-16T21:34:10.002Z")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime dateTime_gt;

    @ApiParam(name = "dateTime_lt", value = "date from, DateTimeFormat = ISO", example = "2022-03-15T20:34:10.002Z")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime dateTime_lt;
}
