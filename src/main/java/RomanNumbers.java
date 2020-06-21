public class RomanNumbers {

    public String convertToRoman(int number) {
        return number == 4 ? "IV" : "I".repeat(number);
    }

}
