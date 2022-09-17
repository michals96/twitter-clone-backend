package com.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tweet {
    private String text;
    private String username;
    private List<Comment> comments;
    private String profileImg;
    private String image;
    private UUID id;
    private String createdAt;
    private String updatedAt;
    private String rev;
    private String type;
    private boolean blockTweet;

    public Tweet(String text, String username) {
        this.id = UUID.randomUUID();
        this.text = text;
        this.username = username;
        this.comments = new ArrayList<>();
    }

    public void addComment(final String text) {
        this.comments.add(new Comment(text));
    }

    public UUID getId() {
        return id;
    }
}
