package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HM14 {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter price");
     //   float price = scanner.nextFloat();

       // System.out.println("Enter discount");
        //float discount = scanner.nextFloat();

       // printPrice(price, discount);

        discount(100,45);


    }

    //Discount method
   /* public static void printPrice(float price, float discount){
        float finalPrice = 0;

        if (discount <=100 && discount >=0 ) {
            float finalPrice = price * ((100 - discount) * 0.01);
            System.out.printf("discount( %1$.2f, %2$.2f ) ➔ %3$.2f", price, discount, finalPrice);
        }else{
            System.out.println("Invalid discount input");
        }

    }*/

    //pasniedzēja variants
    public static float discount (float price, float discount){
        DecimalFormat df = new DecimalFormat("0.00"); // noapaļo līdz 2 zīmēm aiz komata
        discount /= 100;
        float result = price - (price * discount);
        System.out.println("Special price: " + df.format(result));

        return result;

    }



}
