package shadok;

public class NumberInShadok {
    // 0 = GA
    // 1 = BU
    // 2 = ZO
    // 3 = MEU
    // 4 = BUGA
    private static String number[] = {"GA", "BU", "ZO", "MEU"};

    public static String shadok(int nb){
        String result = "";
        if (nb > 3){
            result = shadok(nb/4) + number[nb%4];
        } else {
            result = number[nb];
        }
        return result;
    }
}
