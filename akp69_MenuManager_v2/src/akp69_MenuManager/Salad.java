package akp69_MenuManager;
/**
 * Class Salad
 * @author: Akash Patel
 * @created: 10/08/22
 */

public class Salad {

	private String salName;
	private String salDescription;
	private int salCalories;

	public Salad() {
		this.salName = "";
		this.salDescription = "";
		this.salCalories = 0;

	}

	/**
	 * Constructor Method Salad
	 * @param name a String
	 * @param des a String
	 * @param cal an integer number
	 */
	public Salad(String name, String des, int cal) {

		this.salName = name;
		this.salDescription = des;
		this.salCalories = cal;
	}

	public String getSalName() {
		return salName;
	}

	public void setSalName(String salName) {
		this.salName = salName;
	}

	public String getSalDescription() {
		return salDescription;
	}

	public void setSalDescription(String salDescription) {
		this.salDescription = salDescription;
	}

	public int getSalCalories() {
		return salCalories;
	}

	public void setSalCalories(int salCalories) {
		this.salCalories = salCalories;
	}



}
