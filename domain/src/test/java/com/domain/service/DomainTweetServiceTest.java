package com.domain.service;

import com.domain.model.Tweet;
import com.domain.repository.TweetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class DomainTweetServiceTest {
    private TweetRepository tweetRepository;
    private DomainTweetService domainTweetService;

    @BeforeEach
    void setUp() {
        tweetRepository = mock(TweetRepository.class);
        domainTweetService = new DomainTweetService(tweetRepository);
    }

    @Test
    void shouldCreateTweetAndSave() {
        final var id = domainTweetService.createTweet("random", "username");

        verify(tweetRepository).save(any(Tweet.class));
        assertNotNull(id);
    }

}