package notificationService;

public abstract class TypedNotifier <T> {
    abstract void notify(T t);
}
