package assignment3;

public class StudentDriver {
	
	public static void main(String[] args) {
		//NOTE: BELOW IS A STARTER SET OF TEST FOR YOUR ASSIGNMENT. 
		//IT IS NOT THE ONLY SET OF TESTS YOU SHOULD DO FOR YOUR ASSIGNMENT! 
		
		
		//Score class
		Score s1 = new Score("Quiz1", 80.09);
		Score s2 = new Score("qu12", 70.3333);
		
		//Student Class
		Student stu1 = new Student("Bugsy",123456);
		System.out.println("Call toString method of Student ->"+stu1);
		
		System.out.println("Add a score to student ->"+stu1.AddScore(s2));
		
		System.out.println("Get a score from student ->"+stu1.getAScore("qu12"));
		System.out.println("Update a score from student ->"+stu1.updateAScore("qu12", 99.91));
		
		stu1.AddScore(s1);
		System.out.println("Compute average for student ->"+stu1.computeMyAverage());
		
		Student stu2 = new Student("Daisy", 321);
		System.out.println("Display number of Student Objects created ->"+Student.getNumberOfStudentsCreated());
		
		System.out.println("Check if Student stu1 and stu2 are the same ->"+stu1.equals(stu2));
		
		Student stu3 = new Student("Daisy",321);
		System.out.println("Check if Student stu2 and stu3 are the same ->"+stu2.equals(stu3));
		
		Score[] testSetOfScores2 = {null,new Score("q1", 10),null,new Score("q2", 20),null, new Score("q3", 30),null, new Score("q4", 40),null,new Score("q5", 50)};
		stu2.setAllMyScores(testSetOfScores2);
		System.out.println("Compute average for student ->"+stu2.computeMyAverage());
	}

}
