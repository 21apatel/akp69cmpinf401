package akp69_MenuManager;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
/**
 * Class FileManager
 * @author Akash Patel
 * @created 10/31/2022
 */
public class FileManager {
	
	/**
	 * Method readItems
	 * @param fileName a String
	 * @return item an ArrayList
	 */

	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> item = new ArrayList<MenuItem>();
		//String path = "/Users/akashpatel/eclipse-workspace/akp69_MenuManager_v3/src/akp69_MenuManager/";
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp[1].equals("dessert")) {
					MenuItem d = new Dessert();
					d.setName(temp[0]);
					d.setDescription(temp[2]);
					d.setCalories(Integer.parseInt(temp[3]));
					d.setPrice(Double.parseDouble(temp[4]));
					item.add(d);
				}
				else if(temp[1].equals("entree")) {
					MenuItem d = new Entree();
					d.setName(temp[0]);
					d.setDescription(temp[2]);
					d.setCalories(Integer.parseInt(temp[3]));
					d.setPrice(Double.parseDouble(temp[4]));
					item.add(d);
				}
				else if(temp[1].equals("salad")) {
					MenuItem d = new Salad();
					d.setName(temp[0]);
					d.setDescription(temp[2]);
					d.setCalories(Integer.parseInt(temp[3]));
					d.setPrice(Double.parseDouble(temp[4]));
					item.add(d);
				}
				else if(temp[1].equals("side")) {
					MenuItem d = new Side();
					d.setName(temp[0]);
					d.setDescription(temp[2]);
					d.setCalories(Integer.parseInt(temp[3]));
					d.setPrice(Double.parseDouble(temp[4]));
					item.add(d);
				}
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return item;
	}

	/**
	 * Method writeMenus
	 * @param fileName a String
	 * @param menus an ArrayList
	 * writes into a new file
	 */
	public static void writeMenus(String fileName, ArrayList<Menu> menus) {
		//String path = "/Users/akashpatel/eclipse-workspace/akp69_MenuManager_v3/src/akp69_MenuManager/";
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).getMenuName() + "\n" + menus.get(i).description() + "\nTotal Calories: " + menus.get(i).totalCalories() + "\nTotal Price " + menus.get(i).totalPrice());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
