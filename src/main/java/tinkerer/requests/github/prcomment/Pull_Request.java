package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Pull_Request {
    @JsonProperty
    private String url;
    @JsonProperty
    private String id;
    //Title of the PR
    @JsonProperty
    private String title;
    //PR Review comment
    @JsonProperty
    private String body;
    //Url to single review comment
    @JsonProperty
    private String review_comment_url;
    //Contains Repo information (if tagging story with repo name to distinguish events across multiple repos)
    @JsonProperty
    private Head head;
}
