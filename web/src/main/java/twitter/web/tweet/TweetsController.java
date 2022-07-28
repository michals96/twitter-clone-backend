package twitter.web.tweet;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter.commons.dto.TweetDto;
import twitter.commons.tweet.ITweetService;

@RestController
@RequestMapping(path = "/tweets", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RequiredArgsConstructor
class TweetsController {
    private final ITweetService tweetService;

    @GetMapping
    List<TweetDto> getAll() {
        return tweetService.findAll();
    }
}
