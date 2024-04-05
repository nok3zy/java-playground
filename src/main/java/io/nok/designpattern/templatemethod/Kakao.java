package io.nok.designpattern.templatemethod;

public class Kakao extends AChatApplication {

    public Kakao(String username) {
        this.username = username;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("[KAKAO]" + this.username + " : " + message);
    }

}
