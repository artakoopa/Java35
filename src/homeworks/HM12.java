package homeworks;


import java.util.Scanner;

public class HM12 {
    public static void main(String[] args) {

        String y = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine().toLowerCase().trim();

        int l = name.length();

        for (int i = l -1; i>=0; i--){
            y = y + name.charAt(i);
        }
        if (name.equals(y)){
            System.out.println(name + " is a palindrome");

        }else{
            System.out.println(name + " is not palindrome");

        }





    }




}
