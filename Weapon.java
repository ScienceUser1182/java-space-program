package Assignment4;

public class Weapon extends Item {
	private int strengthPerHit;
	private String type;
	private int damageSpeed;
	public Weapon(String name, double weight, double value, double ID, double Durability, int strengthPerHit,
			String type, int damageSpeed) {
		super(name, weight, value, ID, Durability);
		this.strengthPerHit = strengthPerHit;
		this.type = type;
		this.damageSpeed = damageSpeed;
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
	
	@Override
	public String toString() {
		return ("Name: | "+this.getName()+
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight()+
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability()+
						" | The strength: " + this.getStrengthPerHit()+
						" | Type of Weapon: " + this.getType()+
						" | Damage speed: " + this.getDamageSpeed() + " |");
	
	}
	
}
