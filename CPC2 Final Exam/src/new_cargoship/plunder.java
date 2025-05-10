package new_cargoship;

public class plunder extends Node {
	
	private String name;
	private double weight, value;
	
	public plunder(String name, double weight, double value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
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

	@Override
	   public String toString() {
	        return ("Name: | "+name +
	                    " | Weight: "+ weight +
	                    " | Value: " + value + " | "
	                 );
	        			
	}
}
