package fi.blueshift.lib.domain.dto.daopulse;

import fi.blueshift.lib.domain.enums.daopulse.DAOProposalStateType;
import fi.blueshift.lib.domain.enums.daopulse.DAOProposalStatusType;
import fi.blueshift.lib.domain.enums.daopulse.DAOProposalType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class DAOProposalDto extends BaseDto {


    private static final long serialVersionUID = 7376656867230368923L;

    private String externalGuid;

    private String ipfsId;

    private String externalIndex;

    private String title;

    private String symbol;

    private Long daoId;

    private String daoName;

    private DAOProposalType type;

    private DAOProposalStatusType status;

    private DAOProposalStateType state;

    private String url;

    private String description;

    private List<DAOProposalChoiceDto> choices;

    private LocalDateTime submittedAt;

    private LocalDateTime startVotingAt;

    private LocalDateTime endVotingAt;

    private WalletDto authorWallet;

    private String scoreState;

    private String electionType;

    private String discussion;

    private String network;

    private List<DAOProposalStrategyDto> strategies;

    private List<DAOProposalScoreDto> scores;

    private Double scoresTotal;

    private LocalDateTime scoresUpdatedAt;

    private Double quorumCount;

    private Integer votesCount;

    private List<DAOProposalVoteDto> votes;
}
