package io.nok.designpattern.templatemethod;

public abstract class AChatApplication {

    String username;

    public void connectWithFriend(String friend) {
        System.out.println("Connecting with " + friend);
    }

    public abstract void sendMessage(String message);
}
