package exercise.adapter;

/**
 * Created by Alberto on 2015-01-13.
 */
public class TurkeyAdapter implements DuckInterface {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
