import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class Quantifier<E> extends Expression implements Observer {

    protected List<Expression> subExpressions = new ArrayList<>();

    public void addExpression(Expression<E> expr) {
        this.subExpressions.add(expr);
        if (expr instanceof Variable){
            ((Variable<E>) expr).addObserver(this);
        }
        else if (expr instanceof Constant){
            ((Constant<E>) expr).addObserver(this);
        }
    }

    public void removeExpression(Expression<E> expr) {
        this.subExpressions.remove(expr);
        expr.deleteObserver(this);
    }

    @Override
    public E evaluate() {
        boolean pos = true;
        E result = empty();
        if (!subExpressions.isEmpty()) {
            for (int i = 0; i < this.subExpressions.size(); i++) {
                if (i + 1 == this.subExpressions.size()) {
                    pos = false;
                } else if (pos) {
                    result = combine(result, this.subExpressions.get(i).evaluate());
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
        removeExpression();

        addExpression(new Variable<>(value_returned.getNewValue()));
        E new_evaluate = evaluate();
        if(!new_evaluate.equals(old_evaluate)){
            setChanged();
            notifyObservers();
        }
    }

    public abstract E empty();

    public abstract E combine(Object op1, Object op2);
}
