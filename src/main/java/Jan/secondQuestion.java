package Jan;

public class secondQuestion {
    public  static void main(String[] arg){
        String letter="anna";   // the word that test the if it is palindromic.
        char[] characterArray=letter.toCharArray();
        //calls the method to check if it is palindromic with 3 arguments.
       int booleanNumber= isPalindromic(characterArray,0,3);

       if(booleanNumber==-3){
           System.out.println("endIndex is  greater than char array text");
       }
       else if (booleanNumber==-2){
           System.out.println("startIndex is less than zero");

       }
       else if (booleanNumber==-1){
           System.out.println("array is empty");
       }
       else if (booleanNumber==0){
           System.out.println("its not palindromic");

       }
       else{
           System.out.println("it palindromic ");
        }
    }



    //A palindrome is
    // a word, number, phrase, or other sequence of characters which reads the
    // same backward as forward, such as madam or racecar.
    public static int  isPalindromic(char[] characterArray, int startIndex , int endIndex ){
        //ex: kayak: k=k, a=a so remember that list is half so 5/2=2.5 or 2
        //ex:mom :m=m so 3/2=1.5 or 1
        //Anna : a=a , n=n so 4/2=2
        int reverseCounter=endIndex;

        if(endIndex> characterArray.length){
            return -3;
        }

        if(startIndex<0){
            return -2;
        }


        //this uppercase all letter in the array
        for (int i = 0; i <= endIndex; i++) {
            Character upperCaseLetter=Character.toUpperCase(characterArray[i]);
            characterArray[i]=upperCaseLetter;
        }

        //checks if the string is palindromic
        for (int j = startIndex; j < endIndex/2; j++,reverseCounter--) {
            if((characterArray[j]!=characterArray[reverseCounter])){
                return 0;
            }
        }

        return 1;
    }
}
