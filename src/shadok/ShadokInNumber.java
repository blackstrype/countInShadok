package shadok;

import java.util.HashMap;
import java.util.Map;

public class ShadokInNumber {

    private static Map<String, Integer> number = new HashMap<String, Integer>();
    static{
        number.put("GA", 0);
        number.put("BU", 1);
        number.put("ZO", 2);
        number.put("MEU", 3);
    }
    public static int shadok(String nb){
        return number.get(nb);
    }
}
