package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class SocialNetwork {
    private HashMap<Integer, User> users;
    private HashMap<String, Community> communities;

    public SocialNetwork() {
        this.users = new HashMap<>();
        this.communities = new HashMap<>();
    }

    public User createUser(String name){

           int id = users.size() + 1;
        User user = new User(name, id);
        users.put(id,user);
        return user;
    }
    public void removeUser(User user){
        users.remove(user.getId());
    }
    public Community createCommunity(String name){
        Community community = new Community(name);
        communities.put(name, community);
        return community;
    }
    public void removeCommunity(String name){
        communities.remove(name);
    }
    public User searchUser(String name){
        for (User user : users.values()){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    public Community searchCommunity(String name){
        for (Community community : communities.values()){
            if (community.getName().equals(name)){
                return community;
            }
        }
        return null;
    }

    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public HashMap<String, Community> getCommunities() {
        return communities;
    }
}
