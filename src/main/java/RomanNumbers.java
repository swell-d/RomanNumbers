import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumbers {

    private Map<Integer, String> correlation = new LinkedHashMap<Integer, String>(){{
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public String convertToRoman(int number) {
        String result = "";
        for (Map.Entry<Integer, String> entry : correlation.entrySet()) {
            if (number >= entry.getKey()) {
                result += correlation.get(entry.getKey()).repeat((int)(number / entry.getKey()));
                number -= entry.getKey();
            }
        }
        return result;
    }

}
