package tinkerer.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinkerer.requests.github.prcomment.PrCommentEvent;

@RestController
@RequestMapping("github/hooks")
public class GitHubHooksController {

    @PostMapping("prcomment")
    public String handlePrCommentEvent(@RequestBody PrCommentEvent prCommentEvent) {
        System.out.println(prCommentEvent);
        return "Done";
    }
}
