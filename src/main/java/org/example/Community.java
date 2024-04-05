package org.example;

import java.util.HashSet;

public class Community {
    private String name;
    public HashSet<User> members;

    public Community(String name) {
        this.name = name;
        this.members = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getMembers() {
        return members;
    }

    public void addMember(User member) {
        this.members.add(member);
    }
    public void removeMember(User member) {
        this.members.remove(member);
    }

    @Override
    public String toString() {
        return "Community{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}


