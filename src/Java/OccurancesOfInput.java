package Java;

public class OccurancesOfInput {


    public static int countCharacters(String s, char c, int index, int count) {
        //finding occurances of input
        try {

            if (index < s.length()) {
                if (c == s.charAt(index)) {
                    count++;
                }
                index++;
                count = countCharacters(s, c, index, count);
            }
            return count;

        }
        catch (Exception e){ //Catching Exceptions for invalid data
            System.out.println("Valid data Only");
            return 0;
        }
    }

}




