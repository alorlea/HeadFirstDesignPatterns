package exercise.singleton;

/**
 * Created by Alberto on 2015-01-12.
 */
public class EagerSingleton {
    //Creation at runtime, on loading
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return singleton;
    }
}
