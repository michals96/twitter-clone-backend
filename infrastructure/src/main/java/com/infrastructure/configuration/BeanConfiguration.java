package com.infrastructure.configuration;

import com.application.Application;
import com.domain.repository.TweetRepository;
import com.domain.service.DomainTweetService;
import com.domain.service.TweetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class BeanConfiguration {

    @Bean
    TweetService tweetService(TweetRepository tweetRepository) {
        return new DomainTweetService(tweetRepository);
    }
}
