import java.util.Observable;

public class Concat extends Quantifier<String>{

    public String empty() {
        return "";
    }


    public String combine(String op1, String op2) {
        return op1.concat(op2);
    }


    @Override
    public void update(Observable o, Object arg) {

    }
}
