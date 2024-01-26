package Assignment4;

public class Equippable extends Item {
	private String perk, material;
	private double age;
	public Equippable(String name, double weight, double value, double ID, double Durability, String material, double age, String perk) {
		super(name, weight, value, ID, Durability);
		this.perk = perk;
		this.material = material;
		this.age = age;
	}
	public String getPerk() {
		return perk;
	}
	public void setPerk(String perk) {
		this.perk = perk;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return ("Name: | "+this.getName()+
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight()+
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability()+
						" | Made of: " + this.getMaterial()+
						" | Age: " + this.getAge() +
						" | The Perk: " + this.getPerk() + " |");
	}
}