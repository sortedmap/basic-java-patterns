package singleton2;

public enum MailQueue {

    INSTANCE("Some initial info");

    private String info;

    private MailQueue(String info) {
        this.info = info;
    }

    public MailQueue getInstance() {
        return INSTANCE;
    }

    // getters and setters
}
