package homeworks;

import java.util.Scanner;

public class HM91 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input tree size ");
        int treeSize = scanner.nextInt();
        int starsCount = 1;


        for (int i = 1; i <= treeSize; i++){  // definē, cik rindiņas būs kopā

            for (int j = treeSize-i; j > 0; j--){ // definē, cik spaces parādīsies katrā rindiņā
                System.out.print(" ");
            }
            for (int k = 1; k <= starsCount; k++){ // definē, cik * parādīsies katrā rindiņā
                System.out.print("*");
            }
            System.out.println();
            starsCount += 2;//katrā nākamajā rindiņā * palielinās
        }

        for (int j = 0; j < treeSize-1; j++){
            System.out.print(" "); // nepieciešamo space skaits līdz sasniedz vidu
        }
        System.out.println("#");


    }
}
