package new_cargoship;

public class Consumable extends Node {
	private String food, medicine, isWeed;
	private String name;
	private double weight, value, ID, durability;
	
	public Consumable(String food, String medicine, String isWeed, String name, double weight, double value, double iD,
			double durability) {
		super();
		this.food = food;
		this.medicine = medicine;
		this.isWeed = isWeed;
		this.name = name;
		this.weight = weight;
		this.value = value;
		ID = iD;
		this.durability = durability;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getIsWeed() {
		return isWeed;
	}

	public void setIsWeed(String isWeed) {
		this.isWeed = isWeed;
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
		return "Name: | "+this.getName()+ " | Type: Consumable" +
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight()+
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability()+
						" | Is Food: " + food+
						" | Is Medicine: " + medicine+
						" | Is Weed: " + isWeed + " |";
	
	}

	
}
