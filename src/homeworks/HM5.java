package homeworks;

import java.util.Scanner;

public class HM5 {
    public static void main(String[] args) {
        // use not so popular math operation
        /*      Alex is an owner of grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam, that is being
        sold in jars of 1kg or 7kg. Alex sells only full jars
        (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his two hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. Amount of jam should be read from user
        (positive int value). You can assume that there's always enough jam in Alex's shop.
        Your application should print true or false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of jam in kg");
        int amount = scanner.nextInt();

        int jar1  = 7;
        int jar2 = 1;

        int wholejar1 = amount / jar1;
        System.out.println(wholejar1);

        int residualofjar1 = amount % jar1;
       System.out.println(residualofjar1);

        int wholejar2 = residualofjar1 / jar2;
        System.out.println(wholejar2);


        if ((wholejar1 + wholejar2) <= 6){
            System.out.println(true);
       } else {
            System.out.println(false);
       }

    }
}
