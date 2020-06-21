import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RomanNumbersTests {

    private RomanNumbers romanNumbers;

    @Before
    public void setUp() throws Exception {
        romanNumbers = new RomanNumbers();
    }

    @Test
    public void shouldCreateNewObject() {
        assertNotNull(romanNumbers);
    }

    @Test
    public void shouldConvertOne() {
        assertEquals("I", romanNumbers.convertToRoman(1));
    }

    @Test
    public void shouldConvertTwo() {
        assertEquals("II", romanNumbers.convertToRoman(2));
    }

    @Test
    public void shouldConvertThree() {
        assertEquals("III", romanNumbers.convertToRoman(3));
    }

    @Test
    public void shouldConvertFour() {
        assertEquals("IV", romanNumbers.convertToRoman(4));
    }

    @Test
    public void shouldConvertFive() {
        assertEquals("V", romanNumbers.convertToRoman(5));
    }

    @Test
    public void shouldConvertSix() {
        assertEquals("VI", romanNumbers.convertToRoman(6));
    }

    @Test
    public void shouldConvertSeven() {
        assertEquals("VII", romanNumbers.convertToRoman(7));
    }

    @Test
    public void shouldConvertEight() {
        assertEquals("VIII", romanNumbers.convertToRoman(8));
    }

    @Test
    public void shouldConvertNine() {
        assertEquals("IX", romanNumbers.convertToRoman(9));
    }

    @Test
    public void shouldConvertTen() {
        assertEquals("X", romanNumbers.convertToRoman(10));
    }

    @Test
    public void shouldConvert15() {
        assertEquals("XV", romanNumbers.convertToRoman(15));
    }

    @Test
    public void shouldConvert39() {
        assertEquals("XXXIX", romanNumbers.convertToRoman(39));
    }


}
