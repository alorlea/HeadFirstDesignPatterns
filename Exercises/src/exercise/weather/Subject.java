package exercise.weather;

/**
 * Created by alberto on 2014-09-18.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
