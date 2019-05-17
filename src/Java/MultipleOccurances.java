package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances {
    int result;

    public String countOcuurance(String text, String patternString) {
        //Finding Occurances using pattern matcher

        try {
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(text);

            int count = 0;
            String result = "";
            while (matcher.find()) {
                count++;
                System.out.println("found: " + count + " : "
                        + matcher.start() + " - " + matcher.end());
                result = result + matcher.start() + "-" + matcher.end() + ",";

            }
            return result.substring(0,result.length()-1); //returning start , end positions
        }
        catch(Exception e){ //Handling inValid Data Exception
            System.out.println("NO Match Found");

        }
        return String.valueOf(result);
    }
}
















