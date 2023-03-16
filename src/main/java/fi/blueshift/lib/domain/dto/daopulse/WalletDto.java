package fi.blueshift.lib.domain.dto.daopulse;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class WalletDto extends BaseDto implements Serializable {


    private static final long serialVersionUID = -8033241909075201075L;

    private Long id;

    List<AccountDto> accountList;
    private CryptoAddressDto cryptoAddress;
    private Long daoHolderId;
    private Long daoHolderName;
    private Long userHolderCoreId;
    private Long userHolderUsername;
    private Long currencyTokenId;
    private String currencyTokenSymbol;
    private Double totalEstimatedBalance;
}
