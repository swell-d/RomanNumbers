import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {

    public String convertToRoman(int number) {

        int modulo = number;


        String result = "";
        Map<Integer, String> correlation = new HashMap<Integer, String>(){{
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};


        int value = 10;

        if (modulo >= value) {
            result += correlation.get(value);
            modulo -= value;
        }


        value = 9;
        if (modulo >= value) {
            result += correlation.get(value);
            modulo -= value;
        }

        value = 5;
        if (modulo >= 5) {
            result += correlation.get(value);
            modulo -= value;
        }

        result += modulo == 4 ? "IV" : "I".repeat(modulo);

        return result;
    }

}
