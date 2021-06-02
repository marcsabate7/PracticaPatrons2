public class Variable<E> extends Expression {

    private E value;

    public Variable(E value) {
        this.value = value;
    }

    public void setValue(E newValue) {
        // ABANS DE ENVIAR LA NOTIFICACIÓ HAURIEM DE COMPROVAR QUE EL VALOR DE LA EXPRESSIÓ SHA MODIFICAT
        this.value = newValue;
        setChanged();
        notifyObservers();
    }

    @Override
    public Object evaluate() {
        return this.value;
    }
}
