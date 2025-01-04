import metier.IMetier;
import metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        IMetier v = new MetierImpl();
        System.out.println(v.calcul());
    }
}
