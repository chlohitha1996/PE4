package Java;

public class WordSort {
    String s;
    String st[];
    int count=0;

    String[] splitsort(String s) {
        int i;
        String s1=s.toLowerCase();
        st = s1.split(" "); //Collecting words from the string
        for (i = 0; i < (st.length) - 1; i++) { //Sorting words
            for (int j = 0; j < (st.length) - 1; j++) {
                if (st[j].compareTo(st[j + 1]) > 0) { //Sorting using bubble sort
                    String temp = st[j];
                    st[j] = st[j + 1];
                    st[j + 1] = temp;
                }
            }
        }
        //Printing Sorted Words
            for (int j = 0; j < (st.length); j++) {
                System.out.println(st[j]);
            }
            return st; //returning Sorted words

        }
    }



