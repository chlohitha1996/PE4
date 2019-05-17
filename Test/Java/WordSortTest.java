package Java;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordSortTest {

    WordSort ws;
    @After
    public void tearDown() {
        ws = null;

    }


    @Test
    public void GivenString_StringContainsAllWordsInLowerCase_ReturnWordsInSortedFormat() {
        String a = "cat bat zebra apple";
        ws = new WordSort();
        String[] res= ws.splitsort(a);

        String[] str1 = {"apple", "bat", "cat", "zebra"};
        assertEquals(str1,res);

    }

    @Test
    public void GivenString_StringContainsAllWordsInDifferentCases_ReturnWordsInSortedFormat() {
        String a = "cat Bat Zebra apple";
        ws = new WordSort();
        String[] res= ws.splitsort(a);

        String[] str1 = {"apple", "bat", "cat", "zebra"};
        assertEquals(str1,res);

    }

    @Test
    public void GivenString_StringContainsAllWordsUpperCase_ReturnWordsInSortedFormat() {
        String a = "AM A VIZAGITE";
        ws = new WordSort();
        String[] res= ws.splitsort(a);

        String[] str1 = {"a", "am", "vizagite"};
        assertEquals(str1,res);


    }

}