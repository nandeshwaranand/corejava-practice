package solid.dip;

public class SMSNotificationProvider implements NotificationServiceProvider{

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Provider");
    }
}
