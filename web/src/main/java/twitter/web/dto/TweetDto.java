package twitter.web.dto;

public record TweetDto(String text,
                       String username,
                       String profileImg,
                       String image,
                       String id,
                       String createdAt,
                       String updatedAt,
                       String rev,
                       String type,
                       boolean blockTweet) {
}
