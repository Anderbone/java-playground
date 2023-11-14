package designPattern.factory.buttons;

public class WebDialog extends Dialog{

	@Override
	Button createButton() {
		return new HTMLButton();
	}
}
