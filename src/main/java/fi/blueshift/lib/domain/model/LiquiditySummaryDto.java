package fi.blueshift.lib.domain.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table //used in order to use as repository response result
public class LiquiditySummaryDto {

    //if amount is positive, then it's deposit event
    //if amount is negative, then it's withdraw event
    @Column("amount_usd")
    BigDecimal amountUSD;

    @Column("date_time")
    LocalDateTime dateTime;

    public LiquiditySummaryDto(BigDecimal amount) {
        this.amountUSD = amount;
        this.dateTime = LocalDateTime.now();
    }
}
