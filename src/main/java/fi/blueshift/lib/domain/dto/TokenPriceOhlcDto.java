package fi.blueshift.lib.domain.dto;

import fi.blueshift.lib.domain.graphqlDto.TokenDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class TokenPriceOhlcDto {
    TokenDto token;
    String tokenAddress;
    BigDecimal open;
    BigDecimal high;
    BigDecimal low;
    BigDecimal close;
    TokenDto quoteToken;
    String quoteTokenAddress;
    LocalDateTime dateTime;
    Long roundedTimestamp;
}
