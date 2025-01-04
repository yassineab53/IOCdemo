package metier;


import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;

public class MetierImpl implements IMetier{
    // couplage faible
    private IDao dao = new DaoImplV2();
    @Override
    public double calcul(){
        double t = dao.getData();
        return t;
    }
}
