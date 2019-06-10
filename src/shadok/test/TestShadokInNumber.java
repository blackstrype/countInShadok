package shadok.test;

import org.junit.Assert;
import org.junit.Test;
import shadok.ShadokInNumber;


public class TestShadokInNumber {

    /*
     0 = GA     4 = BUGA    8  = ZOGA   12 = MEUGA      16 = BUGAGA
     1 = BU     5 = BUBU    9  = ZOBU   13 = MEUBU      17 = BUGABU
     2 = ZO     6 = BUZO    10 = ZOZO   14 = MEUZO      18 = BUGAZO
     3 = MEU    7 = BUMEU   11 = ZOMEU  15 = MEUMEU     19 = BUGAMEU
    */

    @Test
    public void GAShouldBeZero(){
        Assert.assertEquals(ShadokInNumber.shadok("GA"), 0);
    }
    @Test
    public void BUShouldBeOne(){
        Assert.assertEquals(ShadokInNumber.shadok("BU"), 1);
    }
    @Test
    public void ZOShouldBeTwo(){
        Assert.assertEquals(ShadokInNumber.shadok("ZO"), 2);
    }
    @Test
    public void MEUShouldBeThree(){
        Assert.assertEquals(ShadokInNumber.shadok("MEU"), 3);
    }

}
