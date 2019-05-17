package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionImplementation {

    public boolean foundMatch(String a)
    {
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("john", Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(a);


        while (m.find())
          return true;
        return false;


    }
}




