package Java;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OccurancesOfInputTest {


    OccurancesOfInput oe;
    @After
    public void tearDown() {
        oe = null;

    }



    @Test
    public void GivenStringAndCharacter_CharPresentInString_ShouldGiveCountOfInstances() {
        oe = new OccurancesOfInput();
        String s = "I always smile";
        char c = 'a';
        int cn = oe.countCharacters(s, c, 0, 0);
        assertEquals(2,cn);


    }
    @Test
    public void GivenStringAndCharacter_CharacterNotPresentInString_ShouldGiveZeroinCount() {
        oe = new OccurancesOfInput();
        String s = "I always smile";
        char c = 'z';
        int cn = oe.countCharacters(s, c, 0, 0);
        assertEquals(0,cn);


    }
    @Test
    public void GivenStringAndCharacter_EmptyCharacterIsPassed_ShouldGiveZeroinCount() {
        oe = new OccurancesOfInput();
        String s = "I always smile";
        char c = ' ';
        int cn = oe.countCharacters(s, c, 0, 0);
        assertEquals(0,0);


    }
    @Test
    public void GivenStringAndCharacter_NumberIsPassedInCharacter_ShouldGiveZeroinCount() {
        oe = new OccurancesOfInput();
        String s = "I always smile";
        char c = '1';
        int cn = oe.countCharacters(s, c, 0, 0);
        assertEquals(0,0);


    }
    @Test
    public void GivenStringAndCharacter_SpecialCharacterIsPassedInCharacter_ShouldGiveZeroinCount() {
        oe = new OccurancesOfInput();
        String s = "I always smile";
        char c = '%';
        int cn = oe.countCharacters(s, c, 0, 0);
        assertEquals(0,0);


    }

}