package PresentPackage.SweetsPackage;

public class Lollipop extends Sweets {
    private Taste taste;

    /**Длина палочки*/
    private int stickLength;

    @Override
    public String toString() {
        return "type of sweets: Lollipop; " + super.toString() + " taste: " + taste +
                "; stick length: " + stickLength;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public int getStickLength() {
        return stickLength;
    }

    public void setStickLength(int stickLength) {
        this.stickLength = stickLength;
    }


    /**Реализуем паттерн Builder*/
    public static class Builder {
        private Lollipop lollipop;

        public Builder() {
            lollipop=new Lollipop();
        }

        public Builder withTaste(Taste taste) {
            lollipop.taste=taste;
            return this;
        }

        public Builder withStickLength(int stickLength) {
            lollipop.stickLength=stickLength;
            return this;
        }

        public Builder withPrice(int price) {
            lollipop.setPrice(price);
            return this;
        }

        public Builder withWeight(int weight) {
            lollipop.setWeight(weight);
            return this;
        }

        public Builder withSugarPercentage(int sugarPercentage) {
            lollipop.setSugarPercentage(sugarPercentage);
            return this;
        }

        public Lollipop build(){
            return lollipop;
        }
    }
}
