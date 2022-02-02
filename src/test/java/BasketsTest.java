import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketsTest {
    @Test
    @DisplayName("New basket should be empty")
    public void newBasketEmptyTest() {
        Baskets testBasket = new Baskets(5);
        assertEquals(0, testBasket.getBasketSize());
    }

    @Test
    @DisplayName("New basket max capacity")
    public void newBasketCapacityTest() {
        int input = 5;
        Baskets testBasket = new Baskets(input);
        assertEquals(input, testBasket.getMaxCapacity());
    }

    @Test
    @DisplayName("Test")
    public void addingBagelToBasket() {
        Baskets testBasket = new Baskets(5);
        // Bagels bagel = new Bagels();

        // assertEquals();
    }
}
