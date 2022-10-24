package akp69_lab7;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		
		String arrayLength= JOptionPane.showInputDialog("Enter the amount of items in the array");
		double dArrayLength = Double.parseDouble(arrayLength);
		
		double[] values = new double[(int) dArrayLength];
		
		for(int i = 0; i < values.length;i++) {
			
			values[i] = rand.nextDouble(11);
			System.out.println("Value at index " + i + " = "+ values[i]);
		}
			
		System.out.println("The max is " + max(values));
		System.out.println("The min is " + min(values));
		System.out.println("The sum  is " + sum(values));
		System.out.println("The average is " + ave(values));


	}
	
	public static double max(double[] data) {
		double max = data[0];
		for(int i = 0; i < data.length;i++) {
			if(data[i] > max) {
				max = data[i];
				
			}
		}
		return max;
	}
	
	public static double min(double[] data) {

		double min = data[0];
		for(int i = 0; i < data.length;i++) {
			if(data[i] < min) {
				min = data[i];
				
			}
		}
		return min;
		
	}
	
	public static double sum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length;i++) {
			sum = sum + data[i];
		}
		return sum;
	}
	
	public static double ave(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length;i++) {
			sum = sum + data[i];
		}
		double average = sum / data.length;
		return average;
	}

}
