package twitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import twitter.model.Tweet;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, String> {
}
