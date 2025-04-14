package ext;

import Dao.IDao;
import org.springframework.stereotype.Component;

@Component("Dao2")

public class DaoImplv2 implements IDao{

    @Override
    public double getData() {
        System.out.println("version web service");
        double tmp=11;
        return tmp;
    }
}
