
public class Looping {

	public static void main(String[] args) {

		// for (int i = 2; i < 25; i = i + 2) {
		//
		// System.out.print(i + "\t");
		// if (i % 8 == 0) {
		// System.out.println();
		// }
		//
		// }

		// int s = 122348272;
		// int sum = 0;
		// while (s != 0) {
		//
		// sum = sum + s % 10;
		// s = s / 10;
		//
		// }
		// System.out.println(sum);
		// int sum1 = 0;
		// if (sum > 10) {
		// while (sum != 0) {
		// sum1 = sum1 + sum % 10;
		// sum = sum / 10;
		// }
		// System.out.println(sum1);
		// }

		String originalStr = "He_llo";
		char[] charArray = originalStr.toCharArray();

		
		for(int i=0;i<originalStr.length()-1;i++) {
			for(int j=1;j<originalStr.length();j++) {
				if(charArray[i]==charArray[j]) {
					break;
				}
			}
		}

//		String reversedStr = "";
//
//		for (int i = 0; i < originalStr.length(); ++i) {
//			reversedStr = originalStr.charAt(i) + reversedStr;
//			if (i == 2) {
//				continue;
//			}
//
//		}
//
//		System.out.println("Reversed string: " + reversedStr);
		
		
		  
		        String input = "programming";
		        String result = removeDuplicates(input);
		        System.out.println("Original String: " + input);
		        System.out.println("String with Duplicates Removed: " + result);
		    }

		    public static String removeDuplicates(String input) {

		        char[] charArray = input.toCharArray();
		        int length = charArray.length;
		        System.out.println(length);

		        int tail = 1;

		        // Loop through each character in the array
		        for (int i = 1; i < length; ++i) {
		        	int j = 0;

		            // Check if the current character is a duplicate
		            for (j = 0; j < tail; ++j) {
		                if (charArray[i] == charArray[j])
		                    break;
		            }

		            // If no duplicate is found, add the character to the result
		            if (j == tail) {
		                charArray[tail] = charArray[i];
		                ++tail;
		            }
		        }

		        // Set the remaining characters to null
		        for (int i = tail; i < length; ++i) {
		            charArray[i] = '\0';
		        }
		        System.out.println("Bala");
		        System.out.println("Bala");

		        return new String(charArray, 0, tail);
		    }
		

	

}
