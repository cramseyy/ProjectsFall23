package assignment;

public class PassFailCourse extends Course {
	//See Assignment 3 or "High Level View of Your Tasks" in Folio to see what Course contains
	
	/**
	 * This overrides Course's computerCourseAverage method.
	 * The course is Pass / Fail, which means you will not receive a specific grade.
	 * however, you need a 75% average to pass the course.
	 * (Remember that the Student class has computeMyAverage as a method)
	 * @return the number of students who's average of all the student's quizzes is 75% or better divided by the total students in the course
	 */
	@Override
	public double computeCourseAverage() {
		return -1.0;
	}
	/**
	 * Name of this Pass/Fail Course
	 * @param courseName
	 */
	public PassFailCourse(String courseName) {
		super("CHANGE THIS");
	}
	
	/**
	 * @return a string that mentions the course name, type of course, percentage of the class that have above 75% average, and the super's toString 
	 * e.g. 

		Underwater Basket Weaving is a pass/fail course. 75.00% of the class are on track to pass the course. Students in this course:
		[Bugsy 521, Daisy 321, Minny 876, Mikey 543]

	 */
	public String toString() {
		return "";
	}
	
}
