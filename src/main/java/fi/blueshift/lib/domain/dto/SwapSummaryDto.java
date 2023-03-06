package fi.blueshift.lib.domain.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table //used in order to use as repository response result
public class SwapSummaryDto {

    @Column("volume_base")
    BigDecimal volumeBase;

    @Column("volume_usd")
    BigDecimal volumeUSD;

    @Column("fee_base")
    BigDecimal feeBase;

    @Column("fee_usd")
    BigDecimal feeUSD;
}
