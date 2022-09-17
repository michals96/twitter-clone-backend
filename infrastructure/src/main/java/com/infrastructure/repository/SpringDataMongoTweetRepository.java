package com.infrastructure.repository;

import com.domain.model.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoTweetRepository extends MongoRepository<Tweet, UUID> {
}
