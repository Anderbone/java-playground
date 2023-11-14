package designPattern.factory.buttons;

public abstract class Dialog {
	abstract Button createButton();
	void renderWindow(){
		Button okButton = createButton();
		okButton.render();
	}
}
