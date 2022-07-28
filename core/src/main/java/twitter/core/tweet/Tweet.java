package twitter.core.tweet;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tweet")
class Tweet {
    boolean blockTweet;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String text;
    private String username;
    private String profileImg;
    private String image;
    private String createdAt;
    private String updatedAt;
    private String rev;
    private String type;
}
