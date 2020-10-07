package tinkerer.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinkerer.requests.github.prReviewComment.PrReviewCommentEvent;
import tinkerer.requests.github.prcomment.PrCommentEvent;

@RestController
@RequestMapping("github/hooks")
public class GitHubHooksController {

    @PostMapping("prcomment")
    public String handlePrCommentEvent(@RequestBody PrCommentEvent prCommentEvent) {
        System.out.println(prCommentEvent);
        return "Done";
    }

    @PostMapping("prReviewComment")
    public String handlePrReviewCommentEvent(@RequestBody PrReviewCommentEvent prReviewCommentEvent) {
        System.out.println(prReviewCommentEvent);
        return "Done";
    }
}
