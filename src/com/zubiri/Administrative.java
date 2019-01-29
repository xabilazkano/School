package com.zubiri;

import java.util.ArrayList;

public class Administrative extends Worker {
	private ArrayList<String> languages = new ArrayList<String>();
	private int administrativeID = 0;

	public Administrative(String name, String birthDate, String telephone, String dni, int absenses, double salary,
			String joinedDate) {
		setName(name);
		setBirthDate(birthDate);
		setTelephone(telephone);
		setDni(dni);
		setAbsenses(absenses);
		setSalary(salary);
		setJoinedDate(joinedDate);
	}

	public Administrative() {

	}

	public ArrayList<String> getLanguages() {
		return this.languages;
	}

	public void setLanguages(ArrayList<String> newLanguages) {
		this.languages = newLanguages;
	}

	public int getAdministrativeID() {
		return this.administrativeID;
	}

	public void setAdministrativeID(int newAdministrativeID) {
		this.administrativeID = newAdministrativeID;
	}

	public boolean addLanguage(String newLanguage) {

		languages.add(newLanguage);
		if (findLanguage(newLanguage) != -1) {
			return true;
		}
		return false;
	}

	public int findLanguage(String language) {
		for (int i = 0; i < languages.size(); i++) {
			if (language.equals(languages.get(i))) {
				return i;
			}
		}
		return -1;
	}
}
