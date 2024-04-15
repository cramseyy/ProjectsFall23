package assignment3;

public class ScoreDriver {
	public static void main(String args[]) {
		
		//NOTE: BELOW IS A STARTER SET OF TEST FOR YOUR ASSIGNMENT. 
				//IT IS NOT THE ONLY SET OF TESTS YOU SHOULD DO FOR YOUR ASSIGNMENT! 
				
				
				//Score class
				Score s1 = new Score("Quiz1", 95.5);
				//display score name
				System.out.println("display score name -> "+s1.getScoreName());
				System.out.println("display score value -> "+s1.getScoreValue());
				
				s1.setScoreName("qu12");
				System.out.println("set and display new score name -> "+s1.getScoreName());

				s1.setScoreValue(96.0);
				System.out.println("set and display new score value -> "+s1.getScoreValue());

				System.out.println("Call toString method of Score ->"+s1);
				
				Score s2 = new Score("qu12", 99.99);
				System.out.println("Is s2 and s1 equal? ->"+s1.equals(s2));
				
	}

}
