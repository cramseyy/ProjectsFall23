package assignment;

public class StringRegExDriver {
	
	 public static void main(String[] args) {
	        
		 	System.out.println(StringRegExAssignment.returnTheLengthOfTheString("")); //0
	        System.out.println(StringRegExAssignment.returnTheLengthOfTheString("a")); //1
	        System.out.println(StringRegExAssignment.returnTheLengthOfTheString("The Annual Convention of UPE will held in cyberspace on Friday, March 25, 2022, from 1- 3 PM")); //92
	        System.out.println(StringRegExAssignment.returnTheLengthOfTheString(null)); //-1
	        
	        System.out.println(StringRegExAssignment.returnTheCharacterAtTheGivenIndex("1999", 2)); //9
	        System.out.println(StringRegExAssignment.returnTheCharacterAtTheGivenIndex("CSCI1302", 0)); //C
	        System.out.println(StringRegExAssignment.returnTheCharacterAtTheGivenIndex("Chicken Wrap", 7)); // white space

	        System.out.println(StringRegExAssignment.returnTheSubStringStartingAtTheGivenIndex("1999", 2)); //99
	        System.out.println(StringRegExAssignment.returnTheSubStringStartingAtTheGivenIndex("CSCI1302", 0)); //CSCI1302
	        System.out.println(StringRegExAssignment.returnTheSubStringStartingAtTheGivenIndex("Chicken Wrap", 7)); // (white space)Wrap

	        System.out.println(StringRegExAssignment.returnTheSubStringBetweenStartAndEndIndex("1999", 2,3)); //9
	        System.out.println(StringRegExAssignment.returnTheSubStringBetweenStartAndEndIndex("CSCI1302", 0,4)); //CSCI
	        System.out.println(StringRegExAssignment.returnTheSubStringBetweenStartAndEndIndex("Chicken Wrap", 4,7)); // ken

	        System.out.println(StringRegExAssignment.changeAllOccurancesOf1999To2022("1999")); //2022
	        System.out.println(StringRegExAssignment.changeAllOccurancesOf1999To2022("1999 was all about 1999"));
	        System.out.println(StringRegExAssignment.changeAllOccurancesOf1999To2022("Two thousand zero zero party over, oops, out of time\r\n"
	                + "(No, no)\r\n"
	                + "So tonight I'm gonna party like it's 1999\r\n"
	                + "Alright, 1999\r\n"
	                + "You say it, 1999\r\n"
	                + "Mmm 1999\r\n"
	                + "(Oww, 1999)")); 

	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Winter11a")); //true
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Wint11a")); //false - less than minimum length
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("WinterWonderland11a")); //false - more than max length
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("winter11a")); //false -  does not start with uppercase letter
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Winter11A")); //false - does not end with lowercase letter
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Winter1_a")); //false - the second to last letter is not a number or !
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Winter1!a")); //true
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Metere!d")); //true
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Secondary!2s")); //true
	        System.out.println(StringRegExAssignment.checkIfPasswdIsValid("Breaded!x")); //true

	        System.out.println(StringRegExAssignment.countNumberOfValidEmailAddresses("a@b.comjamaicawhatever jam@jammer.edu")); //2
	        System.out.println(StringRegExAssignment.countNumberOfValidEmailAddresses("a@b")); //0
	        System.out.println(StringRegExAssignment.countNumberOfValidEmailAddresses(".net")); //0
	        System.out.println(StringRegExAssignment.countNumberOfValidEmailAddresses("bb@a.net")); //1
	        System.out.println(StringRegExAssignment.countNumberOfValidEmailAddresses("forever.and.ever@justdoit.net csciinstructor@georgiasouthern.edu, micromanager@igotnothingbettertodo.com")); //3
	    }

	}



