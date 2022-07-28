package twitter.core.tweet;

import java.util.List;

import javax.annotation.PostConstruct;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import twitter.commons.dto.TweetDto;
import twitter.commons.tweet.ITweetService;

@Service
@Slf4j
@RequiredArgsConstructor
class TweetService implements ITweetService {
    private final TweetRepository tweetRepository;
    private final TweetMapper tweetMapper;

    public List<TweetDto> findAll() {
        return tweetRepository.findAll().stream()
            .map(tweetMapper::toDto)
            .toList();
    }

    @PostConstruct
    public void init() {
        Tweet firstTweet = new Tweet(Long.valueOf(1), false, "", "", "", "", "", "", "", "");
        Tweet secondTweet = new Tweet(Long.valueOf(2), false, "", "", "", "", "", "", "", "");

        tweetRepository.save(firstTweet);
        tweetRepository.save(secondTweet);
    }
}
