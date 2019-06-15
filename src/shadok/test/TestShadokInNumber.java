package shadok.test;

import org.junit.Assert;
import org.junit.Test;
import shadok.NumberInShadok;
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
        Assert.assertEquals(ShadokInNumber.shadok("GA"), 0, 0.1);
    }
    @Test
    public void BUShouldBeOne(){
        Assert.assertEquals(ShadokInNumber.shadok("BU"), 1, 0.1);
    }
    @Test
    public void ZOShouldBeTwo(){
        Assert.assertEquals(ShadokInNumber.shadok("ZO"), 2, 0.1);
    }
    @Test
    public void MEUShouldBeThree(){
        Assert.assertEquals(ShadokInNumber.shadok("MEU"), 3, 0.1);
    }
    @Test
    public void BUGAShouldBeFour(){
        Assert.assertEquals(ShadokInNumber.shadok("BUGA"), 4, 0.1);
    }
    @Test
    public void BUBUShouldBeFive(){
        Assert.assertEquals(ShadokInNumber.shadok("BUBU"), 5, 0.1);
    }
    @Test
    public void BUZOShouldBeSix(){
        Assert.assertEquals(ShadokInNumber.shadok("BUZO"), 6, 0.1);
    }
    @Test
    public void BUMEUShouldBeSeven(){
        Assert.assertEquals(ShadokInNumber.shadok("BUMEU"), 7, 0.1);
    }
    @Test
    public void ZOGAShouldBeEight(){
        Assert.assertEquals(ShadokInNumber.shadok("ZOGA"), 8, 0.1);
    }
    @Test
    public void ZOBUShouldBeNine(){
        Assert.assertEquals(ShadokInNumber.shadok("ZOBU"), 9, 0.1);
    }
    @Test
    public void MEUGAShouldBeTwelve(){
        Assert.assertEquals(ShadokInNumber.shadok("MEUGA"), 12, 0.1);
    }
    @Test
    public void MEUMEUShouldBeFifeteen(){
        Assert.assertEquals(ShadokInNumber.shadok("MEUMEU"), 15, 0.1);
    }
    @Test
    public void BUGAGAShouldBeSixteen(){
        Assert.assertEquals(ShadokInNumber.shadok("BUGAGA"), 16, 0.1);
    }
    @Test
    public void BUGAGAGAShouldBeSixtyFour(){
        Assert.assertEquals(ShadokInNumber.shadok("BUGAGAGA"), 64, 0.1);
    }
}
