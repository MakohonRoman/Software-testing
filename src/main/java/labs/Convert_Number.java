package labs;
/*
@author   $Makohon_Roman
@project   $Integer_To_Roman
@class  $444A
@version  1.0.0
@since 22.09.2024 - 21.32
*/

public class Convert_Number {
    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        if(num <= 0 || num >= 4000)
        {
            return null;
        }
        StringBuilder roman = new StringBuilder();
        if (num <= 0 || num >= 4000) {
            roman = null;
        }
        else {
            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    roman.append(symbols[i]);
                    num -= values[i];
                }
            }


        }
        return roman.toString();
    }
//    public static void main(String[] args) {
//        // Тестування конвертації чисел від 1 до 3999
//        for (int i = 1; i <= 3999; i++) {
//            System.out.println(i + " -> " + intToRoman(i));
//        }
//    }
}
