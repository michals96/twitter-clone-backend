package twitter.command.aggregate;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import twitter.command.CreateTweetCommand;
import twitter.event.TweetCreatedEvent;

@Aggregate
@Data
@RequiredArgsConstructor
public class TweetAggregate {
    @AggregateIdentifier
    private String tweetId;
    private String text;

    @CommandHandler
    public TweetAggregate(CreateTweetCommand command) {
        // waliduj cos
        AggregateLifecycle.apply(new TweetCreatedEvent(command.getTweetId(), command.getText()));
    }

    @EventSourcingHandler
    public void on(TweetCreatedEvent event) {
        this.tweetId = event.getTweetId();
        this.text = event.getText();
    }
}
