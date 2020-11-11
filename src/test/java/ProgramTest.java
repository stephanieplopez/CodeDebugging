import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    /*
     *  Copy and paste available tests here.
     *  Option to write to also write additional custom tests.
     */

    @Test
    public void test1(){
        assertEquals(true, Program.and(true, true));
    }
    @Test
    public void test2(){
        assertEquals(false, Program.and(true, false));
    }
    @Test
    public void test3(){
        assertEquals(false, Program.and(false, true));
    }
    @Test
    public void test4(){
        assertEquals(false, Program.and(false, false));
    }

}
