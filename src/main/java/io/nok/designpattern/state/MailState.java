package io.nok.designpattern.state;

public interface MailState {

    void proceed(Mail mail);

    void withdraw(Mail mail);

    default String getStateName() {
        return this.getClass().getSimpleName();
    }
}
