package solid.srp;

/**
 * NotificationService sends notifications only.
 */
public class NotificationService {

    public void sendEmailNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
