package akp69_MenuManager;

/**
 * Class Entree
 * @author: Akash Patel
 * @created: 10/08/22
 */

public class Entree {

	private String entName;
	private String entDescription;
	private int entCalories;

	public Entree() {
		this.entName = "";
		this.entDescription = "";
		this.entCalories = 0;

	}

	/**
	 * Constructor Method for Entree Class
	 * @param name a String
	 * @param des  a String
	 * @param cal  an integer number
	 */

	public Entree(String name, String des, int cal) {
		this.entName = name;
		this.entDescription = des;
		this.entCalories = cal;
	}

	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntDescription() {
		return entDescription;
	}

	public void setEntDescription(String entDesription) {
		this.entDescription = entDesription;
	}

	public int getEntCalories() {
		return entCalories;
	}

	public void setEntCalories(int entCalories) {
		this.entCalories = entCalories;
	}

}
