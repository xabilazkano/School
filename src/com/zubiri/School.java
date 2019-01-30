package com.zubiri;

import java.util.ArrayList;

public class School {
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Administrative> administratives = new ArrayList<Administrative>();

	/**
	 * Gets the ArrayList of teachers
	 * 
	 * @return ArrayList of teachers
	 */
	public ArrayList<Teacher> getTeachers() {
		return this.teachers;
	}

	/**
	 * Sets a new ArrayList of teachers
	 * 
	 * @param newTeachers
	 */
	public void setTeachers(ArrayList<Teacher> newTeachers) {
		this.teachers = newTeachers;
	}

	/**
	 * Gets the ArrayList of students
	 * 
	 * @return ArrayList of students
	 */
	public ArrayList<Student> getStudents() {
		return this.students;
	}

	/**
	 * Sets a new ArrayList of students
	 * 
	 * @param newStudents
	 */

	public void setStudents(ArrayList<Student> newStudents) {
		this.students = newStudents;
	}

	/**
	 * Gets the ArrayList of administratives
	 * 
	 * @return ArrayList of administrative
	 */
	public ArrayList<Administrative> getAdministratives() {
		return this.administratives;
	}

	/**
	 * Sets a new ArrayList of administratives
	 * 
	 * @param newAdministratives
	 */

	public void setAdministratives(ArrayList<Administrative> newAdministratives) {
		this.administratives = newAdministratives;
	}

	/**
	 * Finds the index of a teacher
	 * 
	 * @param name
	 * @return index in the ArrayList, -1 if not found
	 */
	public int findTeacherID(String name) {
		for (int i = 0; i < teachers.size(); i++) {
			if (name.equals(teachers.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Finds the index of a student
	 * 
	 * @param name
	 * @return index in the ArrayList, -1 if not found
	 */
	public int findStudentID(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (name.equals(students.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Finds the index of an administrative
	 * 
	 * @param name
	 * @return index in the ArrayList, -1 if not found
	 */
	public int findAdministrativeID(String name) {
		for (int i = 0; i < administratives.size(); i++) {
			if (name.equals(administratives.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Adds a new teacher to the ArrayList
	 * 
	 * @param newTeacher
	 * @return true if correctly added, false if not
	 */
	public boolean addTeacher(Teacher newTeacher) {

		teachers.add(newTeacher);
		if (findTeacherID(newTeacher.getName()) != -1) {
			return true;
		}
		return false;

	}

	/**
	 * Adds a new student to the ArrayList
	 * 
	 * @param newStudent
	 * @return true if correctly added, false if not
	 */
	public boolean addStudent(Student newStudent) {

		students.add(newStudent);
		if (findStudentID(newStudent.getName()) != -1) {
			return true;
		}
		return false;

	}

	/**
	 * Adds a new administrative to the ArrayList
	 * 
	 * @param newAdministrative
	 * @return true if correctly added, false if not
	 */
	public boolean addAdministrative(Administrative newAdministrative) {

		administratives.add(newAdministrative);
		if (findAdministrativeID(newAdministrative.getName()) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * Deletes a teacher
	 * 
	 * @param name
	 * @return true if correctly deleted, false if not
	 */
	public boolean deleteTeacher(String name) {
		int index = findTeacherID(name);
		if (index != -1) {
			teachers.remove(index);
			return true;
		}
		return false;
	}

	/**
	 * Deletes a student
	 * 
	 * @param name
	 * @return true if correctly deleted, false if not
	 */
	public boolean deleteStudent(String name) {
		int index = findStudentID(name);
		if (index != -1) {
			students.remove(index);
			return true;
		}
		return false;
	}

	/**
	 * Deletes an administrative
	 * 
	 * @param name
	 * @return true if correctly deleted, false if not
	 */
	public boolean deleteAdministrative(String name) {
		int index = findAdministrativeID(name);
		if (index != -1) {
			administratives.remove(index);
			return true;
		}
		return false;
	}

	/**
	 * Gets an specific teacher
	 * 
	 * @param name
	 * @return teacher object
	 */
	public Teacher getTeacher(String name) {
		int index = findTeacherID(name);
		return teachers.get(index);
	}

	/**
	 * Gets an specific student
	 * 
	 * @param name
	 * @return student object
	 */
	public Student getStudent(String name) {
		int index = findStudentID(name);
		return students.get(index);
	}

	/**
	 * Gets an specific administrative
	 * 
	 * @param name
	 * @return administrative object
	 */
	public Administrative getAdministrative(String name) {
		int index = findAdministrativeID(name);
		return administratives.get(index);
	}



}