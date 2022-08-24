package twitter.api;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;
import twitter.command.CreateTweetCommand;
import twitter.query.GetTweetQuery;
import twitter.model.Tweet;

@RequestMapping("/tweet")
@AllArgsConstructor
@RestController
public class TweetController {
    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    @PostMapping("/create")
    public CompletableFuture<String> createTweet(@RequestBody Tweet tweet) {
        return commandGateway.send(new CreateTweetCommand(UUID.randomUUID().toString(), tweet.getText()));
    }

    @GetMapping("/{id}")
    public CompletableFuture<Optional<Tweet>> getTweets(@PathVariable String id) {
        return queryGateway.query(new GetTweetQuery(id), ResponseTypes.optionalInstanceOf(Tweet.class));
    }
}
