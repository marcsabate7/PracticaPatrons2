public abstract  class Product extends Quantifier{
    public Integer empty() {
        return 1;
    }

    public Integer combine(Integer op1, Integer op2) {
        return op1*op2;
    }
}
