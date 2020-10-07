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
    private Repository repository;
    @JsonProperty
    private Comment comment;
    @JsonProperty
    private Review review;
}
