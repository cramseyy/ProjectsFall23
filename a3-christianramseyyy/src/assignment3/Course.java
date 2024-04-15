package assignment3;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> allStudents = new ArrayList<>();

	public ArrayList<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(ArrayList<Student> allStudents) {
        this.allStudents = allStudents;

	}

	public boolean addStudent(Student stu) {
		if(!allStudents.contains(stu)) {
			allStudents.add(stu);
			return true;
		}
		return false;
	}
	
	public boolean removeStudent(Student stu) {
		return allStudents.remove(stu);
	}
	
	public boolean updateStudent(Student stu) {
		int index = allStudents.indexOf(stu);
		if(index != -1) {
			allStudents.set(index, stu);
			return true;
		}
		return false;
	}
	
	public double computeCourseAverage() {
		if(allStudents.isEmpty()) {
			return -1.0;
		}
		
		int totalStudents = 0;
		double totalScore = 0;
		
		for(int i = 0;i < allStudents.size();i++) {
			Student student = allStudents.get(i);
			double studentAverage = student.computeMyAverage();
			if(studentAverage >= 0) {
				totalScore += studentAverage;
				totalStudents++;
			}
					
		}
		
		if(totalStudents == 0) {
			return -1;
		}
		
		return totalScore / totalStudents;
		
	}
}
