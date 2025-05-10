package new_cargoship;

public class Weapon extends Node {
	private int strengthPerHit;
	private String type;
	private int damageSpeed;
	private String name;
	private double weight, value, ID, durability;
	

	public Weapon(int strengthPerHit, String type, int damageSpeed, String name, double weight, double value, double iD,
			double durability) {
		super();
		this.strengthPerHit = strengthPerHit;
		this.type = type;
		this.damageSpeed = damageSpeed;
		this.name = name;
		this.weight = weight;
		this.value = value;
		ID = iD;
		this.durability = durability;
	}
	

	public int getStrengthPerHit() {
		return strengthPerHit;
	}


	public void setStrengthPerHit(int strengthPerHit) {
		this.strengthPerHit = strengthPerHit;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getDamageSpeed() {
		return damageSpeed;
	}


	public void setDamageSpeed(int damageSpeed) {
		this.damageSpeed = damageSpeed;
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
		return "Name: | "+this.getName()+ " | Type: Weapon" +
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight()+
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability()+
						" | The strength: " + strengthPerHit+
						" | Type of Weapon: " + type+
						" | Damage speed: " + damageSpeed + " |";
	
	}
	
}
