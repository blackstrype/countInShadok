package com.blackstrype.shadok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestShadokInNumber {
    /*
     0 = GA     4 = BUGA    8  = ZOGA   12 = MEUGA      16 = BUGAGA
     1 = BU     5 = BUBU    9  = ZOBU   13 = MEUBU      17 = BUGABU
     2 = ZO     6 = BUZO    10 = ZOZO   14 = MEUZO      18 = BUGAZO
     3 = MEU    7 = BUMEU   11 = ZOMEU  15 = MEUMEU     19 = BUGAMEU
    */
    @Test
    public void GAShouldBeZero(){
        Assertions.assertEquals(ShadokInNumber.shadok("GA"), 0, 0.1);
    }
    @Test
    public void BUShouldBeOne(){
        Assertions.assertEquals(ShadokInNumber.shadok("BU"), 1, 0.1);
    }
    @Test
    public void ZOShouldBeTwo(){
        Assertions.assertEquals(ShadokInNumber.shadok("ZO"), 2, 0.1);
    }
    @Test
    public void MEUShouldBeThree(){
        Assertions.assertEquals(ShadokInNumber.shadok("MEU"), 3, 0.1);
    }
    @Test
    public void BUGAShouldBeFour(){
        Assertions.assertEquals(ShadokInNumber.shadok("BUGA"), 4, 0.1);
    }
    @Test
    public void BUBUShouldBeFive(){
        Assertions.assertEquals(ShadokInNumber.shadok("BUBU"), 5, 0.1);
    }
    @Test
    public void BUZOShouldBeSix(){
        Assertions.assertEquals(ShadokInNumber.shadok("BUZO"), 6, 0.1);
    }
    @Test
    public void BUMEUShouldBeSeven(){
        Assertions.assertEquals(ShadokInNumber.shadok("BUMEU"), 7, 0.1);
    }
    @Test
    public void ZOGAShouldBeEight(){
        Assertions.assertEquals(ShadokInNumber.shadok("ZOGA"), 8, 0.1);
    }
    @Test
    public void ZOBUShouldBeNine(){
        Assertions.assertEquals(ShadokInNumber.shadok("ZOBU"), 9, 0.1);
    }
    @Test
    public void MEUGAShouldBeTwelve(){
        Assertions.assertEquals(ShadokInNumber.shadok("MEUGA"), 12, 0.1);
    }
    @Test
    public void MEUMEUShouldBeFifeteen(){
        Assertions.assertEquals(ShadokInNumber.shadok("MEUMEU"), 15, 0.1);
    }
    @Test
    public void BUGAGAShouldBeSixteen(){
        Assertions.assertEquals(ShadokInNumber.shadok("BUGAGA"), 16, 0.1);
    }
    @Test
    public void BUGAGAGAShouldBeSixtyFour(){
        Assertions.assertEquals(ShadokInNumber.shadok("BUGAGAGA"), 64, 0.1);
    }
}
