public class RomanNumbers {

    public String convertToRoman(int number) {

        String result = "";

        if (number == 5) {
            result = "V";
        } else {
            result = number == 4 ? "IV" : "I".repeat(number);
        }

        return result;
    }

}
