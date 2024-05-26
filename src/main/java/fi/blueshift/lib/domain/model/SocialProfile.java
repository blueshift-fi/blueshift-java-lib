package fi.blueshift.lib.domain.model;

import fi.blueshift.lib.domain.enums.SocialProfileType;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SocialProfile implements Serializable {

    private static final long serialVersionUID = 9059205489047522679L;

    private SocialProfileType socialType;

    private String url;
}