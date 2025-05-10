package new_cargoship;

public class Node {
	private Node next;
	private Equippable equippable;
	private Consumable consumable;
	private Weapon weapon;
	private plunder plunder; 
	private String name;
	private double weight, value, ID, Durability;

	public Node() {
	}
	public Node(String name, double weight, double value, double ID, double Durability, Node next) {
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.ID = ID;
		this.Durability = Durability;
	}
	
	public Node(Equippable equippable, Node next) { 
		this.equippable = equippable;
		this.next = next;
	}

	public Node(Consumable consumable, Node next) {
		this.consumable = consumable;
		this.next = next;
	}
	public Node(Weapon weapon, Node next) {
		this.weapon = weapon;
		this.next = next;
	}
	public Node(plunder plunder, Node next) {
		this.plunder = plunder;
		this.next = next;
	}
	public Node(Equippable equippable) {
		this.equippable = equippable;
	}
	public Node(Consumable consumable) {
		this.consumable = consumable;
	}
	public Node(Weapon weapon) {
		this.weapon = weapon;
	}
	public Node(Equippable equippable, Consumable consumable, Weapon weapon) {
		this.equippable = equippable;
		this.consumable = consumable;
		this.weapon = weapon;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Equippable getEquippable() {
		return equippable;
	}
	public void setEquippable(Equippable equippable) {
		this.equippable = equippable;
	}
	public Consumable getConsumable() {
		return consumable;
	}
	public void setConsumable(Consumable consumable) {
		this.consumable = consumable;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
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
		return Durability;
	}
	public void setDurability(double durability) {
		Durability = durability;
	}
	public plunder getPlunder() {
		return plunder;
	}
	public void setPlunder(plunder plunder) {
		this.plunder = plunder;
	}
	
	
}