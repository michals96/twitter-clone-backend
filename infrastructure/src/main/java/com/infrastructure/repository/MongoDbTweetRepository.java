package com.infrastructure.repository;

import com.domain.model.Tweet;
import com.domain.repository.TweetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@AllArgsConstructor
public class MongoDbTweetRepository implements TweetRepository {
    private final SpringDataMongoTweetRepository tweetRepository;

    @Override
    public Optional<Tweet> findById(UUID id) {
        return tweetRepository.findById(id);
    }

    @Override
    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }
}
