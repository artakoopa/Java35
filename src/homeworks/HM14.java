package homeworks;

import java.util.Scanner;

public class HM14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price");
        float price = scanner.nextFloat();

        System.out.println("Enter the discount");
        float discount = scanner.nextFloat();

        printPrice(price, discount);


    }

    //Discount method
    public static void printPrice(float price, float discount){
        if (discount <=100 && discount >=0 ) {
            float finalPrice = Math.round((price * ((100 - discount) * 0.01)));
            System.out.printf("discount( %1$.2f, %2$.2f ) ➔ %3$.2f", price, discount, finalPrice);
        }else{
            System.out.println("Invalid discount input");
        }

    }


}
