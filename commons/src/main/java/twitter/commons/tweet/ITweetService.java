package twitter.commons.tweet;

import java.util.List;

import twitter.commons.tweet.dto.TweetDto;

public interface ITweetService {
    List<TweetDto> findAll();
}
