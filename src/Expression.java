import java.util.Observable;
import java.util.Observer;

public abstract class Expression<E> extends Observable {
     public abstract E evaluate();
}
