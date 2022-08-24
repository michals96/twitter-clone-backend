package twitter.query;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class GetTweetQuery {
    private final String tweetId;
}
