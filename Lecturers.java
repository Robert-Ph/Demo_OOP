package lab_1;

import java.util.Date;

public class Lecturers {
	private String name;
	private Date nameOfDate;
	private String degree;
	public Lecturers(String name, Date nameOfDate, String degree) {
		super();
		this.name = name;
		this.nameOfDate = nameOfDate;
		this.degree = degree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNameOfDate() {
		return nameOfDate;
	}
	public void setNameOfDate(Date nameOfDate) {
		this.nameOfDate = nameOfDate;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
