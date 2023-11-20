import java.io.*;

class pangram {

	public static boolean checkPangram(String str)
	{
		// boolean array of size 26 to mark the presence of each letter in the alphabet. The array is initialized with false values.
		boolean[] mark = new boolean[26];

		// Mark array index
		int index = 0;

		// Traverse all characters
		for (int i = 0; i < str.length(); i++) {
			// If uppercase character, subtract with A to get the index
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';

			// If lowercase character, subtract with a to get the index
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				index = str.charAt(i) - 'a';

			// If this character is other than eng letters
			else
				continue;

            //assign true for the index
			mark[index] = true;
		}

		// Return false if you find false in mark arrays(whic means not pangram)
		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return false;

		// If all element in mark are true
		return true;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String str = "The quick brown fox jumps over the lazy dog";

        System.out.println("Checking pangram for the string : "+str+"\n");

		if (checkPangram(str) == true)
			System.out.print(str + " \nis a pangram.");
		else
			System.out.print(str + " \nis not a pangram.");
	}
}


/********************************/
/*** Few Output For This Code ***/
/********************************/

/*
Output 1

Checking pangram for the string :  The quick brown fox jumps over the lazy dog

The quick brown fox jumps over the lazy dog 
is a pangram.

*/

/*
Output 2

Checking pangram for the string :  The quick brown fox jumps over the dog

The quick brown fox jumps over the dog 
is not a pangram.

*/