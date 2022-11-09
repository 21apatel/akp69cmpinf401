package akp69_lab10;

public abstract class Person {
	protected String name;
	protected String address = "String";
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
