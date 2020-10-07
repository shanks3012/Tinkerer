package tinkerer.requests.github.prcomment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Repository {
    @JsonProperty
    private String name;
}
