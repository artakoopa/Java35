package homeworks;

import java.util.Arrays;

public class HM10 {
    public static void main(String[] args) {

       int [] myArray = {1,2,3,4,5,6,20,7,8,9,10,11,12};
        System.out.println("Original array: " + Arrays.toString(myArray));


        for (int i = 0; i < myArray.length/2; i++){
            int j = myArray[i]
            myArray [i] = myArray[myArray.length - i - 1];
            myArray[myArray.length -i - 1] = j;
        }

        System.out.println("Reverse array :" + Arrays.toString(myArray));




    }
}
