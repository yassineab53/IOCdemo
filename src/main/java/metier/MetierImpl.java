package metier;


import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;

public class MetierImpl implements IMetier{
    // couplage faible
    //depand des interfaces et pas de classe
    //private IDao dao = new DaoImplV2();
    private IDao dao;

    // Injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao
    //Injection par constructeur
    public MetierImpl(IDao dao){
        this.dao = dao;
    }
    @Override
    public double calcul(){
        double t = dao.getData();
        double res = t*4;
        return res;
    }

    /*
    Injecter dans la variable dao un objet d'une classe qui implemente l'interface IDao
    Injection en utilisant setter
    */
    /*public void setDao(IDao dao){
        this.dao = dao;
    }*/
}
