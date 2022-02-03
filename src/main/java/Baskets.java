import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baskets {

    protected List<Bagels> bagelsList = new ArrayList<>();
    int maxCapacity;

    public Baskets(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addToBasket(Bagels bagels, int quant) {
        bagels.setQuantity(quant);
        this.bagelsList.add(bagels);
    }

    public void removeToBasket(Bagels bagels){ this.bagelsList.remove(bagels);}

    public boolean isBasketFull(){
        return bagelsList.size() >= maxCapacity;
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
