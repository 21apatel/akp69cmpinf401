package akp69_MenuManager;

/**
 * Class Dessert
 * @author: Akash Patel
 * @created: 10/08/22
 */

public class Dessert {
	private String desName;
	private String desDescription;
	private int desCalories;

	public Dessert() {
		this.desName = "";
		this.desDescription = "";
		this.desCalories = 0;
	}

	/**
	 * Constructor Method for Dessert Class
	 * @param name a String
	 * @param des  a String
	 * @param cal  an integer number
	 */
	public Dessert(String name, String des, int cal) {
		this.desName = name;
		this.desDescription = des;
		this.desCalories = cal;

	}

	public String getDesName() {
		return desName;
	}

	public void setDesName(String desName) {
		this.desName = desName;
	}

	public String getDesDescription() {
		return desDescription;
	}

	public void setDesDescription(String desDescription) {
		this.desDescription = desDescription;
	}

	public int getDesCalories() {
		return desCalories;
	}

	public void setDesCalories(int desCalories) {
		this.desCalories = desCalories;
	}

}
