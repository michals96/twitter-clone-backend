package com.infrastructure.configuration;

import com.infrastructure.repository.SpringDataMongoTweetRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoTweetRepository.class)
public class MongoDBConfiguration {
}
