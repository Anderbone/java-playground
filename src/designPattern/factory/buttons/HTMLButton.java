package designPattern.factory.buttons;

public class HTMLButton implements Button{
	@Override
	public void render() {
		System.out.println("<button>Test button</button>");
		onClick();
	}

	@Override
	public void onClick() {
		System.out.println("clicked! Hey");
	}
}
