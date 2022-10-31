package akp69_MenuManager;
/**
 * Class MenuTest
 * @author: Akash Patel
 * @created: 10/08/22
 */

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Entree ChickenSandwich = new Entree("Chicken Sandwich", "Seasoned and seared chicken raised without antibiotics, parmesan crisps, emerald greens and garlic aioli on a brioche roll.", 570);
		Entree GrilledCheese = new Entree("Grilled Cheese Sandwich", "Sliced American cheese grilled on thick-sliced Classic White Miche", 880);

		Side Chips = new Side("Chips", "Salted and Kettle Cooked", 110);
		Side Fries = new Side("Fries", "Salted and served with ketchup", 200);

		Salad FujiSalad = new Salad("Fuju Apple Salad", "Chicken raised without antibiotics, arugula, romaine, baby kale and red leaf blend, grape tomatoes, red onions, toasted pecan pieces, Gorgonzola and apple chips tossed in sweet white balsamic vinaigrette", 560);
		Salad CaesarSalad = new Salad("Caesar Salad", "Chicken raised without antibiotics, romaine, grated Parmesan and homemade black pepper focaccia croutons tossed with Caesar dressing.", 440);

		Dessert ChoChipCoo = new Dessert("Chocolate Chip Cookie", "A traditional favorite, freshly baked and made with semi-sweet chocolate chunks & milk chocolate flakes", 390);

		Menu Menu1 = new Menu("Monday's Menu", ChickenSandwich, Fries);
		Menu Menu2 = new Menu("Tuesday's Menu", GrilledCheese, Chips, CaesarSalad, ChoChipCoo);
		Menu Menu3 = new Menu("Wednesday's Menu");

		System.out.println(Menu1.getMenuName() + Menu1.description() + Menu1.totalCalories() + "\n\n\n\n\n\n");
		System.out.println(Menu2.getMenuName() + Menu2.description() + Menu2.totalCalories() + "\n\n\n\n\n\n");
		System.out.println(Menu3.getMenuName() + Menu3.description() + Menu3.totalCalories() + "\n\n\n\n\n\n");


	}

}

