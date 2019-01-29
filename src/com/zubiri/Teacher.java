package com.zubiri;

import java.util.ArrayList;

public class Teacher extends Worker {
	private int teacherID = 0;
	private ArrayList<String> subjects = new ArrayList<String>();
	private String tutor = "";

	public Teacher(String name, String birthDate, String telephone, String dni, int absenses, double salary,
			String joinedDate, String tutor) {
		setName(name);
		setBirthDate(birthDate);
		setTelephone(telephone);
		setDni(dni);
		setAbsenses(absenses);
		setSalary(salary);
		setJoinedDate(joinedDate);
		setTutor(tutor);
	}

	public Teacher() {

	}

	public int getTeacherID() {
		return this.teacherID;
	}

	public void setTeacherID(int newTeacherID) {
		this.teacherID = newTeacherID;
	}

	public ArrayList<String> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(ArrayList<String> newSubjects) {
		this.subjects = newSubjects;
	}

	public String getTutor() {
		return this.tutor;
	}

	public void setTutor(String newTutor) {
		this.tutor = newTutor;
	}

	public String isTutor() {
		if (!this.tutor.equals("") && !this.tutor.equals("no")) {
			return "Tutor of " + this.tutor;
		}
		return "He/she is not tutor";
	}

	public boolean addSubject(String newSubject) {
		subjects.add(newSubject);
		if (findSubject(newSubject) != -1) {

			return true;
		}
		return false;
	}

	public boolean deleteSubject(String subject) {
		int index = findSubject(subject);
		if (index != -1) {
			subjects.remove(index);
			return true;
		}
		return false;
	}

	public int findSubject(String subject) {
		for (int i = 0; i < subjects.size(); i++) {
			if (subject.equals(subjects.get(i))) {
				return i;
			}
		}
		return -1;
	}
}
