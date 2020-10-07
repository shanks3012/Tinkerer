package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Comment {
    @JsonProperty
    private String url;
    //The comment itself
    @JsonProperty
    private String body;
}
