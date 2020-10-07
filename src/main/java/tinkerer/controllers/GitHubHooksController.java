package tinkerer.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinkerer.requests.github.prcomment.PrCommentEventRequest;

@RestController
@RequestMapping("github/hooks")
public class GitHubHooksController {

    @PostMapping("prcomment")
    public String handlePrCommentEvent(PrCommentEventRequest prCommentEventRequest) {
        System.out.println(prCommentEventRequest);
        return "Done";
    }
}
