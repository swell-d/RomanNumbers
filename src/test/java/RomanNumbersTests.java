import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RomanNumbersTests {
    @Test
    public void shouldCreateNewObject() {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertNotNull(romanNumbers);
    }

    @Test
    public void shouldConvertOne() {
        assertEquals("I", new RomanNumbers().convertToRoman(1));
    }

    @Test
    public void shouldConvertTwo() {
        assertEquals("II", new RomanNumbers().convertToRoman(2));
    }

    @Test
    public void shouldConvertThree() {
        assertEquals("III", new RomanNumbers().convertToRoman(3));
    }

    @Test
    public void shouldConvertFour() {
        assertEquals("IV", new RomanNumbers().convertToRoman(4));
    }

    @Test
    public void shouldConvertFive() {
        assertEquals("V", new RomanNumbers().convertToRoman(5));
    }


}
