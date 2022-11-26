package akp69_MenuManager;

public class MenuTest {
	public static void main(String[] args){
		MenuManager newMenu = new MenuManager("data/dishes.txt");
		
		Menu myMenu = newMenu.randomMenu("Regular Menu");
		System.out.println(myMenu.description());
		System.out.println(myMenu.totalCalories());
		System.out.println(myMenu.toString());
		System.out.println(myMenu.totalPrice());
		
		Menu maxMenu = newMenu.maxCaloriesMenu("Max Menu");
		System.out.println(maxMenu.description());
		System.out.println(maxMenu.totalCalories());
		System.out.println(maxMenu.toString());
		System.out.println(maxMenu.totalPrice());

		Menu minMenu = newMenu.minCaloriesMenu("Min Menu");
		System.out.println(minMenu.description());
		System.out.println(minMenu.totalCalories());
		System.out.println(minMenu.toString());
		System.out.println(minMenu.totalPrice());



	}
}
