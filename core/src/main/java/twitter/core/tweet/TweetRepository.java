package twitter.core.tweet;

import org.springframework.data.jpa.repository.JpaRepository;

interface TweetRepository extends JpaRepository<Tweet, Long> {
}
