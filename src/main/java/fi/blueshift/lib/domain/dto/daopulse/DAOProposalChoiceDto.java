package fi.blueshift.lib.domain.dto.daopulse;

import fi.blueshift.lib.domain.enums.daopulse.DAOProposalChoiceType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class DAOProposalChoiceDto implements Serializable {


    private static final long serialVersionUID = -2885391008621715579L;
    private Integer choiceIndex;

    private String choiceName;

    private DAOProposalChoiceType choiceType;
}
