package Jan;

import java.util.Random;

public class firstQuestion {

    public static void main(String[] arg){


        //Declare an 1-D array of 1000 integer elements. Call it “a”.
        //Assign random integer values (between 1 and 10) to those 1000 elements.
        int[] a =new int[1000];
        Random randomNumber= new Random();
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

        for(int i=0;i<a.length;i++){
            int randomNum = randomNumber.nextInt((maximumNumber-minimumNumber)+1)+minimumNumber;
            a[i]=randomNum;
        }

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
        //

        Integer reverseCounter=a.length-1;
        for (int j = 0;j<(a.length)/2; j++,reverseCounter--) {
            int temporaryNumber=a[j];   //stores the first number;
            a[j]=a[reverseCounter]; //replaces first number of array with the final one
            a[reverseCounter]=temporaryNumber;  //replaces last number in array with the first.
        }

        int[] b=new int[1000];
        b=a;    //b array refers to the other array

        System.out.println(a[435]);
        System.out.println(b[435]);




    }


}
