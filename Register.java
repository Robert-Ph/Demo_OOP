package lab_1;

public class Register {
	private Courses courses;
	private float grade;
	public Register(Courses courses) {
		super();
		this.courses = courses;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
}
