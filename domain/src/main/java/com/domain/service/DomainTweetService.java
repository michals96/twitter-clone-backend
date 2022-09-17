package com.domain.service;

import com.domain.model.Tweet;
import com.domain.repository.TweetRepository;

import java.util.UUID;

public class DomainTweetService implements TweetService {
    private final TweetRepository tweetRepository;

    public DomainTweetService(final TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public void addComment(final String comment, final UUID tweetId) {
        final var tweet = getTweet(tweetId);
        tweet.addComment(comment);
        tweetRepository.save(tweet);
    }

    @Override
    public UUID createTweet(final String username, final String text) {
        final var tweet = new Tweet(text, username);
        tweetRepository.save(tweet);
        return tweet.getId();
    }

    private Tweet getTweet(final UUID tweetId) {
        return tweetRepository.findById(tweetId)
                .orElseThrow(() -> new RuntimeException("No tweet found!"));
    }
}
