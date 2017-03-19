package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;


public class Course {
	
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(){
		


	}
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major){
		
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID crID) {
		this.CourseID = crID;
		
	}
	public String getCourseName() {
		return CourseName;
		
	}
	public void setCourseName(String crName){
		this.CourseName = crName;
		
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int grPts){
		this.GradePoints= grPts;
	}
	
	
	
	public eMajor geteMajor(){
		return Major;
	}
	public void seteMajor(eMajor Major){
		this.Major = Major;
	}
}



