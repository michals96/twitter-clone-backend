package twitter.web.api;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter.web.dto.TweetDto;

@RestController
@RequestMapping(path = "/tweets", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
class TweetsController {
    @GetMapping
    List<TweetDto> getAll() {
        return null;
    }
}
