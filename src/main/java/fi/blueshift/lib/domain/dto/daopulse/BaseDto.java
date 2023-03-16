package fi.blueshift.lib.domain.dto.daopulse;

import fi.blueshift.lib.domain.enums.daopulse.DataProviderType;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@SuperBuilder(toBuilder = true)
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BaseDto implements Serializable {


    private static final long serialVersionUID = 5666319876622824350L;

    private Long id;

    //System data
    @ApiModelProperty(notes = "Provider for imported data")
    @NotNull
    private DataProviderType dataProvider;

    @ApiModelProperty(notes = "Last date of imported/updated from market")
    @NotNull
    private LocalDateTime importedAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
