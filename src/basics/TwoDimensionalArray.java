package basics;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {


        //Declaring 2D array with 2 rows and 5 columns
        String[][] dreamCars = new String[2][5];

        dreamCars[0][0] = "Audi";
        dreamCars[0][1] = "BMW";
        dreamCars[0][2] = "Opel";
        dreamCars[0][3] = "Volvo";
        dreamCars[0][4] = "Lamporghini";

        dreamCars[1][0] = "Cupra";
        dreamCars[1][1] = "Ferrari";
        dreamCars[1][2] = "Subaru";
        dreamCars[1][3] = "McLaren";
        dreamCars[1][4] = "Citroen";

        //How many rows are in array
        System.out.println(dreamCars.length);

        //How many columns are in one row
        System.out.println(dreamCars[0].length);

        //i - row
        //j - column

        for (int i = 0; i < dreamCars.length; i++){

            for (int j = 0; j < dreamCars[i].length; j++){
                System.out.print(dreamCars[i][j] + " ");
            }
            System.out.println();
        }

        //Same thing using nested For-each loops
        for(String [] rows: dreamCars){
            for(String car: rows){
                System.out.print(car + " ");
            }
            System.out.println();
        }
    }
}
