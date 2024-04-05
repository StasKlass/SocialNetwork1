package org.example;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Message {
    private User sender;
    private String text;
    private LocalDateTime time;
    private HashSet<User> likes;

    public Message(User sender, String text) {
        this.sender = sender;
        this.text = text;
        this.time = LocalDateTime.now();
        this.likes = new HashSet<>();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public HashSet<User> getLikes() {
        return likes;
    }
    public void addLike(User user) {
        likes.add(user);
    }
    public void removeLike(User user){
        likes.remove(user);
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", text='" + text + '\'' +
                ", time=" + time +
                ", likes=" + likes +
                '}';
    }
}
