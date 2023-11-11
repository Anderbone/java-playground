package udemy.oop;

public class Item{
	private double price = 0;
	private String name;
	private Type type;

	private Size size = Size.MEDIUM;

	public Item(double price, String name, Type type) {
		this.price = price;
		this.name = name.toUpperCase();
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}


	public double getPrice() {
		return price;
	}

	public String getName() {
		if (type.equals(Type.DRINK) || type.equals(Type.SIDE)){
			return size + " " + name;
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getBasePrice(){
		return price;
	}

	public double getAdjustedPrice(){
		return switch(size){
		case SMALL -> getBasePrice() - 0.5;
		case LARGE -> getBasePrice() + 1;
		default -> getBasePrice();
		};
	}

	public static void printItem(String name, double price){
		System.out.printf("%20s:%6.2f%n", name, price);
	}
	public void printItem(){
		printItem(getName(), getAdjustedPrice());
	}
}
