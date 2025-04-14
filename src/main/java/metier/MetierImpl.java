package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("metier")
@Service("metier")
public class MetierImpl implements IMetier {
    //couplage faible
    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double t = dao.getData();
        double res=t*23;
        return res;
    }

    public MetierImpl() {}
//@Qualifier("Dao") c est pour injecter la vers de bd (spring Annotation si je fais tous les package)
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
