package dao;


public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp= 25;
        return temp;
    }
}
