import java.util.Random;

public class Spinner {

    private Symbols symbol;

    public void setRandomSymbol(){
        int spin = new Random().nextInt(3);
        symbol = Symbols.values()[spin];
    }

    public Symbols getSymbol() {
        return symbol;
    }
}
