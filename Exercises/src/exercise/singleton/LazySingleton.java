package exercise.singleton;

/**
 * Created by Alberto on 2015-01-12.
 */
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
