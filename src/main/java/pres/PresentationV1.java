package pres;


import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(d);
        System.out.println("RES="+metier.calcul());
    }
}
