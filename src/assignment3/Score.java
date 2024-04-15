package assignment3;

public class Score {
	
	private String scoreName;
	private double scoreValue;
	
	public Score(String scoreName, double scoreVal) {
		this.scoreValue = scoreVal;
		if(scoreVal < 0 || scoreVal > 100) {
			System.out.print("Invalid score");
		}
	
		if(scoreName == null) {
			this.scoreName = "";
		}else {
			this.scoreName = scoreName;
		}
	}
	
	public double getScoreValue() {
		return scoreValue;
	}
	
	public boolean setScoreValue(double scoreVal) {
		if(scoreVal >= 0 && scoreVal <= 100) {
			this.scoreValue = scoreVal;
			return true;
		} else {
			return false;
		}
		
	}
	
	public String getScoreName() {
		return scoreName;
	}
	
	public boolean setScoreName(String scoreName) {
		if(scoreName == null) {
			this.scoreName = "";
			return false;
		}else {
			this.scoreName = scoreName;
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Score [scoreName=" +scoreName+ ", score=" +scoreValue+"]";
	}

}


