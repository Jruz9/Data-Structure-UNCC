package Jan;

import java.util.ArrayList;

public class secondQuestion {
    public void main(String[] arg){
        String letter="anna";
        char[] characterArray=letter.toCharArray();
       // ArrayList<Character> characterArrayList=new ArrayList<Character>();

       int booleanNumber= isPalindromic(characterArray,0,3);

       //should be the oppsite b/c that arguements should be warned first then the char array and finally the results
       if(booleanNumber==1){
           System.out.println("it p");
       }
       else if (booleanNumber==0){
           System.out.println("its not p");
       }
       else if (booleanNumber==-1){
           System.out.println("array is empty");
       }
       else if (booleanNumber==-2){
           System.out.println("StartIndex is less than zero");
       }
       else{
           System.out.println("endIndex is  greater than char array text");
        }
    }

    //- requires three parameter inputs, char array text, int startIndex, and int endIndex
    //- aims at determining whether the given sub-text from startIndex through endIndex is palindromic, with case insensitivity
    //- returns 1 if it is palindromic, 0 if it is not palindromic, -1 if the input char array text is null
    // , -2 if the int startIndex is less than zero, or -3
    // if the int endIndex is greater than the length of the input char array text.


    //A palindrome is
    // a word, number, phrase, or other sequence of characters which reads the
    // same backward as forward, such as madam or racecar.
    public int  isPalindromic(char[] characterArray, int startIndex , int endIndex ){
        // this for loop check half of the arraylist
        //ex: kayak: k=k, a=a so remember that list is half so 5/2=2.5 or 2
        //ex:mom :m=m so 3/2=1.5 or 1
        //Anna : a=a , n=n so 4/2=2


        if(endIndex> characterArray.length){
            return -3;
        }

        if(startIndex<0){
            return -2;
        }


        //this uppercase all letter in the array, just to be save.
        // should be an array when fixed.

        for (int i = 0; i < endIndex; i++) {
            Character upperCaseLetter=Character.toUpperCase(characterArray[i]);
            characterArray[i]=upperCaseLetter;
        }


        Integer reverseCounter=endIndex;
        for (int i = 0; i < endIndex/2; i++,reverseCounter--) {
            if(!(characterArray[i]==characterArray[reverseCounter])){
                return 0;
            }
        }
        return 1;
    }
}
