public class RomanNumbers {

    public String convertToRoman(int number) {

        String result = "";

        String roman = "X";
        int value = 10;
        if (number >= value) {
            result += roman;
            number -= value;
        }

        roman = "IX";
        value = 9;
        if (number >= value) {
            result += roman;
            number -= value;
        }

        if (number >= 5) {
            result += "V";
            number -= 5;
        }

        result += number == 4 ? "IV" : "I".repeat(number);

        return result;
    }

}
