package dao;


public class DaoImpl implements IDao{
    @Override
    public double getData(){

        //        Se connecter a la BD recupere la températue

        System.out.println("Version base de donnees");
        double temp=Math.random()*3;
        return temp;
    }
}
