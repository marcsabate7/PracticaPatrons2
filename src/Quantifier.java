import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class Quantifier<E> extends Expression implements Observer {

    protected List<Expression> subExpressions = new ArrayList<>();

    public void addExpression(Expression<E> expr) {
        this.subExpressions.add(expr);
    }

    public void removeExpression(Expression<E> expr) {
        this.subExpressions.remove(expr);
    }

    @Override
    public E evaluate() {
        boolean pos = true;
        E result = null;
        if (!subExpressions.isEmpty()) {
            for (int i = 0; i < this.subExpressions.size(); i++) {
                if (i + 1 == this.subExpressions.size()) {
                    pos = false;
                } else if (pos) {
                    result = combine(this.subExpressions.get(i).getValue(), this.subExpressions.get(i + 1).getValue());
                    total = combine(total, expresio.evaluate)
                }
            }
            return result;
        }
        return empty();
    }

    @Override
    public void update(Observable o, Object arg) {
        ValueChanged value_returned = (ValueChanged) arg;
        E old_evaluate = evaluate();
        this.subExpressions.remove(value_returned.getOldValue());
        this.subExpressions.add(new Variable(value_returned.getNewValue()));
        E new_evaluate = evaluate();
        if(!new_evaluate.equals(old_evaluate)){
            setChanged();
            notifyObservers();
        }
    }

    public abstract E empty();

    public abstract E combine(Object op1, Object op2);
}
