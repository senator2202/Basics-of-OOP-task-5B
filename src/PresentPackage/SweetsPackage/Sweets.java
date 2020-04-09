package PresentPackage.SweetsPackage;

import PresentPackage.Package;
import PresentPackage.Present;

public class Sweets {
    private int price;
    private int weight;
    private int sugarPercentage;

    public Present packSweets(Package presentPackage) {
        Present present=new Present.Builder()
                .withPackage(presentPackage)
                .withSweets(this)
                .build();
        return present;
    }

    @Override
    public String toString() {
        return "price: "+price+"; weight: "+weight+"; sugar percentage: "+sugarPercentage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarPercentage() {
        return sugarPercentage;
    }

    public void setSugarPercentage(int sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }
}
