package notificationService;

public class UserNotificationService  {
    private Notifier notifier;

    public UserNotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(Notification notification) {
        notifier.notify(notification);
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
}
