package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Repo {
    //TODO: There are other repo objects in the payload. Might allow removal of head object. Check later.
    @JsonProperty
    private String name;
}
