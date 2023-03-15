package homeworks;


import java.util.Scanner;

public class HM12 {
    public static void main(String[] args) {

        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine().toLowerCase().trim();

        int l = name.length();

        for (int i = l - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        if (name.equals(reverse)) {
            System.out.println(name + " is a palindrome");

        } else {
            System.out.println(name + " is not palindrome");

        }

        // pasniedzēja solution
        System.out.println("Enter name");
        String input = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }

        }

        if (isPalindrome) {
            System.out.printf("Your input %s is a palindrome \n", input);
        }else {
            System.out.printf("Your input %s is not a palindrome \n", input);
        }


    }

}
