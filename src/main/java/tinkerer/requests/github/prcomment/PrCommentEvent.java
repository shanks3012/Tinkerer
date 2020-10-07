package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class PrCommentEvent {
    @JsonProperty
    private String action;
    @JsonProperty
    private Changes changes;
    @JsonProperty
    private Issue issue;
    @JsonProperty
    private String Repository;
}
