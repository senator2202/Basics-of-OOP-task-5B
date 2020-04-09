package PresentPackage;

import PresentPackage.SweetsPackage.*;

public class Present {
    private Sweets sweets;
    private Package presentPackage;

    public void setSweets(Sweets sweets) {
        this.sweets = sweets;
    }

    public void setPresentPackage(Package presentPackage) {
        this.presentPackage = presentPackage;
    }

    public Sweets getSweets() {
        return sweets;
    }

    public Package getPresentPackage() {
        return presentPackage;
    }

    public static void main(String []args) {
        Sweets sweets=new Candy.Builder()
                .withHasNuts(true)
                .withIsChocolate(true)
                .withPrice(20)
                .withWeight(2000)
                .withSugarPercentage(50)
                .build();
        Package presentPackage=new Package(Package.PackageType.Bag);
        Present present=new Present.Builder()
                .withPackage(presentPackage)
                .withSweets(sweets)
                .build();
        System.out.println(present);

        sweets=new Gum.Builder()
                .withIsBubblePossible(false)
                .withPrice(2)
                .withSugarPercentage(75)
                .withTaste(Taste.Banana)
                .withWeight(5)
                .build();
        present.setSweets(sweets);
        System.out.println(present);

        sweets=new Lollipop.Builder()
                .withPrice(3)
                .withStickLength(10)
                .withSugarPercentage(80)
                .withTaste(Taste.Apple)
                .withWeight(15)
                .build();
        presentPackage.setPackageType(Package.PackageType.Box);
        present.setSweets(sweets);
        present.setPresentPackage(presentPackage);
        System.out.println(present);
    }


    @Override
    public String toString() {
        return sweets+"\n"+presentPackage;
    }

    /**Реализуем паттерн Builder*/
    public static class Builder {
        private Present present;

        public Builder() {
            present=new Present();
        }

        public Builder withSweets(Sweets sweets) {
            present.sweets=sweets;
            return  this;
        }

        public Builder withPackage(Package presentPackage) {
            present.presentPackage=presentPackage;
            return this;
        }

        public Present build() {
            return present;
        }
    }
}
