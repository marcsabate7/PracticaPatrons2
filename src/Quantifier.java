import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class Quantifier<E> extends Expression implements Observer {
    protected List<Expression> subExpressions = new ArrayList<>();

    public void addExpression(Expression<E> expr){
        // Haurem de mirar que no es repeteixin --> tema d'arbre no ho se segur si es necessari
        this.subExpressions.add(expr);

    }

    public void removeExpression(Expression<E> expr){
        this.subExpressions.remove(expr);
    }

    @Override
    public Object evaluate() {
        if (subExpressions.size() == 1){
            return subExpressions.get(0);
        }
        else{
            for(int i = 0; i<subExpressions.size();i++){

            }
        }


        // Hem de evaluar la nova expressió i si el resultat es mes gran que l'anterior notificar
        return null;
    }

    @Override
    public void update(Observable o, Object arg) {
        // agafem la nova subexpressió i cridem al evaluate per comprovar si el resultat final ha cambiat

    }

    public abstract E empty();
    public abstract E combine(E op1, E op2);

}
