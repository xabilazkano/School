package com.zubiri;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String name = "";
	private String birthDate="0000/00/00";
	private String telephone="000000000";
	private String dni="00000000A";
	
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String newBirthDate) {
		
			this.birthDate=newBirthDate;
		
	}
	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String newTelephone) {
		if (isValidTelephone(newTelephone)) {
			this.telephone=newTelephone;
		}
	}
	public String getDni() {
		return this.dni;
	}
	public void setDni(String newDni) {
		if (isValidDni(newDni)) {
			this.dni=newDni;
		}
	}
	public boolean isValidDni(String dni) {
		if (dni.length()==9) {
			for (int i=0;i<dni.length()-1;i++) {
				if (!Character.isDigit(dni.charAt(i))) {
					return false;
				}
			}
			if (!Character.isLetter(dni.charAt(8))) {
				return false;
			}
			return true;
		}
		return false;
	}
	public boolean isValidTelephone(String telephone) {
		if (telephone.length()==9) {
			for (int i=0;i<telephone.length();i++) {
				if (!Character.isDigit(telephone.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public boolean isValidDate(String date) {
		String[] birthString = this.birthDate.split("/");
		int[] birthInt = new int[3];
		for (int i=0;i<birthString.length;i++) {
			birthInt[i]=Integer.parseInt(birthString[i]);
		}
		if (birthInt[0]>2019||birthInt[1]>12||birthInt[2]>31) {
			return false;
		}
		return true;
	}
	public int calculateAge() {
		String[] birthString = this.birthDate.split("/");
		int[] birthInt = new int[3];
		for (int i=0;i<birthString.length;i++) {
			birthInt[i]=Integer.parseInt(birthString[i]);
		}
		LocalDate birthDate = LocalDate.of(birthInt[0], birthInt[1], birthInt[2]);
		LocalDate currentDate = LocalDate.now();
		return Period.between(birthDate, currentDate).getYears();
	}
}