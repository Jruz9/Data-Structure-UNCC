package Jan;

import java.util.ArrayList;

public class HarryPotter {

    public void  main(String[] arg)
    {
        try {
            reverse(new String[]{"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //If the given name list is empty, there would be something wrong, indicating an exception or accident.
    //  reverse containing
    //  "Hermione Jean Granger" as the first element, "Ronald Bilius" as the second element, and
    //  "Harry Potter" as the third element.
    public ArrayList<String> reverse(String[] wizards) throws Exception {

        ArrayList<String> reverseNameArray=new ArrayList<>();
        for (int i = 0; i < wizards.length; i++) {
            reverse(wizards[i]);
            
        }
        return null;

    }

    private void reverse(String wizardName){

    }
}
