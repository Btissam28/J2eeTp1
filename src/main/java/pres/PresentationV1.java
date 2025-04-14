package pres;

import Dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        //INjection des dépendances par instanciation statique
        DaoImpl d=new DaoImpl();
        MetierImpl metier=new MetierImpl(d);//via constructeur
        //metier.setDao(d); //Injection via setter
        System.out.println("RES="+metier.calcul());
    }
}
