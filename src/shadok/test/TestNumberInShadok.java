package shadok.test;

import shadok.NumberInShadok;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestNumberInShadok {
    /*
     0 = GA     4 = BUGA    8  = ZOGA   12 = MEUGA      16 = BUGAGA
     1 = BU     5 = BUBU    9  = ZOBU   13 = MEUBU      17 = BUGABU
     2 = ZO     6 = BUZO    10 = ZOZO   14 = MEUZO      18 = BUGAZO
     3 = MEU    7 = BUMEU   11 = ZOMEU  15 = MEUMEU     19 = BUGAMEU
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

    @Test
    public void FiveShouldBeBUBU(){
        assertEquals(NumberInShadok.shadok(5), "BUBU");
    }

    @Test
    public void EightShouldBeBUBU(){
        assertEquals(NumberInShadok.shadok(8), "ZOGA");
    }

    @Test
    public void SixteenShouldBeBUGAGA(){
        assertEquals(NumberInShadok.shadok(16), "BUGAGA");
    }

}