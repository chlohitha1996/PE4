package Java;

public class StringTranspose {
    public String transposeString(String str)
    {
        String[] str1 = str.split(" ");
        String str2="";
        for(int i=0;i<str1.length;i++) {
            StringBuffer str3 = new StringBuffer(str1[i]);
            str2 = str2 +str3.reverse() + " "; //Transpose of string
        }
        String result=str2.trim();
        return result;

    }




}
