package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExAssignment {

    public static int returnTheLengthOfTheString(String word) {
        if(word == null) {
        	return -1;
        }
    	return word.length();
    }
    
    public static char returnTheCharacterAtTheGivenIndex(String word, int index) {
        return word.charAt(index);
    }
    
    public static String returnTheSubStringStartingAtTheGivenIndex(String word, int index) {
        return word.substring(index);
    }
    
    public static String returnTheSubStringBetweenStartAndEndIndex(String word, int startIndex, int endIndex) {
        return word.substring(startIndex, endIndex);
    }
  
    public static String changeAllOccurancesOf1999To2022(String paragraph) {
        return paragraph.replaceAll("1999","2022");
    }
    	
    public static boolean checkIfPasswdIsValid(String passwd) {
    	String password = "^[A-Z][A-Za-z0-9!]{6,10}[a-z]$";
    	return passwd.matches(password);
    }
    
    public static int countNumberOfValidEmailAddresses(String fileDump) {
        String email = "[A-Za-z0-9]{1,32}@[A-Za-z0-9]{1,32}\\.(com|net|edu)";
        Pattern p = Pattern.compile(email);
        Matcher m = p.matcher(fileDump);
    	
        int count = 0;
        while (m.find()) {
            count++;
    }
        return count;
}
}
