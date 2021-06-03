import java.util.Observable;
import java.util.Observer;

public class Client {
    Variable var1 = new Variable(8);
    Constant const1 = new Constant(9);

    public Client(){
    }

    public void main(String[] args){
        var1.addObserver(quantifier);
    }


}
