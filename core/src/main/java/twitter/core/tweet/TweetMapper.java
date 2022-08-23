package twitter.core.tweet;

import org.mapstruct.Mapper;
import twitter.commons.tweet.dto.TweetDto;

@Mapper(componentModel = "spring")
interface TweetMapper {
    TweetDto toDto(Tweet tweet);
}
