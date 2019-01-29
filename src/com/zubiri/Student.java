package com.zubiri;

public class Student extends Worker{
	private int absenses=0;
	private double markAverage=0;
	private String classroom="";
	private int studentID=0;
	
	public Student(String name,String birthDate,String telephone,String dni,int absenses,double markAverage,String classroom) {
		setName(name);
		setBirthDate(birthDate);
		setTelephone(telephone);
		setDni(dni);
		setAbsenses(absenses);
		setMarkAverage(markAverage);
		setClassroom(classroom);
	}
	
	public Student() {
		
	}
	public int getAbsenses() {
		return this.absenses;
	}
	public void setAbsenses(int newAbsenses) {
		this.absenses=newAbsenses;
	}
	public double getMarkAverage() {
		return this.markAverage;
	}
	public void setMarkAverage(double newMarkAverage) {
		this.markAverage=newMarkAverage;
	}
	public String getClassroom() {
		return this.classroom;
	}
	public void setClassroom(String newClassroom) {
		this.classroom=newClassroom;
	}
	public int getStudentID() {
		return this.studentID;
	}
	public void setStudentID(int newStudentID) {
		this.studentID=newStudentID;
	}
	public String checkAbsenses() {
		if (this.absenses>=10 && this.absenses<20) {
			this.markAverage=this.markAverage*0.9;
			return "The mark average was reduced %10.";
		}else if (this.absenses>=20) {
			this.markAverage=this.markAverage*0.8;
			return "The markAverage was reduced %20.";
		}
		return "The mark average was not reduced.";
	}
}