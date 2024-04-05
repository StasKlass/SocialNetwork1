package org.example;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();

        User user1 = socialNetwork.createUser("Stanislav");
        User user2 = socialNetwork.createUser("Vadim");
        User user3 = socialNetwork.createUser("Anatoliy");

        user1.addFriend(user2);
        user1.addFriend(user3);
        user2.addFriend(user3);

        System.out.println("Друзья пользователя " + user1.getName() + ":");
        for (User friend : user1.getFriendList()) {
            System.out.println("- " + friend.getName());
        }
        Message message = new Message(user1, "6 часов чтобы написать все это...");
        message.addLike(user2);
        message.addLike(user3);
        System.out.println(message.toString());
        Community community = socialNetwork.createCommunity("SOMNIUM");
        community.addMember(user1);
        community.addMember(socialNetwork.searchUser("Vadim"));
        community.addMember(user3);
        community.addMember(user3);
        System.out.println(socialNetwork.searchCommunity("SOMNIUM"));
    }
}