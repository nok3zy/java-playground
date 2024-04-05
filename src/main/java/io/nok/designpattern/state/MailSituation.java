package io.nok.designpattern.state;

import java.time.ZonedDateTime;

public class MailSituation {

    public void occur() {
        publishMailAtScheduledTime();
    }

    private void publishMailImmediately() {
        Mail mail = new Mail("nok", "this is top secret", "1md4ocpazl1m4psd");
        System.out.println("Mail is drafted. State : " + mail.getState());

        mail.proceedNextStep();
        System.out.println("Mail is published. State : " + mail.getState());
    }

    private void publishMailAtScheduledTime() {
        Mail mail = new Mail("nok", "this is top secret", "1md4ocpazl1m4psd");
        System.out.println("Mail is drafted. State : " + mail.getState());

        mail.setScheduledTime(ZonedDateTime.now().plusMinutes(1));
        System.out.println("Mail is scheduled to be published at " + mail.getScheduledTime());

        mail.proceedNextStep();
        System.out.println("Mail is scheduled. State : " + mail.getState());

        mail.proceedNextStep();
        System.out.println("Mail is published. State : " + mail.getState());
    }

}
