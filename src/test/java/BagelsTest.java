import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;

public class BagelsTest {
    @Test
    @DisplayName("Bagel makes bagel")
    public void newBagelTest() {
        Bagels testBagel = new Bagels("BGLP");

        assertEquals("BGLP", testBagel.getSKU());
    }

    @Test
    @DisplayName("Bagel price defaults to 1")
    public void newBagelPriceTest() {
        Bagels testBagels = new Bagels("BGLP");

        assertEquals(1f, testBagels.getPrice());
    }


}
