package metier;


import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;

public class MetierImpl implements IMetier{
    // couplage faible
    //depand des interfaces et pas de classe
    //private IDao dao = new DaoImplV2();
    private IDao dao;
    @Override
    public double calcul(){
        double t = dao.getData();
        double res = t*4;
        return res;
    }

    /*
    Injecter dans la variable dao un objet d'une classe qui implemente l'interface IDao
    */
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
