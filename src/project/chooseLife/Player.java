package project.chooseLife;

public class Player {
	private String name;
	private Gender gender = Gender.NOWHERE;
	private SpeakBehavior speakBehavior;

	public SpeakBehavior getSpeakBehavior() {
		return speakBehavior;
	}

	public void setSpeakBehavior(SpeakBehavior speakBehavior) {
		this.speakBehavior = speakBehavior;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}



}
