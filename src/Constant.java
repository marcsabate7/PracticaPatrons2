public abstract class Constant<E> extends Expression {

    private E value;

    public Constant(E value) {
        this.value = value;
    }

    @Override
    public E evaluate() {
        return null;
    }
}
