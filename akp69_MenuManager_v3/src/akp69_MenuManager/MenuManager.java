package akp69_MenuManager;

import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad>salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> menuItems = FileManager.readItems(dishesFile);
		for(int i = 0; i < menuItems.size(); i++) {
			if(menuItems.get(i) instanceof Entree)
				entrees.add((Entree)menuItems.get(i));
			if(menuItems.get(i) instanceof Side)
				sides.add((Side)menuItems.get(i));
			if(menuItems.get(i) instanceof Salad)
				salads.add((Salad)menuItems.get(i));
			if(menuItems.get(i) instanceof Dessert)
				desserts.add((Dessert)menuItems.get(i));
		}
	}

	public Menu randomMenu(String name) {
		Menu randomMenu = new Menu(name);

		randomMenu.setEntree(entrees.get( (int) (entrees.size() * Math.random() )));
		randomMenu.setSide(sides.get((int)(sides.size()*Math.random())));
		randomMenu.setSalad(salads.get((int)(salads.size()*Math.random())));
		randomMenu.setDessert(desserts.get((int)(desserts.size()*Math.random())));

		return randomMenu;
	}

	public Menu minCaloriesMenu(String name) {

		int min = Integer.MAX_VALUE;
		int[] count = new int[4];
		for(int i = 0; i < entrees.size();i++) {
			if(min > entrees.get(i).getCalories()) {
				min = entrees.get(i).getCalories();
				count[0] = i;
			}
		}
		min = Integer.MAX_VALUE;
		for(int i = 0; i < sides.size();i++) {
			if(min > sides.get(i).getCalories()) {
				min = sides.get(i).getCalories();
				count[1] = i;
			}
		}
		min = Integer.MAX_VALUE;
		for(int i = 0; i< salads.size();i++) {
			if(min > salads.get(i).getCalories()) {
				min = salads.get(i).getCalories();
				count[2] = i;
			}
		}
		min = Integer.MAX_VALUE;
		for(int i = 0; i < desserts.size();i++) {
			if(min > desserts.get(i).getCalories()) {
				min = desserts.get(i).getCalories();
				count[3] = i;
			}
		}

		return new Menu(name,entrees.get(count[0]),
				sides.get(count[1]),
				salads.get(count[2]),
				desserts.get(count[3]));
	}

	public Menu maxCaloriesMenu (String name) {

		int max = Integer.MIN_VALUE;
		int[] count = new int[4];
		for(int i = 0; i < entrees.size();i++) {
			if(max < entrees.get(i).getCalories()) {
				max = entrees.get(i).getCalories();
				count[0] = i;
			}
		}
		max = Integer.MIN_VALUE;
		for(int i = 0; i < sides.size();i++) {
			if(max < sides.get(i).getCalories()) {
				max = sides.get(i).getCalories();
				count[1] = i;
			}
		}
		max = Integer.MIN_VALUE;
		for(int i = 0; i < salads.size();i++) {
			if(max < salads.get(i).getCalories()) {
				max = salads.get(i).getCalories();
				count[2]=i;
			}
		}
		max = Integer.MIN_VALUE;
		for(int i = 0; i < desserts.size();i++) {
			if(max < desserts.get(i).getCalories()) {
				max = desserts.get(i).getCalories();
				count[3] = i;
			}
		}

		return new Menu(name,entrees.get(count[0]),
				sides.get(count[1]),
				salads.get(count[2]),
				desserts.get(count[3]));
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
	
}
