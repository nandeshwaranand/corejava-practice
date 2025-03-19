package solid.dip;

/**
 * EmailNotificationProvider is tightly coupled to EmailNotificationProvider.
 * If we want to support SMS notifications, we need to modify BankService.
 *
 * To solve the problem we have created new implementation
 * refer @{@link NotificationService}
 */
public class BankServiceDIPViolation {

    EmailNotificationProvider emailNotificationProvider = new EmailNotificationProvider();

    public void notifyToUser(){
        emailNotificationProvider.sendNotification();
    }
}
