package designPattern.factory.buttons;

public class WindowsDialog extends Dialog{

	@Override
	Button createButton() {
		return new WindowsButton();
	}
}
