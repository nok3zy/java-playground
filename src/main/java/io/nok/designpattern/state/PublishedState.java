package io.nok.designpattern.state;

public class PublishedState implements MailState {
    public void proceed(Mail mail) {
        throw new UnsupportedOperationException("Cannot proceed from published state");
    }

    public void withdraw(Mail mail) {
        throw new UnsupportedOperationException("Cannot withdraw from published state");
    }

}
