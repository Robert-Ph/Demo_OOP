package lab_1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class MyITCenter {
	private List<Lecturers> lecturers = new ArrayList<Lecturers>();
	private List<Student> student = new ArrayList<Student>();
	private List<Courses> courses = new ArrayList<Courses>();
	
	public MyITCenter() {
		init();
	}
	
	public void init() {
		Lecturers l1 = new Lecturers("Pham Van Tinh", new GregorianCalendar(1970,11,20).getTime(),"PhD" );
		Lecturers l2 = new Lecturers("Mai Anh Tho", new GregorianCalendar(1979,12,24).getTime(),"MS");
		Lecturers l3 = new Lecturers("Nguyen Duc Cong Song", new GregorianCalendar(1977,8,14).getTime(), "MS");
		lecturers.add(l1);
		lecturers.add(l2);
		lecturers.add(l3);
		
		Courses c1 = new Courses("Lap Trinh Co Ban", 4, l2);
		Courses c2 = new Courses("Lap Trinh Nang Cao", 4, l3);
		Courses c3 = new Courses("Lap Trinh Mang", 4, l1);
		Courses c4 = new Courses("Mang May Tinh", 4, l1);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		
		Student s1 = new Student("Nguyen Van Tuan", new GregorianCalendar(1988,1,23).getTime());
		Student s2 = new Student("Tran Van Thiet", new GregorianCalendar(1989,11,2).getTime());
		Student s3 = new Student("Nguyen Thi Lan", new GregorianCalendar(1988,6,20).getTime());
		Student s4 = new Student("Nguyen Thi Truc", new GregorianCalendar(1990,4,15).getTime());
		Student s5 = new Student("Vo Tan Doi", new GregorianCalendar(1988,2,26).getTime());
		Student s6 = new Student("Do The Sang", new GregorianCalendar(1989,3,12).getTime());
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		student.add(s6);
		
		s1.register(c1);
		s1.register(c2);
		s1.register(c3);
		
		s2.register(c2);
		s2.register(c3);
		s2.register(c4);
		
		s3.register(c1);
		s3.register(c2);
		s3.register(c3);
		s3.register(c4);
		
		s4.register(c1);
		s4.register(c3);
		s4.register(c4);
		
		s5.register(c1);
		s5.register(c2);
		s5.register(c3);
		s5.register(c4);
		
		s6.register(c1);
		s6.register(c2);
		
		s1.updateGrade(c1, 6);
		s1.updateGrade(c2, 7);
		s1.updateGrade(c3, 8);
		
		s2.updateGrade(c2, 8.5f);
		s2.updateGrade(c3, 5);
		s2.updateGrade(c4, 7);
		
		s3.updateGrade(c1, 4);
		s3.updateGrade(c2, 7.5f);
		s3.updateGrade(c3, 8);
		s3.updateGrade(c4, 10);
		
		s4.updateGrade(c1, 8);
		s4.updateGrade(c3, 3);
		s4.updateGrade(c4, 6);
		
		s5.updateGrade(c1, 5);
		s5.updateGrade(c2, 4);
		s5.updateGrade(c3, 6);
		s5.updateGrade(c4, 8);
		
		s6.updateGrade(c1, 5);
		s6.updateGrade(c2, 8);
	}
	
	public static void printList(List<?> list) {
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("---------------------------");
	}
	public Student findStudentByName(String name) {
		for(Student s : student) {
			if(s.getName().equals(name))
				return s;
		}
		return null;
	}
	public Courses findCourseByName(String name) {
		for(Courses c : courses) {
			if(c.getName().equals(name))
				return c;
		}
		return null;
	}
	public List<Student> getStudentsOfCourse(Courses c){
		List<Student> result = new ArrayList<Student>();
		for(Student student: student) {
			for(Register register: student.getCourseRegs()) {
				if(register.getCourses().getName().equals(c.getName()))
					result.add(student);
			}
		}
		return result;
	}
	public void printStudentReportCardUsecase() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String studentname = in.nextLine();
		Student student = findStudentByName(studentname.trim());
		if(student != null) {
			student.prinGradeReport();
		}else {
			System.out.println("Student name not found");
		}
	}
	
	public void printstudentOfCourseUseCase() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Course name: ");
		String courseName = in.nextLine();
		Courses course = findCourseByName(courseName.trim());
		if(course != null) {
			printList(getStudentsOfCourse(course));
		}else {
			System.out.println("Course name nou found");
		}
	}
	public static void main(String[] args) {
		MyITCenter myCenter = new MyITCenter();
		myCenter.printStudentReportCardUsecase();
		myCenter.printstudentOfCourseUseCase();
	}
}
