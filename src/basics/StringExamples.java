package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//
//        String name = scanner.nextLine().toUpperCase().trim();  /*-trim- removes all empty
//         spaces before or after entered name or sentence*/
//
//        // name == "Bob"
//        if (name.equals("BOB")){
//            System.out.println("Your name is Bob");
//        }else{
//            System.out.println("Your name is not Bob");
//        }

        //Combine string values
        String text1 = "This is ";
        String text2 = "new text";
//                      text1 + text2
        String result = text1.concat(text2); // savieno divus tekstus kopā
        System.out.println(result);
        System.out.println("In this sentence there are " + result.length() + " characters");

        //indexOf
        System.out.println(result.indexOf(" is ")); // atrod, kurā vietā textā ir "is" un izdod ciparu, kurš characters pēc kārtas textā tas ir
        System.out.println(result.indexOf('x'));

        //charAt()
        System.out.println(result.charAt(0)); // Parāda pirmos 4 chracters norādītajā String
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));

        //Replace
        String greetings = "This is holiday time. \nHave a nice holiday";
        System.out.println(greetings.replaceAll("holiday","Easter"));
        System.out.println(greetings.replaceFirst("holiday","Easter"));

        //Substring
        String introduction = "Hello there! My name is Bob and I'm 17";
        System.out.println(introduction.substring(3)); // printed out izalaižot pirmos 3 burtus
        System.out.println(introduction.substring(6,12)); // ja ieraksta divus indexes, tas parāda no līdz, kuru character parādīs
        System.out.println(introduction.length()); // parāda cik daudz characters ir teikumā

        String bobsAge = introduction.substring(introduction.length()-2).trim();// parāda pēdējos divus characters teikumā
        System.out.println("Bob is " + bobsAge + " years old");

        int bobsAgeAsIntiger = Integer.parseInt(bobsAge); // konvertē String to Intiger

        if (bobsAgeAsIntiger >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }

        //Wrapper class - pārvērš no viena datu tipa uz citu
        int temp1 = 36;
        Integer temp2 = 36;

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrvalue = "2.5689732";
        String booleanStringValue = "true";
        String longStrValue = "123451234512345";
        String charStrValue = "c";

        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrvalue);
        boolean booleanValue = Boolean.parseBoolean(booleanStringValue);
        long longValue = Long.parseLong(longStrValue);
        char charValue = charStrValue.charAt(0);




    }
}
