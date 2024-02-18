package pres;

import dao.DaoImpl;
import metier.MetierImpl;

/**
 * @author mohamedyoussfi
 **/
public class Pres {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());
    }
}
