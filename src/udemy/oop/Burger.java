package udemy.oop;

public class Burger extends Item{
	private Item extra1;
	private Item extra2;
	private Item extra3;

	public Burger(double price, String name) {
		super(price, name, Type.BURGER);
	}

	@Override
	public String getName() {
		return super.getName() + Type.BURGER;
	}

	@Override
	public double getAdjustedPrice() {
		return getBasePrice() + getExtraPrice();
	}

	private double getExtraPrice() {
		return (extra1 == null ? 0 : extra1.getAdjustedPrice()) +
				(extra2 == null ? 0 : extra2.getAdjustedPrice()) +
				(extra3 == null ? 0 : extra3.getAdjustedPrice());
	}

	public void addToppings(){

	}
}
