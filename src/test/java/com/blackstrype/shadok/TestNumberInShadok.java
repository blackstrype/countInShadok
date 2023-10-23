package com.blackstrype.shadok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberInShadok {
    /*
     0 = GA     4 = BUGA    8  = ZOGA   12 = MEUGA      16 = BUGAGA
     1 = BU     5 = BUBU    9  = ZOBU   13 = MEUBU      17 = BUGABU
     2 = ZO     6 = BUZO    10 = ZOZO   14 = MEUZO      18 = BUGAZO
     3 = MEU    7 = BUMEU   11 = ZOMEU  15 = MEUMEU     19 = BUGAMEU
    */

    @Test
    public void ZeroShouldBeGA(){
        Assertions.assertEquals(NumberInShadok.shadok(0), "GA");
    }
    @Test
    public void OneShouldBeBU() {
        Assertions.assertEquals(NumberInShadok.shadok(1), "BU");
    }
    @Test
    public void TwoShouldBeZO() {
        Assertions.assertEquals(NumberInShadok.shadok(2), "ZO");
    }
    @Test
    public void ThreeShouldBeMEU() {
        Assertions.assertEquals(NumberInShadok.shadok(3), "MEU");
    }
    @Test
    public void FourShouldBeBUGA() {
        Assertions.assertEquals(NumberInShadok.shadok(4), "BUGA");
    }
    @Test
    public void FiveShouldBeBUBU() {
        Assertions.assertEquals(NumberInShadok.shadok(5), "BUBU");
    }
    @Test
    public void EightShouldBeZOGA() throws Exception {
        Assertions.assertEquals(NumberInShadok.shadok(8), "ZOGA");
    }
    @Test
    public void SixteenShouldBeBUGAGA() throws Exception {
        Assertions.assertEquals(NumberInShadok.shadok(16), "BUGAGA");
    }
    @Test
    public void SixtyFourShouldBeBUGAGA() throws Exception {
        Assertions.assertEquals(NumberInShadok.shadok(64), "BUGAGAGA");
    }

}