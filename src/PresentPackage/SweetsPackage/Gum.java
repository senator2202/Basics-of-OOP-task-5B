package PresentPackage.SweetsPackage;

public class Gum extends Sweets {
    private Taste taste;

    /**Возможно ли надуть пузырь*/
    private boolean isBubblePossible;

    @Override
    public String toString() {
        return "type of sweets: Gum; "+super.toString()+" taste: "+taste+
                "; is bubbles possible: "+isBubblePossible;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public boolean isBubblePossible() {
        return isBubblePossible;
    }

    public void setBubblePossible(boolean bubblePossible) {
        isBubblePossible = bubblePossible;
    }


    /**Реализуем паттерн Builder*/
    public static class Builder {
        private Gum gum;

        public Builder() {
            gum=new Gum();
        }

        public Builder withTaste(Taste taste) {
            gum.taste=taste;
            return this;
        }

        public Builder withIsBubblePossible(boolean isBubblePossible) {
            gum.isBubblePossible=isBubblePossible;
            return this;
        }

        public Builder withPrice(int price) {
            gum.setPrice(price);
            return this;
        }

        public Builder withWeight(int weight) {
            gum.setWeight(weight);
            return this;
        }

        public Builder withSugarPercentage(int sugarPercentage) {
            gum.setSugarPercentage(sugarPercentage);
            return this;
        }

        public Gum build(){
            return gum;
        }
    }
}
