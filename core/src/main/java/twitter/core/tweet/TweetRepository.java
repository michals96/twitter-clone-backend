package twitter.core.tweet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TweetRepository extends JpaRepository<Tweet, Long> {
}
