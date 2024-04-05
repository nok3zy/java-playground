package io.nok.designpattern.state;

import java.time.ZonedDateTime;

public class DraftState implements MailState {

    public void proceed(Mail mail) {
        ZonedDateTime currentTime = ZonedDateTime.now();
        if (currentTime.isAfter(mail.getScheduledTime())) {
            System.out.println("Mail will be published immediately");
            mail.setMailState(new PublishedState());
            return;
        }

        System.out.println("Mail will be scheduled for publishing");
        mail.setMailState(new ScheduledState());
    }

    public void withdraw(Mail mail) {
        throw new UnsupportedOperationException("Cannot withdraw from draft state");
    }
}
