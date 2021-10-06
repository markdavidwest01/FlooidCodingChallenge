package CodingChallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CodingChallenge {

    public static Peach peach = new Peach(4,0.75,0.50);
    public static Avocado avocado = new Avocado(2.00);
    public static Mango mango = new Mango(2.00);

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(getPrice());
    }

    public static int[] getBasket() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        int[] basket = new int[3];

        basket[0] = Integer.parseInt(scanner.next());
        basket[1] = Integer.parseInt(scanner.next());
        basket[2] = Integer.parseInt(scanner.next());

        return basket;
    }

    public static double getPrice() throws FileNotFoundException {
        return getPrice(getBasket());
    }

    public static double getPrice(int[] basket){
        double price = 0;
        price += peach.getPrice(basket[0]);
        price += avocado.getPrice(basket[1]);
        price += mango.getPrice(basket[2]);
        return price;
    }
}
