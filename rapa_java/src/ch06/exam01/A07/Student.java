package ch06.exam01.A07;

public class Student {
	private String name;
	private String id;
	private int score;
	private String grade;
	
	public String getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
		calculateGrade();
	}
	
	private void calculateGrade() {
		
		int _score2 = this.score / 10;
		switch(_score2) {
		case 10:
		case 9:
			this.grade= "A";
			break;
		case 8:
			this.grade= "B";
			break;
		case 7:
			this.grade= "C";
			break;
		case 6:
			this.grade= "D";
			break;
		default:
			this.grade= "F";
			break;
		
		}
	}
	

}
