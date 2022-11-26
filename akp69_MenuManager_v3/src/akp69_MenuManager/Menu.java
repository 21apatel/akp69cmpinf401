package akp69_MenuManager;
/**
 * Class Menu
 * @author: Akash Patel
 * @created: 10/08/22
 */

public class Menu {
	private String menuName;
	private Entree entree;
	private Side side;
	private Dessert dessert;
	private Salad salad;

	/**
	 * Constructor Method Menu
	 * @param name a String
	 */
	public Menu(String name){
		this.menuName = name;
		this.entree = null;
		this.side = null;
		this.dessert = null;
		this.salad = null;

	}

	/**
	 * Constructor Method Menu
	 * @param name a String
	 * @param entree an Entree Object
	 * @param side a Side Object 
	 */

	public Menu(String name, Entree entree, Side side) {
		this.menuName = name;
		this.entree = entree;
		this.side = side;
		this.dessert = null;
		this.salad = null;
	}

	/**
	 * Constructor Method Menu
	 * @param name a String
	 * @param entree an Entree Object
	 * @param side a Side Object 
	 * @param salad a Salad Object
	 * @param dessert a Dessert Object
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.menuName = name;
		this.entree = entree;
		this.side = side;
		this.dessert = dessert;
		this.salad = salad;

	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	/**
	 * Method totalCals
	 * @return the total number of calories in the Menu Object
	 */
	public int totalCalories() {
		int totalCals = 0;

		if(dessert != null)
		{
			totalCals += dessert.getCalories();
		}
		if(salad != null)
		{
			totalCals += salad.getCalories();
		}
		if(entree != null)
		{
			totalCals += entree.getCalories();
		}
		if(side != null)
		{
			totalCals += side.getCalories();
		}
		return totalCals;
	}

	/**
	 * Method description
	 * @return description of each item in menu object in the form of a menu
	 */

	public String description() {
		String totalDes = "\n";

		if(entree!= null)
		{
			totalDes += "Entree: " + entree.getName() + ". " + entree.getDescription() + "\n";
		}
		else
			totalDes += "Entree: N/A\n";

		if(side != null)
		{
			totalDes += "Side: " + side.getName() + ". " + side.getDescription() + "\n";
		}
		else
			totalDes += "Side: N/A\n";

		if(salad != null)
		{
			totalDes += "Salad: " + salad.getName() + ". " + salad.getDescription() + "\n";

		}
		else
			totalDes += "Salad: N/A\n";

		if(dessert != null)
		{
			totalDes += "Dessert: " + dessert.getName() + ". " + dessert.getDescription() + "\n";

		}
		else
			totalDes += "Dessert: N/A\n";

		return totalDes;
	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + "]";
	}

	public double totalPrice() {
		double totalPrice = 0;

		if(dessert != null)
		{
			totalPrice += dessert.getPrice();
		}
		if(salad != null)
		{
			totalPrice += salad.getPrice();
		}
		if(entree != null)
		{
			totalPrice += entree.getPrice();
		}
		if(side != null)
		{
			totalPrice += side.getPrice();
		}
		return totalPrice;

	}

}
