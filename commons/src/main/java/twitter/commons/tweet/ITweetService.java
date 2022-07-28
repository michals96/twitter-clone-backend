package twitter.commons.tweet;

import java.util.List;

import twitter.commons.dto.TweetDto;

public interface ITweetService {
    List<TweetDto> findAll();
}
