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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    boolean blockTweet;
    private String text;
    private String username;
    private String profileImg;
    private String image;
    private String createdAt;
    private String updatedAt;
    private String rev;
    private String type;
}
