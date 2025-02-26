package di;

public class NotificationService {

    private NotificationServiceProvider notificationServiceProvider;

    /**
     * With Constructor Injection, dependencies are provided to a class through its constructor when the object is created.
     * This is the most common form of DI because it makes dependencies clear, mandatory, and immutable after the object is constructed.
     * @param notificationServiceProvider
     */
    NotificationService(NotificationServiceProvider notificationServiceProvider){
        this.notificationServiceProvider = notificationServiceProvider;
    }

    public void sendNotification(){
        this.notificationServiceProvider.sendNotification();
    }
}
