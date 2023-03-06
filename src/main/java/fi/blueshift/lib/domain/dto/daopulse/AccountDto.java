package fi.blueshift.lib.domain.dto.daopulse;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class AccountDto extends BaseDto implements Serializable {

    private Long currencyTokenId;

    private Double balance;

    private Double rawBalance;

    private Long walletOwnerId;
}
