package shadok.test;

import shadok.NumberInShadok;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestNumberInShadok {
    /*
     0 = GA
     1 = BU
     2 = ZO
     3 = MEU
     4 = BUGA
    */

    @Test
    public void ZeroShouldBeGA(){
        assertEquals(NumberInShadok.shadok(0), "GA");
    }

    @Test
    public void OneShouldBeBU(){
        assertEquals(NumberInShadok.shadok(1), "BU");
    }

    @Test
    public void TwoShouldBeZO(){
        assertEquals(NumberInShadok.shadok(2), "ZO");
    }

    @Test
    public void ThreeShouldBeMEU(){
        assertEquals(NumberInShadok.shadok(3), "MEU");
    }

    @Test
    public void FourShouldBeBUGA(){
        assertEquals(NumberInShadok.shadok(4), "BUGA");
    }

}