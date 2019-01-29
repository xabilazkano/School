package com.zubiri;

import java.util.ArrayList;

public class School {
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Administrative> administratives = new ArrayList<Administrative>();

	public int findTeacherID(String name) {
		for (int i = 0; i < teachers.size(); i++) {
			if (name.equals(teachers.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

	public int findStudentID(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (name.equals(students.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

	public int findAdministrativeID(String name) {
		for (int i = 0; i < administratives.size(); i++) {
			if (name.equals(administratives.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}
	public boolean addTeacher(Teacher newTeacher) {
	
			teachers.add(newTeacher);
			if(findTeacherID(newTeacher.getName())!=-1) {
				return true;
			}
			return false;
		
		
	}

	public boolean addStudent(Student newStudent) {
		
			students.add(newStudent);
			if(findStudentID(newStudent.getName())!=-1) {
				return true;
			}
			return false;
		
	}

	public boolean addAdministrative(Administrative newAdministrative) {
		
			administratives.add(newAdministrative);
			if(findAdministrativeID(newAdministrative.getName())!=-1) {
				return true;
			}
			return false;
		
			
	}
	public boolean deleteTeacher(String name) {
		int index=findTeacherID(name);
		if (index!=-1) {
			teachers.remove(index);
			return true;
		}
		return false;
	}

	public boolean deleteStudent(String name) {
		int index=findStudentID(name);
		if (index!=-1) {
			students.remove(index);
			return true;
		}
		return false;
	}
	public boolean deleteAdministrative(String name) {
		int index=findAdministrativeID(name);
		if (index!=-1) {
			administratives.remove(index);
			return true;
		}
		return false;
	}
	public Teacher getTeacher(String name) {
		int index = findTeacherID(name);
		return teachers.get(index);
	}
	public Student getStudent(String name) {
		int index = findStudentID(name);
		return students.get(index);
	}
	public Administrative getAdministrative(String name) {
		int index = findAdministrativeID(name);
		return administratives.get(index);
	}

}