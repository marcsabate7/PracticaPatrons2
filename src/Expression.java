import java.util.Observable;
import java.util.Observer;

public abstract class Expression<E> implements Observer {
    abstract public E evaluate();

    @Override
    public void update(Observable o, Object arg) {

    }

}
