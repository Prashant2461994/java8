package com.jlcindia.optional.usecase;

public class Trainer {

	public Trainer() {

	}

	public Trainer(String trainerName, String trainerEmail, String trainerPhone) {
		super();
		this.trainerName = trainerName;
		this.trainerEmail = trainerEmail;
		this.trainerPhone = trainerPhone;
	}

	private String trainerName;
	private String trainerEmail;
	private String trainerPhone;

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerEmail() {
		return trainerEmail;
	}

	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}

	public String getTrainerPhone() {
		return trainerPhone;
	}

	public void setTrainerPhone(String trainerPhone) {
		this.trainerPhone = trainerPhone;
	}

}
