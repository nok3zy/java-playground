package io.nok.designpattern.templatemethod;

public class Line extends AChatApplication {

    public Line(String username) {
        this.username = username;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("[LINE]" + this.username + " : " + message);
    }
}
