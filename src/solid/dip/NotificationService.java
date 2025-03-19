package solid.dip;

/**
 * Dependency Injection (DI) is a design pattern that allows objects to be injected into a class,
 * rather than the class creating them itself.
 * This promotes loose coupling, making the application more modular, testable, and maintainable.
 * This will resolve the problem of dependency,and dynamically inject the dependency.
 */
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
