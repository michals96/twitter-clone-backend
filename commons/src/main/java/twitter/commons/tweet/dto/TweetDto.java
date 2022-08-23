package twitter.commons.tweet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TweetDto {
    private Long id;
    boolean blockTweet;
    private String text;
    private String username;
    private String profileImg;
    private String image;
    private String createdAt;
    private String updatedAt;
    private String rev;
    private String type;
}
