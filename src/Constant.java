public class Constant<E> extends Expression {

    public E value;

    public Constant(E value) {
        this.value = value;
    }

    public Constant() {
        this.value = null;
    }

    @Override
    public Object evaluate() {
        return this.value;
    }

}
