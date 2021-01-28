package Jan;

import java.util.ArrayList;

public class HarryPotter {

    public static void main(String[] arg)
    {
        ArrayList<String>reverseArray;
        String[] wizardsArray=new String[]{"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"};
        try {
            reverseArray=reverse(wizardsArray);
            System.out.println(reverseArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //reverses the array of names and puts it an arraylist.
    private static ArrayList<String> reverse(String[] wizards) throws Exception {
        ArrayList<String> reverseNameArray=new ArrayList<>();
        for (int i =wizards.length-1; i >= 0; i--) {
            reverseNameArray.add(wizards[i]);
        }
        return reverseNameArray;
    }
}
