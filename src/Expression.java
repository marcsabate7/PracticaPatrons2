import java.util.Observable;
import java.util.Observer;

public abstract class Expression<E> extends Observable {

     public Expression(Constant<E> cons){

     }

     public Expression(Variable<E> var){

     }
     public abstract E evaluate();
}
