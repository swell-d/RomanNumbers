import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RomanNumbersTests {
    @Test
    public void shouldCreateNewObject() {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertNotNull(romanNumbers);
    }
}
