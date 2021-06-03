import java.util.Observable;

public class Addition extends Quantifier<Integer> {

    public Integer empty() {
        return 0;
    }

    public Integer combine(Object op1, Object op2) {
        return op1 + op2;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
