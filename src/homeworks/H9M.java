package homeworks;

import java.util.Scanner;

public class H9M {
    public static void main(String[] args) {
        // nested loop, spaces before star symbol+ some amount of stars, 25-30 linijas viss uzdevums var aiņemt

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input tree size ");
        int treeSize = scanner.nextInt();


        int x = (treeSize-1)*2+1; // aprēķina * skaitu pēdējai rindai
        int y = (x-1)/2; // aprēķina space skaitu pirmajai rindai
        int z = 1;


       for (int i = 0; i < treeSize; i++){ // definē cik rindiņas būs kopā

           for (int j = 0; j <= y; j++){ // definē, cik spaces parādīsies
               System.out.print(" ");
          }
           for (int k = 0; k<z; k++){ // definē, cik * parādīsies
               System.out.print("*");
           }
           System.out.println();
           y--; // katrā nākamajā rindiņā space skaits samazinās
           z+=2; // katrā nākamajā rindiņā * palielinās

        }
        for (int j = 0; j<=x/2; j++){
            System.out.print(" "); // nepieciešamo space skaits līdz sasniedz vidu
        }
        System.out.println("#");
    }
}
