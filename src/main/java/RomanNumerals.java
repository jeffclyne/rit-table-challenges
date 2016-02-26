/**
 * Created by jclyne1 on 2/16/16.
 */
public class RomanNumerals {

    /**
     * Sum two positive integers and return the result in Roman Numerals.
     * Expect any input. Non-positive integers or integers that result in a sum of
     * more than 3999 should result in an IllegalArgumentException.
     *
     * @param x first integer
     * @param y second integer
     * @return The String representation of the sum of x and y in Roman Numerals
     * @throws IllegalArgumentException thrown if x or y is not positive, or they result in a sum greater than 3999
     */
    public static String getSumInRomanNumerals(int x, int y) throws IllegalArgumentException {

        int sum=0;
        String roman="";
        int count=0;
        sum = x + y;
        if(sum> 3999){
            System.out.println("invalid inputs");

        }
        if( x<0 || y< 0){
            System.out.println("invalid inputs");
        }
        while(Integer.toString(sum).length() !=0){
            count++;
            sum=sum/10;
        }


        if(count== 2 ) {


            while (count != 1 && (sum % 10) != 5) {

                if (sum % 10 == 1) {
                    roman = roman + "I";
                } else {

                    if (sum % 10 == 2) {


                        roman = roman + "II";

                    } else {

                        if (sum % 10 == 3) {
                            roman = roman + "III";

                        } else {

                            if (sum % 10 == 4) {
                                roman = roman + "IV";


                            } else {

                                if (sum % 10 == 5) {

                                    roman = roman + "V";
                                } else {
                                    if (sum % 10 == 6) {

                                        roman = roman + "VI";

                                    } else {
                                        if (sum % 10 == 7) {

                                            roman = roman + "VII";
                                        } else {
                                            if (sum % 10 == 8) {
                                                roman = roman + "VIII";

                                            } else {
                                                if (sum % 10 == 9) {
                                                    roman = roman + "IX";

                                                } else {
                                                    if (sum == 50) {
                                                        roman = roman + "L";

                                                    } else {
                                                        if (sum == 100) {
                                                            roman = roman + "C";

                                                        } else {
                                                            if (sum == 500) {

                                                                roman = roman + "D";
                                                            } else {
                                                                if (sum == 1000) {
                                                                    roman = roman + "M";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }


            roman="X"+roman;
        }







        return roman;
    }
}
