package twitter.command.handler;

import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;
import twitter.event.TweetCreatedEvent;
import twitter.model.Tweet;
import twitter.repository.TweetRepository;

@Service
@RequiredArgsConstructor
public class TweetCommandHandler {
    private final TweetRepository tweetRepository;

    @EventHandler
    public void on(TweetCreatedEvent event) {
        tweetRepository.save(new Tweet(event.getTweetId(), event.getText()));
    }
}
