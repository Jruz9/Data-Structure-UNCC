package Jan;

import java.util.ArrayList;

public class HarryPotter {

    public static void main(String[] arg)
    {
        ArrayList<String>reverseArray;
        try {
            reverseArray=reverse(new String[]{"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"});
            System.out.println(reverseArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //If the given name list is empty, there would be something wrong, indicating an exception or accident.
    //  reverse containing
    //  "Hermione Jean Granger" as the first element, "Ronald Bilius" as the second element, and
    //  "Harry Potter" as the third element.
    private static ArrayList<String> reverse(String[] wizards) throws Exception {
        ArrayList<String> reverseNameArray=new ArrayList<>();
        for (int i =wizards.length-1; i >= 0; i--) {
            reverseNameArray.add(wizards[i]);
        }
        return reverseNameArray;
    }
}
