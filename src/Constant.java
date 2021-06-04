import java.util.Observer;

public class Constant<E> extends Expression {

    public E value;

    public Constant(E value) {
        this.value = value;
    }

    public Constant() {
        this.value = null;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public Object evaluate() {
        return this.value;
    }

}
