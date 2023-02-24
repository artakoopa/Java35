package basics;

public class Loops {
    public static void main(String[] args) {
        // For loop
        // parādīja "Hello world" 10 reizes pēc kārtas
        for(int i = 0; i < 10; i++){
            System.out.println("Hello world!");
        }

        // parāda skaitļu virki no 1 līdz 10 visus vienā rindā
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i += 2){
            System.out.print(i + " ");
        }

        //While loop lieto, kad nezina, cik reizes vajadzēs atkārtot
        int i = 100;
        while(i <= 10){
            System.out.println("This is While loop " + i);
            i++;
        }

        // Do While loop
        i = 1;
        do {
            System.out.println("This is Do While loop " + i);
            i++;
        } while (i <= 10);


    }
}
