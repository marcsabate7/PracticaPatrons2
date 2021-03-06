import java.util.Observable;

public class Max extends Quantifier<Integer>{

    public Integer empty() {
        return Integer.MIN_VALUE;
    }

    public Integer combine(Object op1, Object op2) {
        return Math.max(op1, op2);
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
