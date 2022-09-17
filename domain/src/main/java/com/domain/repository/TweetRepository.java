package com.domain.repository;

import com.domain.model.Tweet;

import java.util.Optional;
import java.util.UUID;

public interface TweetRepository {
    Optional<Tweet> findById(final UUID id);

    void save(Tweet tweet);
}
