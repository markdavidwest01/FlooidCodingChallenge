package CodingChallenge;

public class Peach extends Item{
    public int saleThreshold;
    //if quantity is greater than or equal to this, then sale price is used, else regular price is used
    //negative means item is not on sale, 0 or 1 means any quantity is on sale
    public double salePrice;

    public Peach(int saleThreshold, double regularPrice, double salePrice){
        super(regularPrice);
        this.saleThreshold = saleThreshold;
        this.salePrice = salePrice;
    }

    @Override
    public double getPrice(int quantity) {
        if (quantity <= 0){
            return 0;
        }
        if (saleThreshold >= 0 && quantity >= saleThreshold){
            return quantity * salePrice;
        }
        return quantity * regularPrice;
    }
}
