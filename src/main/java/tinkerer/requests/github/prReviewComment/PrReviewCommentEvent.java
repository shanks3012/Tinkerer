package tinkerer.requests.github.prReviewComment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class PrReviewCommentEvent {
    @JsonProperty
    private String action;
//    @JsonProperty
//    private Pull_Request pull_request;
//    @JsonProperty
//    private Comment comment;
//    @JsonProperty
//    private Respository respository;

}
