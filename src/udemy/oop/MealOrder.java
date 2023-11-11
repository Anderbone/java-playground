package udemy.oop;

public class MealOrder {
	private Burger burger;
	private Item drink;
	private Item side;

	public MealOrder(String burgerName, String drinkName, String sideName){
		this.burger = new Burger(4, burgerName);
		this.drink = new Item(1, drinkName, Type.DRINK);
		this.side = new Item(2, sideName, Type.SIDE);
	}

	public MealOrder(){
		this("todaySpecial", "coke", "fries");
	}
	double totalPrice;

	public double getTotalPrice(){
		return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
	}

	public void printItemizedList(){
		burger.printItem();
		drink.printItem();
		side.printItem();
		System.out.println("-".repeat(30));
		Item.printItem("Total price is ", getTotalPrice());
	}
}
