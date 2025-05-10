package new_cargoship;

public class Equippable extends Node {
	private String perk, material;
	private double age;
	private String name;
	private double weight, value, ID, durability;
	
	
	public Equippable(String perk, String material, double age, String name, double weight, double value, double iD,
			double durability) {
		super();
		this.perk = perk;
		this.material = material;
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.value = value;
		ID = iD;
		this.durability = durability;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public double getID() {
		return ID;
	}


	public void setID(double iD) {
		ID = iD;
	}


	public double getDurability() {
		return durability;
	}


	public void setDurability(double durability) {
		this.durability = durability;
	}


	@Override
	public String toString() {
		return "Name: | "+this.getName()+ " | Type: Equippable" +
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight()+
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability()+
						" | Made of: " + material+
						" | Age: " + age +
						" | The Perk: " + perk + " |";
	}
}
