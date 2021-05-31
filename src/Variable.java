public abstract class Variable<E> extends Expression {

    private E value;

    public Variable(E value) {
        this.value = value;
    }

    public void setValue(E newValue) {
        this.value = newValue;
    }

    @Override
    public Object evaluate() {
        return null;
    }
}
