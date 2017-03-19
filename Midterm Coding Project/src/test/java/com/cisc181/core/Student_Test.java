package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Student> Students = new ArrayList<Student>();
	static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	static ArrayList<Course> Courses = new ArrayList<Course>();
	static ArrayList<Section> Sections = new ArrayList<Section>();

	static ArrayList<Enrollment> MATH10F = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> MATH11S = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> FINC10F = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> FINC11S = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CHEM10F = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CHEM11S = new ArrayList<Enrollment>();

	public static Date newDate(int yr, int mn, int day) {
		Calendar Cal2 = Calendar.getInstance();
		Cal2.set(yr, mn, day);
		return Cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		Course MATH = new Course(UUID.randomUUID(), "Linear Algebra", 100, eMajor.COMPSI);
		Courses.add(MATH);
		Course FINC = new Course(UUID.randomUUID(), "Financial Ethics", 100, eMajor.BUSINESS);
		Courses.add(FINC);
		Course CHEM = new Course(UUID.randomUUID(), "Organic Chemistry", 100, eMajor.CHEM);
		Courses.add(CHEM);

		Semester F17 = new Semester(UUID.randomUUID(), newDate(2017, 9, 1), newDate(2017, 12, 15));
		Semesters.add(F17);
		Semester S18 = new Semester(UUID.randomUUID(), newDate(2018, 2, 1), newDate(2018, 5, 28));
		Semesters.add(S18);

		Section FMath = new Section(MATH.getCourseID(), F17.getSemesterID(), UUID.randomUUID(), 101);
		Sections.add(FMath);
		Section SMath = new Section(MATH.getCourseID(), S18.getSemesterID(), UUID.randomUUID(), 105);
		Sections.add(SMath);

		Section FFinc = new Section(FINC.getCourseID(), F17.getSemesterID(), UUID.randomUUID(), 329);
		Sections.add(FFinc);
		Section SFinc = new Section(FINC.getCourseID(), S18.getSemesterID(), UUID.randomUUID(), 326);
		Sections.add(SFinc);

		Section FChem = new Section(CHEM.getCourseID(), F17.getSemesterID(), UUID.randomUUID(), 004);
		Sections.add(FChem);
		Section SChem = new Section(CHEM.getCourseID(), S18.getSemesterID(), UUID.randomUUID(), 005);
		Sections.add(SChem);

		Student ST1 = new Student("Samantha", "Leigh", "Droogan", newDate(1995, 12, 1), eMajor.BUSINESS,
				"Ardleigh Drive", "(484)-941-8626", "sammy@yahoo.com", UUID.randomUUID());
		Students.add(ST1);
		Student ST2 = new Student("Aaron", "Robert", "Carter", newDate(1992, 11, 16), eMajor.NURSING, "Choate Street",
				"(484)-675-8888", "thaman55@yahoo.com", UUID.randomUUID());
		Students.add(ST2);
		Student ST3 = new Student("Rose", "Marie", "Scalzo", newDate(1996, 5, 28), eMajor.CHEM, "Bristol Avenue",
				"(215)-787-4848", "rms@gmail.com", UUID.randomUUID());
		Students.add(ST3);
		Student ST4 = new Student("Sean", "Joseph", "Tornetta", newDate(1996, 5, 4), eMajor.BUSINESS,
				"Saddlebrook Lane", "(610)-551-3336", "seanjt@gmail.com", UUID.randomUUID());
		Students.add(ST4);
		Student ST5 = new Student("Eric", "Fabio", "Rodrigez", newDate(1995, 6, 7), eMajor.PHYSICS, "Willard Street",
				"(302)-971-8446", "fabioguy@gmail.com", UUID.randomUUID());
		Students.add(ST5);
		Student ST6 = new Student("Taylor", "Nicole", "Defrancesco", newDate(1995, 12, 13), eMajor.COMPSI,
				"Iron Bridge Street", "(484)-555-8333", "taylorbaby@yahoo.com", UUID.randomUUID());
		Students.add(ST6);
		Student ST7 = new Student("Cassidy", "Rae", "Russo", newDate(1995, 1, 29), eMajor.NURSING, "Store Road",
				"(484)-900-3232", "cassierae@gmail.com", UUID.randomUUID());
		Students.add(ST7);
		Student ST8 = new Student("Morgan", "Quinn", "Miller", newDate(1996, 3, 25), eMajor.PHYSICS,
				"Squirrel Hill Drive", "(610)-419-9394", "morganq@yahoo.com", UUID.randomUUID());
		Students.add(ST8);
		Student ST9 = new Student("Hayley", "Nicole", "Jampo", newDate(1995, 11, 6), eMajor.BUSINESS, "Major Road",
				"(484)-453-1112", "basketballchic@aol.com", UUID.randomUUID());
		Students.add(ST9);
		Student ST10 = new Student("Amande", "Kelly", "Roberts", newDate(1994, 4, 11), eMajor.COMPSI, "Street Road",
				"(302)-324-6546", "robertsak@yahoo.com", UUID.randomUUID());
		Students.add(ST10);

		ArrayList<Integer> Grades1 = new ArrayList<Integer>(Arrays.asList(77, 60, 59, 90, 88, 86, 99, 75, 75, 70));
		ArrayList<Integer> Grades2 = new ArrayList<Integer>(Arrays.asList(74, 55, 63, 78, 84, 87, 96, 69, 74, 62));
		ArrayList<Integer> Grades3 = new ArrayList<Integer>(Arrays.asList(99, 50, 62, 72, 86, 92, 87, 80, 76, 64));

		for (int i = 0; i < Students.size(); i++) {

			MATH10F.add(new Enrollment(Sections.get(0).getSectionID(), Students.get(i).getStudentID()));
			MATH10F.get(i).setGrade(Grades1.get(i));
			MATH11S.add(new Enrollment(Sections.get(1).getSectionID(), Students.get(i).getStudentID()));
			MATH11S.get(i).setGrade(Grades2.get(i));
			FINC10F.add(new Enrollment(Sections.get(2).getSectionID(), Students.get(i).getStudentID()));
			FINC10F.get(i).setGrade(Grades3.get(i));
			FINC11S.add(new Enrollment(Sections.get(3).getSectionID(), Students.get(i).getStudentID()));
			FINC11S.get(i).setGrade(Grades1.get(i));
			CHEM10F.add(new Enrollment(Sections.get(4).getSectionID(), Students.get(i).getStudentID()));
			CHEM10F.get(i).setGrade(Grades2.get(i));
			CHEM11S.add(new Enrollment(Sections.get(5).getSectionID(), Students.get(i).getStudentID()));
			CHEM11S.get(i).setGrade(Grades3.get(i));

		}
	}

	public double StudentGPA(ArrayList<Enrollment> MATH10F, ArrayList<Enrollment> MATH11S,
			ArrayList<Enrollment> FINC10F, ArrayList<Enrollment> FINC11S, ArrayList<Enrollment> CHEM10F,
			ArrayList<Enrollment> CHEM11S, int Student) {

		double GPA = 0;
		final int CRSTOT = 6;

		if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 90) {
			GPA = 4.0;

		} else if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 85) {
			GPA = 3.5;

		} else if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 80) {
			GPA = 3.0;
		} else if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 75) {
			GPA = 2.5;
		} else if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 70) {
			GPA = 2.0;
		} else if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 65) {
			GPA = 1.5;
		} else if ((MATH10F.get(Student).getGrade() + MATH11S.get(Student).getGrade() + FINC10F.get(Student).getGrade()
				+ FINC11S.get(Student).getGrade() + CHEM10F.get(Student).getGrade() + CHEM11S.get(Student).getGrade())
				/ CRSTOT >= 60) {
			GPA = 1.0;
		} else {
			GPA = 0.0;
		}

		return GPA;

	}

	public static double CourseAverage(ArrayList<Enrollment> Courses) {
		double total = 0;
		double Avrg = 0;

		for (int i = 0; i < Students.size(); i++) {
			total = total + Courses.get(i).getGrade();
			Avrg = (total / Students.size());
		}
		return Avrg;
	}

	public static void ChangeMajor(eMajor major, Student student) {
		student.seteMajor(major);
	}

	@Test
	public void testStudentGPA() {

		assertEquals(3.0, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 0), .001);
		assertEquals(0.0, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 1), .001);
		assertEquals(1.0, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 2), .001);
		assertEquals(3.0, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 3), .001);
		assertEquals(3.5, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 4), .001);
		assertEquals(3.5, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 5), .001);
		assertEquals(4.0, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 6), .001);
		assertEquals(2.0, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 7), .001);
		assertEquals(2.5, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 8), .001);
		assertEquals(1.5, StudentGPA(MATH10F, MATH11S, FINC10F, FINC11S, CHEM10F, CHEM11S, 9), .001);

	}

	@Test
	public void testCourseAverage() {
		assertEquals(77.9, CourseAverage(MATH10F), .01);
		assertEquals(74.2, CourseAverage(MATH11S), .01);
		assertEquals(76.8, CourseAverage(FINC10F), .01);
		assertEquals(77.9, CourseAverage(FINC11S), .01);
		assertEquals(74.2, CourseAverage(CHEM10F), .01);
		assertEquals(76.8, CourseAverage(CHEM11S), .01);

	}

	@Test
	public void testChangeMajor(){
		ChangeMajor(eMajor.NURSING, Students.get(3));
		assertEquals(eMajor.NURSING, Students.get(3).geteMajor());
	}
}