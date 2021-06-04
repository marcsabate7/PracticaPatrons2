import java.util.Observer;

public class Variable<E> extends Expression {

    public E value;

    public Variable(E value) {
        this.value = value;
    }

    public Variable() {
        this.value = null;
    }

    public void setValue(E newValue) {
        ValueChanged change = new ValueChanged(this.value,newValue);
        this.value = newValue;
        setChanged();
        notifyObservers(change);
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public Object evaluate() {
        return this.value;
    }
}
