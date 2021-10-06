package CodingChallenge;

public abstract class Item {
    protected double regularPrice;

    protected Item(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getPrice(int quantity){
        if (quantity <= 0){
            return 0;
        }
        return quantity * regularPrice;
    }
}
