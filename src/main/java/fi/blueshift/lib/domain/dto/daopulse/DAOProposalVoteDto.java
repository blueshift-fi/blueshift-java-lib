package fi.blueshift.lib.domain.dto.daopulse;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(of = {"proposalExternalGuid", "selectedChoiceIndex", "selectedChoice"})
@SuperBuilder
@Getter
@Setter
public class DAOProposalVoteDto extends BaseDto {

    private static final long serialVersionUID = -8943341520383512994L;

    private String externalGuid;

    private String externalRawGuid;

    private String ipfsId;

    private WalletDto voterWallet;

    private Integer selectedChoiceIndex;

    private String selectedChoice;

    private Double votingTokenCount;

    private List<DAOProposalScoreStrategyDto> votingTokenCountStrategy;

    private String votingState;

    Object metadata;

    private LocalDateTime votedAt;

    private Long proposalId;

    private String proposalExternalGuid;
}
