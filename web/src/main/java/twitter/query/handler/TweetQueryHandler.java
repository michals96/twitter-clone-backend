package twitter.query.handler;

import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;
import twitter.query.GetTweetQuery;
import twitter.model.Tweet;
import twitter.repository.TweetRepository;

@Service
@RequiredArgsConstructor
public class TweetQueryHandler {
    private final TweetRepository tweetRepository;

    @QueryHandler
    public Optional<Tweet> getTweets(GetTweetQuery query) {
        return tweetRepository.findById(query.getTweetId());
    }
}
