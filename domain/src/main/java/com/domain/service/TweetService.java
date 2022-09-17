package com.domain.service;

import java.util.UUID;

public interface TweetService {
    void addComment(final String comment, final UUID tweetId);

    UUID createTweet(final String username, final String text);
}
