import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Quantifier<E> extends Expression implements Observer {
    protected List<Expression> subExpressions = new ArrayList<>();

    public void addExpression(Expression<E> expr){
        // Haurem de mirar que no es repeteixin --> tema d'arbre
        subExpressions.add(expr);

    }

    public void removeExpression(Expression<E> expr){
        subExpressions.remove(expr);
    }

    @Override
    public Object evaluate() {
        return null;
    }

    public abstract E empty();
    public abstract E combine(E op1, E op2);

}
