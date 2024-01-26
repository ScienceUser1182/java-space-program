package Assignment4;

import java.util.ArrayList;

public class Item {
	private ArrayList<Item> list = new ArrayList<>();
	private String name;
	private double weight, value, ID, Durability;
	public Item(String name, double weight, double value, double ID, double Durability) {
		this.name = name;
		this.ID = ID;
		this.weight = weight;
		this.value = value;
		this.Durability = Durability;
	}
	public ArrayList<Item> getList() {
		return list;
	}
	public void setList(ArrayList<Item> list) {
		this.list = list;
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
	@Override
	   public String toString() {
	        return ("Name: | "+this.getName()+
	                    " | ID: "+ this.getID() +
	                    " | Weight: "+ this.getWeight() +
	                    " | Value: " + this.getValue()+
	                    " | Durability: " + this.getDurability());
	        			
	}
}