package fi.blueshift.lib.domain.dto.daopulse;

import fi.blueshift.lib.domain.enums.daopulse.DataProviderType;
import fi.blueshift.lib.domain.enums.daopulse.SocialProfileType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocialProfileDto implements Serializable {


    private static final long serialVersionUID = -4016479390111191232L;

    private SocialProfileType socialType;

    private String url;

    @ApiModelProperty(notes = "Provider for imported data")
    @NotBlank
    private DataProviderType dataProvider;

    @ApiModelProperty(notes = "Last date of imported/updated from market")
    @NotNull
    private LocalDateTime importedAt;
}
