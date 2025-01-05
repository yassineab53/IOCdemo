package pres;


import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection des dépendances par instanciation statique : cad new : en utilisant new
         */
        DaoImpl d = new DaoImpl();
        //MetierImpl metier=new MetierImpl();
        MetierImpl metier = new MetierImpl(d); // Injection des dépendances via le constructeur
        //metier.setDao(d); //Injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
