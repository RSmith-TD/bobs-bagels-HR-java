import java.util.ArrayList;
import java.util.List;

public class Baskets {

    protected List<Bagels> bagelsList = new ArrayList<>();
    int maxCapacity;

    public Baskets(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addToBasket(Bagels bagels) {
        this.bagelsList.add(bagels);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getBasketSize() {
        return this.bagelsList.size();
    }
}
