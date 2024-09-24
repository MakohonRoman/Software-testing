package labs;
import org.junit.Test;
import static org.junit.Assert.*;

/*
@author   $Makohon_Roman
@project   $Integer_To_Roman
@class  $444A
@version  1.0.0
@since 22.09.2024 - 21.34
*/

public class Convert_NumberTest {
    @Test
    public void whenNumber0_ThenRomanReturn_Null1() {
        assertNull(Convert_Number.intToRoman(0));
    }
    @Test
    public void whenNumber4000_ThenRomanReturn_Null2() {
        assertNull(Convert_Number.intToRoman(4000));
    }
    @Test
    public void whenNumber2_ThenRomanReturn_II() {
        assertEquals("II", Convert_Number.intToRoman(2));
    }

    @Test
    public void whenNumber5_ThenRomanReturn_V() {
        assertEquals("V", Convert_Number.intToRoman(5));
    }
    @Test
    public void whenNumber10_ThenRomanReturn_X() {
        assertEquals("X", Convert_Number.intToRoman(10));
    }
    @Test
    public void whenNumber14_ThenRomanReturn_XIV() {
        assertEquals("XIV", Convert_Number.intToRoman(14));
    }
    @Test
    public void whenNumber19_ThenRomanReturn_XIX() {
        assertEquals("XIX", Convert_Number.intToRoman(19));
    }
    @Test
    public void whenNumber27_ThenRomanReturn_XXVII() {
        assertEquals("XXVII", Convert_Number.intToRoman(27));
    }
    @Test
    public void whenNumber40_ThenRomanReturn_XL() {
        assertEquals("XL", Convert_Number.intToRoman(40));
    }
    @Test
    public void whenNumber45_ThenRomanReturn_XLV() {
        assertEquals("XLV", Convert_Number.intToRoman(45));
    }
    @Test
    public void whenNumber50_ThenRomanReturn_L() {
        assertEquals("L", Convert_Number.intToRoman(50));
    }
    @Test
    public void whenNumber60_ThenRomanReturn_LX() {
        assertEquals("LX", Convert_Number.intToRoman(60));
    }
    @Test
    public void whenNumber90_ThenRomanReturn_XC() {
        assertEquals("XC", Convert_Number.intToRoman(90));
    }
    @Test
    public void whenNumber99_ThenRomanReturn_XCIX() {
        assertEquals("XCIX", Convert_Number.intToRoman(99));
    }
    @Test
    public void whenNumber100_ThenRomanReturn_C() {
        assertEquals("C", Convert_Number.intToRoman(100));
    }
    @Test
    public void whenNumber139_ThenRomanReturn_CXXXIX() {
        assertEquals("CXXXIX", Convert_Number.intToRoman(139));
    }
    @Test
    public void whenNumber145_ThenRomanReturn_CXLV() {
        assertEquals("CXLV", Convert_Number.intToRoman(145));
    }
    @Test
    public void whenNumber150_ThenRomanReturn_CL() {
        assertEquals("CL", Convert_Number.intToRoman(150));
    }
    @Test
    public void whenNumber160_ThenRomanReturn_CLX() {
        assertEquals("CLX", Convert_Number.intToRoman(160));
    }
    @Test
    public void whenNumber207_ThenRomanReturn_CCVII() {
        assertEquals("CCVII", Convert_Number.intToRoman(207));
    }
    @Test
    public void whenNumber241_ThenRomanReturn_CCXLI() {
        assertEquals("CCXLI", Convert_Number.intToRoman(241));
    }
    @Test
    public void whenNumber316_ThenRomanReturn_CCCXVI() {
        assertEquals("CCCXVI", Convert_Number.intToRoman(316));
    }
    @Test
    public void whenNumber387_ThenRomanReturn_CCCLXXXVII() {
        assertEquals("CCCLXXXVII", Convert_Number.intToRoman(387));
    }
    @Test
    public void whenNumber400_ThenRomanReturn_CD() {
        assertEquals("CD", Convert_Number.intToRoman(400));
    }
    @Test
    public void whenNumber449_ThenRomanReturn_CDXLIX() {
        assertEquals("CDXLIX", Convert_Number.intToRoman(449));
    }
    @Test
    public void whenNumber454_ThenRomanReturn_CDLIV() {
        assertEquals("CDLIV", Convert_Number.intToRoman(454));
    }
    @Test
    public void whenNumber500_ThenRomanReturn_D() {
        assertEquals("D", Convert_Number.intToRoman(500));
    }
    @Test
    public void whenNumber512_ThenRomanReturn_DXII() {
        assertEquals("DXII", Convert_Number.intToRoman(512));
    }
    @Test
    public void whenNumber540_ThenRomanReturn_DXL() {
        assertEquals("DXL", Convert_Number.intToRoman(540));
    }
    @Test
    public void whenNumber700_ThenRomanReturn_DCC() {
        assertEquals("DCC", Convert_Number.intToRoman(700));
    }
    @Test
    public void whenNumber761_ThenRomanReturn_DCCLXI() {
        assertEquals("DCCLXI", Convert_Number.intToRoman(761));
    }
    @Test
    public void whenNumber823_ThenRomanReturn_DCCCXXIII() {
        assertEquals("DCCCXXIII", Convert_Number.intToRoman(823));
    }
    @Test
    public void whenNumber900_ThenRomanReturn_CM() {
        assertEquals("CM", Convert_Number.intToRoman(900));
    }
    @Test
    public void whenNumber975_ThenRomanReturn_CMLXXV() {
        assertEquals("CMLXXV", Convert_Number.intToRoman(975));
    }
    @Test
    public void whenNumber990_ThenRomanReturn_CMXC() {
        assertEquals("CMXC", Convert_Number.intToRoman(990));
    }
    @Test
    public void whenNumber1000_ThenRomanReturn_M() {
        assertEquals("M", Convert_Number.intToRoman(1000));
    }
    @Test
    public void whenNumber1062_ThenRomanReturn_MLXII() {
        assertEquals("MLXII", Convert_Number.intToRoman(1062));
    }
    @Test
    public void whenNumber1295_ThenRomanReturn_MCCXCV() {
        assertEquals("MCCXCV", Convert_Number.intToRoman(1295));
    }
    @Test
    public void whenNumber1317_ThenRomanReturn_MCCCXVII() {
        assertEquals("MCCCXVII", Convert_Number.intToRoman(1317));
    }
    @Test
    public void whenNumber3999_ThenRomanReturn_MMMCMXCIX() {
        assertEquals("MMMCMXCIX", Convert_Number.intToRoman(3999));
    }
}