package singleton;

public final class MailQueue {
    private static MailQueue instance;

    private MailQueue() {}

    public static synchronized MailQueue getInstance() {
        if (instance == null) {
            instance = new MailQueue();
        }
        return instance;
    }
}