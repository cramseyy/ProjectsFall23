package assignment;

public class GradedCourse extends Course{
	//See Assignment 3 or "High Level View of Your Tasks" in Folio to see what Course contains

	/**
	 * The course awards a letter Grade 
	 * The numeric score to letter grade is based on the values provided in the constructor. 
	 * (Remember that the Student class has computeMyAverage as a method)
	 * @return the number of students who's average of all the student's quizzes is at or better then the score that maps to the letter grade
	 * e.g. (notice the extra newline at the beginning)


		1 students on track for A
		4 students on track for B
		7 students on track for C
		2 students on track for D
	 
	 */
	public String countABCDFStudents() {
		return "";
	}
	/**
	 * Name of this Graded Course
	 * @param courseName
	 */
	public GradedCourse(String courseName, double minScoreForA, double minScoreForB, double minScoreForC, double minScoreForD) {
		super("CHANGE THIS");
	}
	
	/**
	 * @return a string that mentions the course name, type of course, number of students in A,B,C,D, and the super's toString
	 * e.g. 

		Underwater Basket Weaving is a letter grade course. 
		1 students on track for A
		1 students on track for B
		1 students on track for C
		1 students on track for D

		Students in this course:
		[Bugsy 521, Daisy 321, Minny 876, Mikey 543]
		
	 */
	public String toString() {
		return "";
	}
	
}
