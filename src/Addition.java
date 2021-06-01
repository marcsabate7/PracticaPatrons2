public class Addition extends Quantifier {
    public Integer empty() {
        return 0;
    }

    public Integer combine(Integer op1, Integer op2) {
        return op1 + op2;
    }

}
