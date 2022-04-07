import java.util.List;
import java.util.Random;

public class FruitMachine {


    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;

    public FruitMachine() {
        spinner1 = new Spinner();
        spinner2 = new Spinner();
        spinner3 = new Spinner();
    }

    public void spin(){
        spinner1.setRandomSymbol();
        spinner2.setRandomSymbol();
        spinner3.setRandomSymbol();
    }

    public void printSpinners(){
        System.out.println(spinner1.getSymbol());
        System.out.println(spinner2.getSymbol());
        System.out.println(spinner3.getSymbol());
    }


}
