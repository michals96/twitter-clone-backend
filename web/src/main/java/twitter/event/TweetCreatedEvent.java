package twitter.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TweetCreatedEvent {
    private String tweetId;
    private String text;
}
