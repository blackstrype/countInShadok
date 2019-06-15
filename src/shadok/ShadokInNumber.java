package shadok;

import java.util.HashMap;
import java.util.Map;

public class ShadokInNumber {

    private static Map<String, Integer> number = new HashMap<String, Integer>();

    static {
        number.put("GA", 0);
        number.put("BU", 1);
        number.put("ZO", 2);
        number.put("MEU", 3);
    }

    public static double shadok(String nb) {
        double result = 0;
        int size = nb.length();
        int nbInTrash = 0;
        if (size <= 3) {
            return number.get(nb);
        } else {
            while (size > 3) {
                if (nb.substring(size - 2).equals("EU")) {
                    double nbShadok = shadok(nb.substring(size - 3,size));
                    double base = Math.pow(4, nbInTrash);
                    double multiplication = nbShadok * base;
                    result = result + multiplication ;
                    size = size - 3;
                } else {
                    result = result + shadok(nb.substring(size - 2,size)) * (Math.pow(4, nbInTrash));
                    size = size - 2;
                }
                nbInTrash = nbInTrash + 1;
            }
            double nbShadok = shadok(nb.substring(0, size));
            double base = Math.pow(4, nbInTrash);
            double multiplication = nbShadok * base;
            result = result + multiplication;
        }
        return result;
    }

    /*
       1         0
      BU        MEU
      1*4^1 + 3*4^0
      4     + 3

     0 = GA     4 = BUGA    8  = ZOGA   12 = MEUGA      16 = BUGAGA
     1 = BU     5 = BUBU    9  = ZOBU   13 = MEUBU      17 = BUGABU
     2 = ZO     6 = BUZO    10 = ZOZO   14 = MEUZO      18 = BUGAZO
     3 = MEU    7 = BUMEU   11 = ZOMEU  15 = MEUMEU     19 = BUGAMEU

      2      1        0
     BU     GA       GA
     1*4^2 + 0*4^1 +  0*4^0
      16   +   0    +   0
    */
}
