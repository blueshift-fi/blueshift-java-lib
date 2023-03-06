package fi.blueshift.lib.domain.dto.daopulse;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class DAOProposalScoreDto implements Serializable {
    private static final long serialVersionUID = 9117305552019349739L;

    private String choiceName;

    private Double score;

    private List<DAOProposalScoreStrategyDto> scoresByStrategies;
}
