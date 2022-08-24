package twitter.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class CreateTweetCommand {
    @TargetAggregateIdentifier
    private final String tweetId;
    private final String text;
}
