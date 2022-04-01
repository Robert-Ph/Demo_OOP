package lab_1;

public class Courses {
	private String name;
	private int credits;
	private Lecturers lecture;
	public Courses(String name, int credits, Lecturers lecture) {
		super();
		this.name = name;
		this.credits = credits;
		this.lecture = lecture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Lecturers getLecture() {
		return lecture;
	}
	public void setLecture(Lecturers lecture) {
		this.lecture = lecture;
	}
	public int hashcode() {
		return name.hashCode();
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		if(name == null) {
			if(other.name == null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		return true;
	}
	public String toString() {
		return getName() + " " + getCredits() + " " + getLecture();
	}
}
