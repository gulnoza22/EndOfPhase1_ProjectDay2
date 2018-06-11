package day2;

import java.util.Arrays;

public class JackOfAll {

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public String generateUserName(String s1, String s2) {
		char fInitial = s1.charAt(0);
		String username = fInitial + s2;
		return username.toLowerCase();

	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public StringBuilder reverseWords(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb;

	}

	/**
	 * 
	 * @param ints
	 * @return
	 */
	public int[] reverseIntArray(int[] ints) {
		for (int k = 0; k < ints.length / 2; k++) {
			int temp = ints[k];
			ints[k] = ints[ints.length - (1 + k)];
			ints[ints.length - (1 + k)] = temp;
		}
		return ints;

	}

	/**
	 * 
	 * @param
	 * 
	 * @return
	 */
	public int sumOfNumberFrom1ToN(int n) {
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}

	/**
	 * 
	 * @param isPrimeMemer
	 * @param price
	 * @return
	 */
	public int calculateShipping(boolean isPrimeMemer, double price) {
		if (isPrimeMemer) {
			return 0;
		} else if (price > 35) {
			return 0;
		} else {
			return 5;
		}

	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public String makeFirstCharCapital(String s) {

		String firstLetter = s.substring(0, 1).toUpperCase();
		String restLetters = s.substring(1).toLowerCase();
		return firstLetter + restLetters;

	}

	/**
	 * 
	 * @param sentence
	 * @return
	 */
	public String makeFirstCharEveyWordCapital(String sentence) {
		// TODO Auto-generated method stub

		String[] arr = sentence.split(" ");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = makeFirstCharCapital(arr[i]);
			result += arr[i];
			if (i < arr.length - 1)
				result += " ";
		}
		return result;
	}

	/**
	 * 
	 * @param s///
	 *            LOOP THROUGH EACH STRING ITEM // CALL YOUR
	 *            getNumberOutOfString(eachItem) to /// get each number and
	 *            concatinate to allNum // AFTER THE LOOP CONVERT THE allNum to
	 *            String
	 * 
	 *            // RETURN THE NUMBER
	 * @return
	 */
	public int getNumberOutOfString(String s) {
		String num = "";
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				num += s.charAt(i);
			}
		}
		if (num.length() == 0) {
			return 0;
		} else {
			int a = Integer.parseInt(num);
			return a;
		}

	}

	/**
	 * 
	 * @param is
	 * @return
	 */
	public boolean checkIfFirstOrLastItemMoreThan5(int[] is) {
		
		  if(is[0]>5 || is[is.length-1]>5 ) {
				return true;
			}else
				return false;
	
	 
	}

	/**
	 * 
	 * @param is
	 * @return
	 */
	public boolean checkAllLongsAreMoreThan20(int[] is) {
		boolean aa = false;

		for (int i = 0; i < is.length; i++) {
			if (is[i] < 20) {
				aa = false;
				break;
			} else
				aa = true;
		}
		return aa;

	}

	/**
	 * 
	 * @param ints
	 * @return
	 */
	public int findMaxOfAllNumbers(int[] ints) {
		Arrays.sort(ints);

		return ints[ints.length - 1];

	}

	/**
	 * 
	 * @param is
	 * @param is2
	 * @return
	 */
	public int compareMaxOf2Arrays(int[] is, int[] is2) {
		Arrays.sort(is);
		Arrays.sort(is2);

		if (is[is.length - 1] > is2[is2.length - 1]) {
			return 1;
		} else if (is[is.length - 1] < is2[is2.length - 1]) {
			return -1;
		} else
			return 0;

	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	public boolean checkStringContainsNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				return true;
			}
		}

		return false;

	}

	/**
	 * 
	 * @param strings
	 * @return
	 */
	public long getNumberOutOfStringArray(String[] strings) {
		String b = "";
		JackOfAll a = new JackOfAll();
		for (int i = 0; i < strings.length; i++) {
			if (a.getNumberOutOfString(strings[i]) != 0) {
				b += a.getNumberOutOfString(strings[i]);
			}
		}
		if (b.length() == 0) {
			return 0;
		} else
			return Integer.parseInt(b);
	}

	/**
	 * 
	 * @param strings
	 * @return
	 */
	public int sumEachNumberContainedInsideStringArray(String[] strings) {

		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i < strings.length; i++) {
			if (getNumberOutOfString(strings[i]) != 0) {
				sum += getNumberOutOfString(strings[i]);
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	public boolean checkIfBooleanWordExistsInString(String string) {
		for (int i = 0; i < string.length() - 4; i++) {
			if (string.substring(i, i + 4).equalsIgnoreCase("true")
					|| string.substring(i, i + 4).equalsIgnoreCase("false"))
				return true;
		}
		return false;
	}

}
