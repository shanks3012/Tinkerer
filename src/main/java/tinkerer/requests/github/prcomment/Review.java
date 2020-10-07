package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Review {
    @JsonProperty
    private String body;
    @JsonProperty
    private String state;
    @JsonProperty
    private String html_url;
    @JsonProperty
    private String pull_request_url;
}
