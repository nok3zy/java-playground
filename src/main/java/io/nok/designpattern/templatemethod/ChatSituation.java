package io.nok.designpattern.templatemethod;

public class ChatSituation {

    public void occur() {
        AChatApplication kakao = new Kakao("nok");
        AChatApplication line = new Line("nok");

        kakao.connectWithFriend("friend");
        line.connectWithFriend("friend");

        kakao.sendMessage("Hello");
        line.sendMessage("Hello");
    }

}
