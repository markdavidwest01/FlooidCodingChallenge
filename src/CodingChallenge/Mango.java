package CodingChallenge;

public class Mango extends Item{
    //buy one get one (bogo) item
    public Mango(double regularPrice){
        super(regularPrice);
    }

    @Override
    public double getPrice(int quantity){
        if (quantity <= 0){
            return 0;
        }
        return (quantity/2)*regularPrice + (quantity%2)*regularPrice;
    }
}
