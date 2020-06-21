public class RomanNumbers {

    public String convertToRoman(int number) {

        String result = "";

        if (number >= 9) {
            result += "IX";
            number -= 9;
        }

        if (number >= 5) {
            result += "V";
            number -= 5;
        }

        result += number == 4 ? "IV" : "I".repeat(number);

        return result;
    }

}
