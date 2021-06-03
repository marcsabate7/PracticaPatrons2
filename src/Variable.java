public class Variable<E> extends Expression {

    private E value;

    public Variable(E value) {
        this.value = value;
    }

    public void setValue(E newValue) {
        // Hem de informar al quantifier que sha modificat la variable
        this.value = newValue;
        setChanged();
        notifyObservers();
    }

    @Override
    public Object evaluate() {
        return this.value;
    }
}
