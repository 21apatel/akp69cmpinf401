package akp69_lab10;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay) {
		this.name = name;
		this.address = address;
		this.pay = pay;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}

	
	

	
}
