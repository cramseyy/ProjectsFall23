package assignment3;

public class CourseDriver {
	public static void main(String[] args) {
		//NOTE: BELOW IS A STARTER SET OF TEST FOR YOUR ASSIGNMENT. 
		//IT IS NOT THE ONLY SET OF TESTS YOU SHOULD DO FOR YOUR ASSIGNMENT! 
		
		
		//Score class

		//Student Class
		Student stu1 = new Student("Bugsy",521);
		stu1.AddScore(new Score("qu12", 10));
		stu1.getAScore("qu12");
		stu1.updateAScore("qu12", 99.9);
		stu1.AddScore(new Score("q2", 90.1));

		Student stu2 = new Student("Daisy", 321);

		Student stu3 = new Student("Daisy",321);


		//Course class
		Course cou = new Course();
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu1));		
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu2));
		System.out.println("Add Student to course unsuccessfully ->"+ cou.addStudent(stu3));
		
		Score[] testSetOfScores2 = {null,new Score("q1", 90),null,new Score("q2", 80),null, new Score("q3", 90),null, new Score("q4", 80),null,new Score("q5", 90)};
		stu2.setAllMyScores(testSetOfScores2);

		Score[] testSetOfScores1 = {null,new Score("q1", 100),null,new Score("q2", 80),null, new Score("q3", 70),null, new Score("q4", 90),null,new Score("q5", 90)};
		stu1.setAllMyScores(testSetOfScores1);
		
		System.out.println("Course average for all students ->"+ cou.computeCourseAverage());
		
		System.out.println("Number of Students in the Course ->"+ cou.getAllStudents().size());
		
		System.out.println("Attempt to remove a student that is in the course -> "+cou.removeStudent(stu2));
		
		System.out.println("Number of Students in the Course ->"+ cou.getAllStudents().size());
		
		System.out.println("Attempt to remove a student that is NOT in the course -> "+cou.removeStudent(new Student("Mikey",987)));
		
	}
}
