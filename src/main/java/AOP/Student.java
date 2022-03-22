package AOP;

public class Student {
	private String nameSuname;
	private int course;
	private double avgGrade;

	public Student(String nameSuname, int course, double avgGrade) {
		super();
		this.nameSuname = nameSuname;
		this.course = course;
		this.avgGrade = avgGrade;
	}
	public String getNameSuname() {
		return nameSuname;
	}
	public void setNameSuname(String nameSuname) {
		this.nameSuname = nameSuname;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public double getAvgGrade() {
		return avgGrade;
	}
	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	@Override
	public String toString() {
		return "Student [nameSuname=" + nameSuname + ", course=" + course + ", avgGrade=" + avgGrade + "]";
	}
	
}
