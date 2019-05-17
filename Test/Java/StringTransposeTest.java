package Java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose str=new StringTranspose();

    @Before
    public void setUp() {
        StringTranspose str=new StringTranspose();
    }

    @After
    public void tearDown() {
        str = null;

    }

    @Test
    public void GivenString_ExpectedTransposeOfString()
    {
        String s = "a quick brown fox jumps over the lazy dog";

        String result=str.transposeString(s);
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }

    @Test
    public void GivenEmptyString_ExpectedEmptyTransposeOfString()
    {
        String s = "";

        String result=str.transposeString(s);
        assertEquals("",result);
    }


}