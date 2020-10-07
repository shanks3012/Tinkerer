package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Issue {
    @JsonProperty
    private String url;
    @JsonProperty
    private String id;
    //Title of the PR
    @JsonProperty
    private String title;
    //PR Review comment
}
