package assignment3;

public class Student {
	
	private String stuName;
	private int stuID;
	private double newScoreVal;
	private String scoreName;
	private static int numOfStudents = 0;
	
	
	private Score[] Scores;

	public Student(String stuName, int stuID) {
		
		this.Scores = new Score[10];
		this.stuName = stuName;
		this.stuID = stuID;
		if(Scores.length > 10) {
			System.out.println("Array too long");
		}
		numOfStudents++;
	}
	
	public Score[] getAllMyScores() {
		return Scores;
	}

	public void setAllMyScores(Score[] arrayOfScores) {
		
		  if (arrayOfScores.length <= 10) {
	            
	            for (int i = 0; i < arrayOfScores.length; i++) {
	                this.Scores[i] = arrayOfScores[i];
	            }
	        } else {
	        
	            System.out.println("Array too long");
	        }
	    }

	public String toString() {
		return stuName+" "+stuID;
	}

	
	public boolean equals(Object that) {
		
		if (this == that) {
            return true;
        }
        if (that == null || getClass() != that.getClass()) {
            return false;
        }
        Student student = (Student) that;
        return stuID == student.stuID && stuName.equals(student.stuName);
	}
	
	public boolean updateAScore(String scoreName, double newScoreVal) {
		
		 if (scoreName == null) {
	            return false;
	        }

	        for (int i = 0;i < Scores.length;i++) {
	        	Score score = Scores[i];
	        	if (score != null && score.getScoreName().equals(scoreName)) {
	                score.setScoreValue(newScoreVal);
	                return true; 
	            }
	        }

	        return false; 
	}
	
	public boolean AddScore(Score newScore) {
		
		  if (newScore == null) {
		        return false; 
		    }
		   
		  for (int i = 0; i < Scores.length; i++) {
		        Score score = Scores[i];
		        if (score != null && score.getScoreName().equals(newScore.getScoreName())) {
		            return false; 
		        }
		    }

		   
		  double newScoreValue = newScore.getScoreValue();
		    if (newScoreValue < 0 || newScoreValue > 100) {
		        return false; 
		    }

		  
		  for (int i = 0; i < Scores.length; i++) {
		        if (Scores[i] == null) {
		            Scores[i] = newScore;
		            return true; 
		        }
		    }
		return false;
	}
	
	public double getAScore(String scoreName) {
		
		if (scoreName == null) {
            return -1;
        }

        for (int i = 0; i < Scores.length; i++) {
        	Score score = Scores[i];
        	if (score != null && score.getScoreName().equals(scoreName)) {
                return score.getScoreValue();
            }
        }

        return -1; 
	
	}
		
	public double computeMyAverage() {
		 double sum = 0.0;
	        int count = 0;

	        for (int i = 0; i < Scores.length; i++) {
	        	Score score = Scores[i];
	        	if (score != null) {
	                sum += score.getScoreValue();
	                count++;
	            }
	        }

	        if (count == 0) {
	            return 0.0;
	        }

	        return sum / count;
	}
	
	public static int getNumberOfStudentsCreated() {
		return numOfStudents;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getId() {
		return stuID;

	}
}
