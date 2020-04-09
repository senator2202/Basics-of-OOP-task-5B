package PresentPackage.SweetsPackage;

public class Candy extends Sweets {
    private boolean isChocolate;
    private boolean hasNuts;

    @Override
    public String toString() {
        return "type of sweets: Candy; "+super.toString()+" is chocolate: "+isChocolate+"; has nuts: "+hasNuts;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }


    /**Реализуем паттерн Builder*/
    public static class Builder {
        private Candy candy;

        public Builder() {
            candy=new Candy();
        }

        public Builder withIsChocolate(boolean isChocolate) {
            candy.isChocolate=isChocolate;
            return this;
        }

        public Builder withHasNuts(boolean hasNuts) {
            candy.hasNuts=hasNuts;
            return this;
        }

        public Builder withPrice(int price) {
            candy.setPrice(price);
            return this;
        }

        public Builder withWeight(int weight) {
            candy.setWeight(weight);
            return this;
        }

        public Builder withSugarPercentage(int sugarPercentage) {
            candy.setSugarPercentage(sugarPercentage);
            return this;
        }

        public Candy build(){
            return candy;
        }
    }
}
