package Java;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters oe;
    @After
    public void tearDown() {
        oe = null;

    }

    @Test
    public void ReplaceCharacter_h_WithSpace_SpecifiedCharacterIsExpectedToBeReplaced(){
        oe=new ReplaceCharacters();
        String str="I hate my Wife";
        char ch1='h';
        char ch2=' ';
        String res= oe.ReplaceCharacter(str,ch1,ch2);
        assertEquals("I  ate my Wife",res);

    }
    @Test

    public void ReplaceCharacter_l_With_W_SpecifiedCharacterIsExpectedToBeReplaced(){
        oe=new ReplaceCharacters();
        String str="I love my life";
        char ch1='l';
        char ch2='w';
        String res= oe.ReplaceCharacter(str,ch1,ch2);
        assertEquals("I wove my wife",res);

    }
    @Test
    public void replaceCharacter_Y_With_Z_SpecifiedCharacterIsNotPresentInString_SameStringIsExpectedToReturn(){
        oe=new ReplaceCharacters();
        String str="Full Stack Developer";
        char ch1='y';
        char ch2='t';
        String res= oe.ReplaceCharacter(str,ch1,ch2);
        assertEquals("Full Stack Developer",res);

    }
    @Test

    public void ReplaceCharacterWith_specialCharacters_SpecifiedCharacterIsExpectedToBeReplaced(){
        oe=new ReplaceCharacters();
        String str="I love my life";
        char ch1='l';
        char ch2='*';
        String res= oe.ReplaceCharacter(str,ch1,ch2);
        assertEquals("I *ove my *ife",res);

    }



}