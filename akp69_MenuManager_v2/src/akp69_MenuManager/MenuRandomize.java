package akp69_MenuManager;
import java.util.ArrayList;
/**
 * Class MenuRandomize
 * @author Akash Patel
 * @created: 10/31/2022
 */

public class MenuRandomize {

	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad>salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();



	/**
	 * Method MenuRandomize
	 * @param entreeFile a String
	 * @param sideFile a String
	 * @param saladFile a String
	 * @param dessertFile a String
	 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}

	/**
	 * Method randomMenu
	 * @return randomized menu object
	 */
	public Menu randomMenu() {
		Menu randomMenu = new Menu("Random Menu");

		randomMenu.setEntree(entrees.get( (int) (entrees.size() * Math.random() )));
		randomMenu.setSide(sides.get((int)(sides.size()*Math.random())));
		randomMenu.setSalad(salads.get((int)(salads.size()*Math.random())));
		randomMenu.setDessert(desserts.get((int)(desserts.size()*Math.random())));

		return randomMenu;

	}
}
