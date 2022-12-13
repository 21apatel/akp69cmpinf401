package akp69_MenuManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuManagerGUI {

	private JFrame frmMenuManager;
	private JFrame detailMenuManager;
	private JList<Menu> listd;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuManagerGUI app = new MenuManagerGUI();
	}

	/**
	 * Create the application.
	 */
	public MenuManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuManager = new JFrame();
		frmMenuManager.setTitle("Menu Manager");
		frmMenuManager.setBounds(100, 100, 700, 505);
		frmMenuManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuManager.getContentPane().setLayout(null);
		final int count = 0;

		MenuManager menu = new MenuManager("./src/akp69_MenuManager/data/dishes.txt");


		DefaultListModel<Menu> demoList = new DefaultListModel<>();
		listd = new JList<>(demoList);
		listd.setBounds(403, 67, 233, 335);
		frmMenuManager.getContentPane().add(listd);


		JLabel lblNewLabel = new JLabel("Build your own Menu");
		lblNewLabel.setBounds(18, 17, 132, 16);
		frmMenuManager.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Entree");
		lblNewLabel_1.setBounds(49, 45, 61, 16);
		frmMenuManager.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Side");
		lblNewLabel_2.setBounds(49, 85, 61, 16);
		frmMenuManager.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Salad");
		lblNewLabel_3.setBounds(49, 127, 61, 16);
		frmMenuManager.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Dessert");
		lblNewLabel_4.setBounds(49, 176, 61, 16);
		frmMenuManager.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Or generate a Menu");
		lblNewLabel_5.setBounds(49, 297, 186, 25);
		frmMenuManager.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Created Menus:");
		lblNewLabel_6.setBounds(403, 27, 123, 16);
		frmMenuManager.getContentPane().add(lblNewLabel_6);

		JComboBox comboBoxEntree = new JComboBox(menu.getEntrees().toArray());
		comboBoxEntree.setBounds(122, 41, 175, 27);
		frmMenuManager.getContentPane().add(comboBoxEntree);


		JComboBox comboBoxSide = new JComboBox(menu.getSides().toArray());
		comboBoxSide.setBounds(122, 81, 175, 27);
		frmMenuManager.getContentPane().add(comboBoxSide);


		JComboBox comboBoxSalad = new JComboBox(menu.getSalads().toArray());
		comboBoxSalad.setBounds(122, 123, 175, 27);
		frmMenuManager.getContentPane().add(comboBoxSalad);


		JComboBox comboBoxDessert = new JComboBox(menu.getDesserts().toArray());
		comboBoxDessert.setBounds(122, 172, 175, 27);
		frmMenuManager.getContentPane().add(comboBoxDessert);


		JButton btnNewButton = new JButton("Create Menu with these dishes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userInput= JOptionPane.showInputDialog("Enter your Menu Name:");
				Entree eChosen = (Entree)comboBoxEntree.getSelectedItem();
				Side sChosen = (Side)comboBoxSide.getSelectedItem();
				Salad saChosen = (Salad)comboBoxSalad.getSelectedItem();
				Dessert dChosen = (Dessert)comboBoxDessert.getSelectedItem();


				Menu newMenu = new Menu(userInput, eChosen, sChosen, saChosen, dChosen);
				JLabel writeName = new JLabel(newMenu.getMenuName());
				frmMenuManager.getContentPane().add(writeName);
				demoList.addElement(newMenu);
			}
		});

		btnNewButton.setBounds(18, 212, 279, 44);
		frmMenuManager.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Generate a Random Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userInput= JOptionPane.showInputDialog("Enter your Menu Name:");
				Menu newMenu = menu.randomMenu(userInput);
				demoList.addElement(newMenu);
			}
		});


		btnNewButton_1.setBounds(6, 332, 291, 29);
		frmMenuManager.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Generate a Minimum Calories Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userInput= JOptionPane.showInputDialog("Enter your Menu Name:");
				Menu newMenu = menu.minCaloriesMenu(userInput);
				demoList.addElement(newMenu);

			}
		});

		btnNewButton_2.setBounds(6, 373, 291, 29);
		frmMenuManager.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Generate a Maximum Calories Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userInput= JOptionPane.showInputDialog("Enter your Menu Name:");
				Menu newMenu = menu.maxCaloriesMenu(userInput);
				demoList.addElement(newMenu);
			}
		});

		btnNewButton_3.setBounds(6, 414, 291, 29);
		frmMenuManager.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Details");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailMenuManager = new JFrame();
				detailMenuManager.setTitle("Menu: My own Menu");
				detailMenuManager.setBounds(1000, 100, 900, 505);
				detailMenuManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				detailMenuManager.getContentPane().setLayout(null);

				Menu selectedMenu = listd.getSelectedValue();
				//String calories = Integer.toString(selectedMenu.totalCalories());
				//String price = Integer.toString(s)

				JLabel lblNewLabel_1 = new JLabel("Entree");
				lblNewLabel_1.setBounds(20, 20, 61, 16);
				detailMenuManager.getContentPane().add(lblNewLabel_1);

				JLabel lblNewLabel_2 = new JLabel("Side");
				lblNewLabel_2.setBounds(20, 100, 61, 16);
				detailMenuManager.getContentPane().add(lblNewLabel_2);

				JLabel lblNewLabel_3 = new JLabel("Salad");
				lblNewLabel_3.setBounds(20, 180, 61, 16);
				detailMenuManager.getContentPane().add(lblNewLabel_3);

				JLabel lblNewLabel_4 = new JLabel("Dessert");
				lblNewLabel_4.setBounds(20, 260, 61, 16);
				detailMenuManager.getContentPane().add(lblNewLabel_4);

				JLabel lblNewLabel_5 = new JLabel("Total Calories:");
				lblNewLabel_5.setBounds(20,350, 100, 16);
				detailMenuManager.getContentPane().add(lblNewLabel_5);

				JLabel lblNewLabel_6 = new JLabel("Total Price:");
				lblNewLabel_6.setBounds(20,425,100,16);
				detailMenuManager.getContentPane().add(lblNewLabel_6);

				JTextArea entreeLabel = new JTextArea(selectedMenu.getEntree().getName() + "\n" + selectedMenu.getEntree().getDescription() +"\nCalories: "+ selectedMenu.getEntree().getCalories() +"\nPrice: $"+ selectedMenu.getEntree().getPrice(), 4, 4);
				entreeLabel.setBounds(70, 20, 800,70);
				entreeLabel.setEditable(false);
				detailMenuManager.getContentPane().add(entreeLabel);

				JTextArea sideLabel = new JTextArea(selectedMenu.getSide().getName() + "\n" + selectedMenu.getSide().getDescription() + "\nCalories: " + selectedMenu.getSide().getCalories() + "\nPrice: $" + selectedMenu.getSide().getPrice(), 3, 3);
				sideLabel.setBounds(70,100, 800,70);
				sideLabel.setEditable(false);
				detailMenuManager.getContentPane().add(sideLabel);

				JTextArea saladLabel = new JTextArea(selectedMenu.getSalad().getName() + "\n" + selectedMenu.getSalad().getDescription() + "\nCalories: " + selectedMenu.getSalad().getCalories() + "\nPrice: $" + selectedMenu.getSalad().getPrice(), 3, 3);
				saladLabel.setBounds(70,180,800,70);
				saladLabel.setEditable(false);
				detailMenuManager.getContentPane().add(saladLabel);

				JTextArea dessertLabel = new JTextArea(selectedMenu.getDessert().getName() + "\n" + selectedMenu.getDessert().getDescription() + "\nCalories: " + selectedMenu.getDessert().getCalories() + "\nPrice: $" + selectedMenu.getDessert().getPrice(), 3, 3);
				dessertLabel.setBounds(70,260,800,70);
				dessertLabel.setEditable(false);
				detailMenuManager.getContentPane().add(dessertLabel);	

				JTextArea caloriesLabel = new JTextArea(Integer.toString(selectedMenu.totalCalories()));
				caloriesLabel.setBounds(120, 350, 60, 20);
				caloriesLabel.setEditable(false);
				detailMenuManager.getContentPane().add(caloriesLabel);

				JTextArea priceLabel = new JTextArea("$" + Double.toString(selectedMenu.totalPrice()));
				priceLabel.setBounds(100,425, 60, 20);
				priceLabel.setEditable(false);
				detailMenuManager.getContentPane().add(priceLabel);

				detailMenuManager.setVisible(true);

			}
		});
		btnNewButton_4.setBounds(363, 414, 117, 29);
		frmMenuManager.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Delete All");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				demoList.removeAllElements();
			}
		});
		btnNewButton_5.setBounds(472, 414, 117, 29);
		frmMenuManager.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Save to file");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Menu> createdMenus = new ArrayList<>();
				// ListModel model = listd.getModel();
				for(int i = 0; i < demoList.getSize(); i++)
				{
					// model.getElementAt(i).writeMenus("data/writeMenu.txt", model.selectedMenu);
					createdMenus.add(demoList.get(i));
					// Only way my program will run
					FileManager.writeMenus("./src/akp69_MenuManager/data/menus.txt", createdMenus);
				}
			}
		});
		btnNewButton_6.setBounds(583, 414, 117, 29);
		frmMenuManager.getContentPane().add(btnNewButton_6);


		frmMenuManager.setVisible(true);

	}
}
