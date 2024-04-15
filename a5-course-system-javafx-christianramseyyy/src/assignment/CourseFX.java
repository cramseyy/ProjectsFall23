package assignment;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class CourseFX extends Application {
	private Scene scene = new Scene(new Pane(), 800, 600);

    @Override
    public void start(Stage stage) {
    	Course course = generateCourse();
    	
    	showStudents(course);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * This method should set the scene that displays all student and course information
	 * @param course course
	 */
    public void showStudents(Course course) {
    	// Placeholder
    	// Write your code here
    	Pane canvas = new Pane();
        scene.setRoot(canvas);
    }
    
    /**
     * This method should set the scene that displays a student and their score information
	 * @param student student in the course
	 * @param course course
	 */
    public void showScores(Student stu, Course course) {
    	// Placeholder
    	// Write your code here
    	Pane canvas = new Pane();
        scene.setRoot(canvas);
    }
    
    /**
	 * @return course to be displayed
	 */
    public Course generateCourse() {
    	Score[][] scores = {{new Score("Quiz 1", 80), new Score("Homework 1", 95), new Score("Test 1", 67)},
    						{new Score("Quiz 1", 80), new Score("Homework 1", 95), new Score("Test 1", 67)},
    						{new Score("Quiz 1", 80), new Score("Homework 1", 95), new Score("Test 1", 67)},
    						{new Score("Quiz 1", 80), new Score("Homework 1", 95), new Score("Test 1", 67)}};
    	ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(new Student("Leonardo", 1), new Student("Michelangelo", 2), new Student("Donatello", 3), new Student("Raphael", 4)));
    	
    	for (int i = 0; i < 4; i++) {
    		students.get(i).setAllMyScores(scores[i]);
    	}
    	
    	Course course = new Course();
    	course.setAllStudents(students);

    	return course;
    }

    public static void main(String[] args) {
        launch();
    }
}