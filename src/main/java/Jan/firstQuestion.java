package Jan;

import java.util.Random;

public class firstQuestion {

    public static void main(String[] arg){


        int[] a =new int[1000]; //creates the array of ints
        
        Random randomNumber= new Random();  //uses the random class for random
        //sets the range for the random class
        Integer minimumNumber=0;
        Integer maximumNumber=10;

        int frequencyNumberOne=0;
        int frequencyNumberTwo=0;
        int frequencyNumberThree=0;
        int frequencyNumberFour=0;
        int frequencyNumberFive=0;
        int frequencyNumberSix=0;
        int frequencyNumberSeven=0;
        int frequencyNumberEight=0;
        int frequencyNumberNine=0;
        int frequencyNumberTen=0;

        //Creates a random number from 1-10 in the array;
        for(int i=0;i<a.length;i++){
            int randomNum = randomNumber.nextInt((maximumNumber-minimumNumber)+1)+minimumNumber;
            a[i]=randomNum;
        }

        //adds one for each occurrence of each number in the array
        for (int i : a) {
            if (i == 1) {
                frequencyNumberOne++;
            } else if (i == 2) {
                frequencyNumberTwo++;
            } else if (i == 3) {
                frequencyNumberThree++;
            } else if (i == 4) {
                frequencyNumberFour++;
            } else if (i == 5) {
                frequencyNumberFive++;
            } else if (i == 6) {
                frequencyNumberSix++;
            } else if (i == 7) {
                frequencyNumberSeven++;
            } else if (i == 8) {
                frequencyNumberEight++;
            } else if (i == 9) {
                frequencyNumberNine++;
            } else {
                frequencyNumberTen++;
            }


        }
        // prints the occurrence of each number in the array
        System.out.println("freq of 1 = "+frequencyNumberOne);
        System.out.println("freq of 2 = "+frequencyNumberTwo);
        System.out.println("freq of 3 = "+frequencyNumberThree);
        System.out.println("freq of 4 = "+frequencyNumberFour);
        System.out.println("freq of 5 = "+frequencyNumberFive);
        System.out.println("freq of 6 = "+frequencyNumberSix);
        System.out.println("freq of 7 = "+frequencyNumberSeven);
        System.out.println("freq of 8 = "+frequencyNumberEight);
        System.out.println("freq of 9 = "+frequencyNumberNine);
        System.out.println("freq of 10 = "+frequencyNumberTen);


        //reverses array
        int reverseCounter=a.length-1;
        for (int j = 0;j<(a.length)/2; j++,reverseCounter--) {
            int temporaryNumber=a[j];   //stores the first number;
            a[j]=a[reverseCounter]; //replaces first number of array with the final one
            a[reverseCounter]=temporaryNumber;  //replaces last number in array with the first.
        }

        int[] b;
        b=a;    //b array refers to the other array
        System.out.println(b[1]);

    }


}
