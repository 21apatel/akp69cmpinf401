package akp69_lab10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person akash = new Student("Akash", "IOWA ST", "BIOINFORMATICS", 2025, 9000);
		System.out.println(akash);
		
		Person wang = new Staff("Yiming", "Chevron", 70000);
		System.out.println(wang);
		
		Circle cir1 = new Circle();
		System.out.println(cir1.getArea());
		
		Cylinder cy1 = new Cylinder();
		System.out.println(cy1.getVolume());
	}
	

}
