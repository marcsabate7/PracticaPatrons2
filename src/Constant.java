public class Constant<E> implements Expression {

    private E value;

    public Constant(E value) {
        this.value = value;
    }

    @Override
    public E evaluate() {
        return null;
    }

}
