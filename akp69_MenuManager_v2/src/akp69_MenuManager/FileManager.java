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
	 * Method ArrayList<Entree> readEntrees
	 * @param fileName a String
	 * @return the entrees ArrayList
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		String path = "/Users/akashpatel/eclipse-workspace/akp69_MenuManager_v2/src/akp69_MenuManager/";
		try {
			FileReader fr = new FileReader(path + fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				Entree e = new Entree();
				e.setEntName(temp[0]);
				e.setEntDescription(temp[1]);
				e.setEntCalories(Integer.parseInt(temp[2]));
				entrees.add(e);
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());	
		}


		return entrees;

	}
	/**
	 * Method ArrayList<Side> readSides
	 * @param fileName a String
	 * @return the sides ArrayList
	 */

	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sides = new ArrayList<Side>();
		String path = "/Users/akashpatel/eclipse-workspace/akp69_MenuManager_v2/src/akp69_MenuManager/";
		try {
			FileReader fr = new FileReader(path + fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				Side s = new Side();
				s.setSideName(temp[0]);
				s.setSideDescription(temp[1]);
				s.setSideCalories(Integer.parseInt(temp[2]));
				sides.add(s);
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());	
		}

		return sides;
	}

	/**
	 * Method ArrayList<Salad> readSalads
	 * @param fileName a String
	 * @return the salads ArrayList
	 */

	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salads = new ArrayList<Salad>();
		String path = "/Users/akashpatel/eclipse-workspace/akp69_MenuManager_v2/src/akp69_MenuManager/";
		try {
			FileReader fr = new FileReader(path + fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				Salad s = new Salad();
				s.setSalName(temp[0]);
				s.setSalDescription(temp[1]);
				s.setSalCalories(Integer.parseInt(temp[2]));
				salads.add(s);
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());	
		}

		return salads;
	}
	/**
	 * Method ArrayList<Dessert> readDesserts
	 * @param fileName a String
	 * @return the desserts ArrayList
	 */
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		String path = "/Users/akashpatel/eclipse-workspace/akp69_MenuManager_v2/src/akp69_MenuManager/";
		try {
			FileReader fr = new FileReader(path + fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				Dessert d = new Dessert();
				d.setDesName(temp[0]);
				d.setDesDescription(temp[1]);
				d.setDesCalories(Integer.parseInt(temp[2]));
				desserts.add(d);
			}
			br.close();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());	
		}

		return desserts;
	}

}
