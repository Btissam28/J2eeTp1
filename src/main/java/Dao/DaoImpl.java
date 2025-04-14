package Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("Dao")
@Repository("Dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de données");
        double tmp=9;
        return tmp;
    }
}
