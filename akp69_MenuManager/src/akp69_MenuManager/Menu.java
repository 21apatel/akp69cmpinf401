package akp69_MenuManager;
/**
 * Class Menu
 * author: Akash Patel
 * created: 10/08/22
 */

public class Menu {
	private String menuName;
	private Entree entree;
	private Side side;
	private Dessert dessert;
	private Salad salad;
	
	public Menu(String name){
		this.menuName = name;
		this.entree = null;
		this.side = null;
		this.dessert = null;
		this.salad = null;
		
	}
	
	public Menu(String name, Entree entree, Side side) {
		this.menuName = name;
		this.entree = entree;
		this.side = side;
		this.dessert = null;
		this.salad = null;
	}
	
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

	public int totalCalories() {
		int totalCals = 0;
		
		if(dessert != null)
		{
			totalCals += totalCals + dessert.getDesCalories();
		}
		if(salad != null)
		{
			totalCals += totalCals + salad.getSalCalories();
		}
		if(entree != null)
		{
			totalCals += totalCals + entree.getEntCalories();
		}
		if(side != null)
		{
			totalCals += totalCals + side.getSideCalories();
		}
		return totalCals;
	}
	
	public String description() {
		String totalDes = "\n";
		
		if(entree!= null)
		{
			totalDes += "Entree: " + entree.getEntName() + ". " + entree.getEntDesription() + "\n";
		}
		else
			totalDes += "Entree: N/A\n";
		
		if(side != null)
		{
			totalDes += "Side: " + side.getSideName() + ". " + side.getSideDescription() + "\n";
		}
		else
			totalDes += "Side: N/A\n";
		
		if(salad != null)
		{
			totalDes += "Salad: " + salad.getSalName() + ". " + salad.getSalDescription() + "\n";

		}
		else
			totalDes += "Salad: N/A\n";
		
		if(dessert != null)
		{
			totalDes += "Dessert: " + dessert.getDesName() + ". " + dessert.getDesDescription() + "\n";

		}
		else
			totalDes += "Dessert: N/A\n";
		
		return totalDes;
	}

}
