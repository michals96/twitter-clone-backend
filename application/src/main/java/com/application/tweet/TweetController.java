package com.application.tweet;

import com.domain.service.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/tweet")
@AllArgsConstructor
public class TweetController {
    private final TweetService tweetService;

    @PostMapping
    UUID createTweet() {
        return tweetService.createTweet("random", "text");
    }

    @PostMapping(value = "/{id}")
    void addComment(@PathVariable String id) {
        tweetService.addComment("Comment", UUID.fromString(id));
    }
}
