package io.nok.designpattern.state;

public class ScheduledState implements MailState {

    public void proceed(Mail mail) {
        System.out.println("Mail will be published");
        mail.setMailState(new PublishedState());
    }

    public void withdraw(Mail mail) {
        System.out.println("Mail will be returned to draft state");
        mail.setMailState(new DraftState());
    }
}
