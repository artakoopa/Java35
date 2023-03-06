package basics;

import java.sql.SQLOutput;

public class PrintFormating {
    public static void main(String[] args) {

        // s- String
        // d- intiger
        // f - float/double
        // c - char
        // b - boolean

        String name = "Bob";
        int age = 34;

        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("Hello %s your age is %d\n", name, age); // \n nozīmē, ka nākamā souf rindiņa ir  jaunā rindā

        double height = 192.2352534d;
        System.out.printf("%s is %.2f cm tall\n",name, height); // %.2f nozīmē, ka parāda divas zīmes aiz komata

        //Hello Bob your age is 34 and your height is 192..... .Good job Bob!
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$.2f cm. Good job %1s!", name,age,height);





    }
}
