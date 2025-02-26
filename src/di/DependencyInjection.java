package di;

/**
 * Dependency Injection (DI) is a design pattern that allows objects to be injected into a class,
 * rather than the class creating them itself.
 * This promotes loose coupling, making the application more modular, testable, and maintainable.
 */
public class DependencyInjection {

    public static void main(String[] args) {
        EmailNotificationProvider emailNotificationProvider = new EmailNotificationProvider();
        new NotificationService(emailNotificationProvider).sendNotification();

        SMSNotificationProvider smsNotificationProvider = new SMSNotificationProvider();
        new NotificationService(smsNotificationProvider).sendNotification();
    }
}
