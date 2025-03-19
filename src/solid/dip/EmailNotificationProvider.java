package solid.dip;

public class EmailNotificationProvider implements NotificationServiceProvider{

    @Override
    public void sendNotification() {
        System.out.println("Email Notification Provider");
    }
}
