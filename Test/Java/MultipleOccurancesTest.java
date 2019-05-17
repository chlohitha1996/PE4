package Java;

import org.junit.After;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultipleOccurancesTest {

    MultipleOccurances mo;
    @After
    public void tearDown() {
        mo = null;

    }


    @Test
    public void GivenStringAndPattern_PatternContainsString_ShouldReturnStartEndPositions() {
        String text    =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "is";

        mo = new MultipleOccurances();
        String res= mo.countOcuurance(text,patternString);
        assertEquals("2-4,5-7,23-25,70-72",res);


    }
    @Test
    public void GivenStringAndPattern_PatternDoesNotContainsString_ShouldReturnZero() {
        String text    =
                "Iam Lohitha Chatti Iam From Vizag";

        String patternString = "is";

        mo = new MultipleOccurances();
        String res= mo.countOcuurance(text,patternString);
        assertEquals("0",res);
    }
    @Test
    public void GivenStringAndPattern_PatternContainsSpecialCharactersAndNumbers_ShouldReturnZero() { //Exception gets Caught
        String text    =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "&*&^%$%$@#@0575";

        mo = new MultipleOccurances();
        String res= mo.countOcuurance(text,patternString);
        assertEquals("0",res);


    }
    @Test
    public void GivenStringAndPattern_PatternDoesNotContainsString_ShouldReturPositions() {
        String text    =
                "Iam Lohitha Chatti Iam From Vizag";

        String patternString = "Lohitha";

        mo = new MultipleOccurances();
        String res= mo.countOcuurance(text,patternString);
        assertEquals("4-11",res);
    }



}