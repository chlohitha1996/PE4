package Java;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionImplementationTest {


    RegularExpressionImplementation oe;
    @After
    public void tearDown() {
        oe = null;

    }




    @Test
    public void GivenString_NamePresentInString_ShouldReturnTrue() {
        oe = new RegularExpressionImplementation();
        String a = "I always smile, John";
        boolean cn = oe.foundMatch(a);
        assertEquals(true,cn);


    }

    @Test
    public void GivenString_NamePresentInStringInALLCapitalCases_ShouldReturnTrue() {
        oe = new RegularExpressionImplementation();
        String a = "I always smile, JOHN";
        boolean cn = oe.foundMatch(a);
        assertEquals(true,cn);


    }
    @Test
    public void GivenString_NamePresentInStringInALLLowerCases_ShouldReturnTrue() {
        oe = new RegularExpressionImplementation();
        String a = "I always smile, john";
        boolean cn = oe.foundMatch(a);
        assertEquals(true,cn);


    }
    @Test
    public void GivenString_NamePresentInStringInDifferentCases_ShouldReturnTrue() {
        oe = new RegularExpressionImplementation();
        String a = "I always smile, JOhN";
        boolean cn = oe.foundMatch(a);
        assertEquals(true,cn);


    }
    @Test
    public void GivenString_NameNotPresentInString_ShouldReturnFalse() {
        oe = new RegularExpressionImplementation();
        String a = "I always smile";
        boolean cn = oe.foundMatch(a);
        assertEquals(false,cn);


    }
    @Test
    public void GivenStringWithCombinationOfCharacters_NameNotPresentInString_ShouldReturnFalse() {
        oe = new RegularExpressionImplementation();
        String a = "@3$%HJTRNFBFD&(*(13224";
        // char c = 'a';
        boolean cn = oe.foundMatch(a);
        assertEquals(false,cn);


    }










}