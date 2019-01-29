package com.zubiri;

public class Worker extends Person{
	private double salary=0;
	private String joinedDate="0000/00/00";
	private int absenses=0;
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double newSalary) {
		this.salary=newSalary;
	}
	public String getJoinedDate() {
		return this.joinedDate;
	}
	public void setJoinedDate(String newJoinedDate) {
		if (isValidDate(newJoinedDate)) {
			this.joinedDate=newJoinedDate;
		}
	}
	public int getAbsenses() {
		return this.absenses;
	}
	public void setAbsenses(int newAbsenses) {
		this.absenses=newAbsenses;
	}
	public String checkAbsenses() {
		if (this.absenses>=10 && this.absenses<20) {
			this.salary=this.salary*0.9;
			return "The salary was reduced %10.";
		}else if (this.absenses>=20) {
			this.salary=this.salary*0.8;
			return "The salary was reduced %20.";
		}
		return "The salary was not reduced.";
	}
}
