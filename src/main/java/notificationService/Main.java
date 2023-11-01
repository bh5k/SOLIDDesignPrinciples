package notificationService;

public class Main {
    public static void main(String[] args) {
        UserNotificationService service = new UserNotificationService(new EmailNotifier());

        Notification notification = new EmailNotification();

        service.notifyUser(notification);

        service.setNotifier(new SmsNotifier());

        notification = new SmsNotification();

        service.notifyUser(notification);
    }
}
