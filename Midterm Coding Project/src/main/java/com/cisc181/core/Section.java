package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(){
		
	}
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public void setCourseID(UUID crID){
		this.CourseID = crID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	public void setSemesterID(UUID smstrID){
		this.SemesterID = smstrID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public void setSectionID(UUID sectID){
		this.SectionID = sectID;
	}
	
	public int getRoomID(){
		return RoomID;
	}
	
	public void getRoomID(int rmID){
		this.RoomID = rmID;
	}
}
