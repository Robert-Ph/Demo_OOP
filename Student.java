package lab_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private Date dateOfBirth;
	private Lecturers assistant;
	private List<Register> courseRegs = new ArrayList<Register>();
	
	public Student(String name, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Lecturers getAssistant() {
		return assistant;
	}

	public List<Register> getCourseRegs() {
		return courseRegs;
	}
	public void register(Courses c) {
		courseRegs.add(new Register(c));
	}
	public void updateGrade(Courses c, float grade) {
		for (Register i : courseRegs) {
			if(i.getCourses().getName().equals(c.getName())) {
				i.setGrade(grade);
				break;
			}
		}
	}
	public float averageOfGrade() {
		float sum =0;
		for(Register i: courseRegs) {
			sum += i.getGrade();
		}
		return sum/courseRegs.size();
	}
	public String rank() {
		float average = averageOfGrade();
		if(average >=9)
			return "Xuat Sac";
		else if(average >= 8)
			return "Gioi";
		else if(average >= 7)
			return "Kha";
		else if(average >= 6)
			return "Trung Binh Kha";
		else if(average >= 5)
			return "Trung Binh";
		else
			return "Rot";
	}
	public void prinGradeReport() {
		System.out.println("Name: " + getName());
		System.out.println("Date of birth: " + getDateOfBirth());
		System.out.println("SST\tMon\tDiem");
		for(int i =0; i < courseRegs.size(); i++) {
			System.out.println(i + "\t" 
					+ courseRegs.get(i).getCourses().getName() + "\t"
					+ courseRegs.get(i).getGrade());
		}
		System.out.println("Average of grade: " +  averageOfGrade());
		System.out.println("Rank: " + rank());
		System.out.println("------------------------------------");
	}
	public String toString() {
		return getName() + " " + getDateOfBirth();
	}

}
