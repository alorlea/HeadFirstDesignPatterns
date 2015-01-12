package exercise.singleton;

/**
 * Created by Alberto on 2015-01-12.
 */
public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton singleton;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckedSingleton.class){
                if(singleton==null){
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }
}
