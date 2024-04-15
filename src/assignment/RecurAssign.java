package assignment;

public class RecurAssign {
	
	//Recursive method that returns the sum of all the even numbers between smallestInt and largestInt
	//e.g smalestInt: 3, largestInt:7, should return 10.
	//base case must call MyStackTrace.printTrace()
	public int sumEvenNumbersOnly(int smallestInt, int largestInt) {
		MyStackTrace.printTrace(); 

        if (smallestInt > largestInt) {
            return 0;
        }

        if (smallestInt % 2 == 0) {
            return smallestInt + sumEvenNumbersOnly(smallestInt + 2, largestInt);
        } else {
            return sumEvenNumbersOnly(smallestInt + 1, largestInt);
        }
	}
	
	//Recursive method that returns the given text without 'a' or 'A' in it.
	//e.g text: "Allan", should return the string "lln".
	//if text is null, return the empty string ""
	//base case must call MyStackTrace.printTrace()
	public String removeAs(String text) {
		
		MyStackTrace.printTrace(); 

        if (text == null) {
            return "";
        }

        if (text.toLowerCase().contains("a")) {
            return removeAs(text.toLowerCase().replaceFirst("a", ""));
        } else {
            return text;
        }
    }
}

