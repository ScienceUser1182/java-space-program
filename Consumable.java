package Assignment4;

public class Consumable extends Item {
	private String food;
	private String medicine;
	private String isWeed;
	public Consumable(String name, double weight, double value, double ID, double Durability, String food, String medicine, String isWeed) {
		super(name, weight, value, ID, Durability);
		this.food = food;
		this.medicine = medicine;
		this.isWeed = isWeed;
	}
	public String isFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String isMedicine() {
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
	@Override
	public String toString() {
		return ("Name: | "+this.getName()+
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight()+
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability()+
						" | Is Food: " + this.isFood()+
						" | Is Medicine: " + this.isMedicine()+
						" | Is Weed: " + this.getIsWeed() + " |");
	
	}
	
}
