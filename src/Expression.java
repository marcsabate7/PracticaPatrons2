import java.util.Observable;
import java.util.Observer;

public abstract class Expression<E> extends Observable {

    private E value;

    abstract public E evaluate();

    public E getValue() {
        return this.value;
    }

}
