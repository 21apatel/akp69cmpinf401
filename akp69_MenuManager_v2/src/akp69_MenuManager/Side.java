package akp69_MenuManager;
/**
 * Class Side
 * @author: Akash Patel
 * @created: 10/08/22
 */

public class Side {
	private String sideName;
	private String sideDescription;
	private int sideCalories;

	public Side() {
		this.sideName = "";
		this.sideDescription = "";
		this.sideCalories = 0;
	}

	/**
	 * Constructor Method Side
	 * @param name a String
	 * @param des a String
	 * @param cal an integer number
	 */
	public Side(String name, String des, int cal) {
		this.sideName = name;
		this.sideDescription = des;
		this.sideCalories = cal;
	}

	public String getSideName() {
		return sideName;
	}

	public void setSideName(String sideName) {
		this.sideName = sideName;
	}

	public String getSideDescription() {
		return sideDescription;
	}

	public void setSideDescription(String sideDescription) {
		this.sideDescription = sideDescription;
	}

	public int getSideCalories() {
		return sideCalories;
	}

	public void setSideCalories(int sideCalories) {
		this.sideCalories = sideCalories;
	}



}
