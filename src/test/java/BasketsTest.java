import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

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
    @DisplayName("New bagel in basket")
    public void addingBagelToBasket() {
        Baskets testBasket = new Baskets(5);
        Bagels bagel = new Bagels("BGLO");
        testBasket.addToBasket(bagel,1);
        assertEquals(testBasket.getBasketSize(), 1);
    }

    @Test
    @DisplayName("Removing item from the basket")
    public void removeBagelFromBasket() {
        Baskets testBasket = new Baskets(5);
        Bagels bagel = new Bagels("BGLO");
        testBasket.addToBasket(bagel,1);
        testBasket.removeToBasket(bagel);
        assertEquals(testBasket.getBasketSize(), 0);
    }

//    @Test
//    @DisplayName("Check basket is full")
//    public void checkBasketIsFull() {
//        Baskets testBasket = new Baskets(1);
//        Bagels bagel = new Bagels("BGLO");
//        Bagels bagel2 = new Bagels("BGLP");
//        testBasket.addToBasket(bagel);
//        testBasket.addToBasket(bagel2);
//
//        assertEquals(testBasket.isBasketFull(), true);
//    }

    @Test
    @DisplayName("Adding multiple items")
    public void checkDuplicateItem() {
        Baskets testBasket = new Baskets(20);
        Bagels bagel = new Bagels("BGLP");
        testBasket.addToBasket(bagel,10);
        assertEquals(bagel.getQuantity(), 10);
    }

}
