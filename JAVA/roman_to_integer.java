import java.util.*;

public class RomanToNumber {
    
    //Returns the intger value for respective roman number
	public static int value(char roman)
	{
		if (roman == 'I')
			return 1;
		if (roman == 'V')
			return 5;
		if (roman == 'X')
			return 10;
		if (roman == 'L')
			return 50;
		if (roman == 'C')
			return 100;
		if (roman == 'D')
			return 500;
		if (roman == 'M')
			return 1000;
		return -1;
	}

	//Convert roman to integer
	public static int romanToDecimal(String str)
	{

		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			
			int s1 = value(str.charAt(i));

			// Getting value of symbol s[i+1]
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));

				// If s1 is greater than or equal to s2, it adds s1 to the result.
				if (s1 >= s2) {
					result = result + s1;
				}
                //If s1 is less than s2, it adds s2 - s1 to the result and increments the index (i) to skip the next symbol.
				else {
					result = result + s2 - s1;
					i++;
				}
			}
            //This is for the last character of string
			else {
				result = result + s1;
			}
		}

		return result;
	}

	// Driver Code
	public static void main(String args[])
	{

		String str = "MCMIV";

        System.out.println("Roman Numeral is "+ str);

		System.out.println("Integer form of Roman Numeral("+str + ") is "+ romanToDecimal(str));


	}
}


/********************************/
/*** Few Output For This Code ***/
/********************************/

/*
Output 1

Roman Numeral is IX
Integer form of Roman Numeral(IX) is 9

*/

/*
Output 2

Roman Numeral is MCMIX
Integer form of Roman Numeral(MCMIX) is 1909

*/