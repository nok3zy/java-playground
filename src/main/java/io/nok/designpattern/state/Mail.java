package io.nok.designpattern.state;

import java.time.ZonedDateTime;

public class Mail {

    private MailState mailState = new DraftState();
    private String recipient;
    private String title;
    private String content;
    private ZonedDateTime scheduledTime = ZonedDateTime.now();

    public void setMailState(MailState mailState) {
        this.mailState = mailState;
    }

    public void proceedNextStep() {
        mailState.proceed(this);
    }

    public void withdrawStep() {
        mailState.withdraw(this);
    }

    public void setScheduledTime(ZonedDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getState() {
        return mailState.getStateName();
    }

    public ZonedDateTime getScheduledTime() {
        return scheduledTime;
    }

    public Mail(String recipient,
                String title,
                String content) {
        this.recipient = recipient;
        this.title = title;
        this.content = content;
    }
}
