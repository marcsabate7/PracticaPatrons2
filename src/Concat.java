public class Concat extends Quantifier {

    public String empty() {
        return "";
    }

    public String combine(String op1, String op2) {
        return op1.concat(op2);
    }
}
