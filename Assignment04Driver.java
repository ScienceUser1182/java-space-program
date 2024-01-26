package Assignment4;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Assignment04Driver {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		new Assignment04Driver();
	}
	public Assignment04Driver() {
		ArrayList<Item> shiphold = new ArrayList<Item>();

		System.out.println("Welcome to the BlackStar Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while (true) {
			System.out.println("1: Add an item to the cargo hold.");
			System.out.println("2: Remove an item from the cargo hold.");
			System.out.println("3: Sort the contents of the cargo hold by name.");
			System.out.println("4: Search for an item.");
			System.out.println("5: Display the items in the ship hold.");
			System.out.println("6: Decode intercepted message");
			System.out.println("7: Unload/load items");
			System.out.println("0: Exit the BlackStar Cargo Hold interface.");

			int userChoice = input.nextInt();
			input.nextLine();

			switch (userChoice) {
			case 1:
				addItem(shiphold);
				break;
			case 2:
				removeItem(shiphold);
				break;
			case 3:
				sortItems(shiphold);
				break;
			case 4:
				searchItems(shiphold);
				break;
			case 5:
				displayItems(shiphold);
				break;
			case 6:
				decodeMessage();
				break;
			case 7:
				loader(shiphold);
			case 0:
				System.out.println("Would you like to shut down all systems and exit the ship? (Yes/No)");
				String choice_exit = input.toString();
				input.nextLine();
				if (choice_exit == "Yes") {
					System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
					System.exit(0);
				}
				else if (choice_exit == "No") {
					return;
				}
			}
		}

	}
	public double maxWeight = 0;
	private void addItem(ArrayList<Item> shiphold) {
		if (maxWeight <= 25) {
			System.out.println("1: Add an Equippable");
			System.out.println("2: Add a Consumable");
			System.out.println("3: Add a weapon");
			int choice = input.nextInt();
			input.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the name of the Equippable you would like to add: ");
				String name = input.nextLine();

				System.out.println("Enter the Equippable's ID: ");
				int ID = input.nextInt();
				input.nextLine();

				System.out.println("Enter the weight of the Equippable(in pounds):");
				double weight = input.nextDouble();
				input.nextLine();

				System.out.println("Enter the value of the Equippable($):");
				double value = input.nextDouble();
				input.nextLine();

				System.out.println("Enter the durability of the Equippable(1-10):");
				int durability = input.nextInt();
				input.nextLine();

				System.out.println("Enter the material of the Equippable:");
				String material = input.nextLine();

				System.out.println("Enter the age of the Equippable(in years):");
				int age = input.nextInt();
				input.nextLine();

				System.out.println("Enter the Equippable's perk:");
				String perk = input.nextLine();

				Equippable myEquippable = new Equippable(name, ID, weight, value, durability, material, age, perk);
				shiphold.add(myEquippable);
				maxWeight = maxWeight + (weight * 0.001);

				break;
			case 2:
				System.out.println("Enter the name of the Consumable you would like to add: ");
				String name2 = input.nextLine();

				System.out.println("Enter the Consumable's ID:");
				int ID2 = input.nextInt();
				input.nextLine();

				System.out.println("Enter the weight of the Consumable(in pounds):");
				double weight2 = input.nextDouble();
				input.nextLine();

				System.out.println("Enter the value of the Consumable($):");
				double value2 = input.nextDouble();
				input.nextLine();

				System.out.println("Enter the durability of the Consumable(1-10):");
				int durability2 = input.nextInt();
				input.nextLine();

				System.out.println("Is it food(Yes/No)?");
				String food = input.nextLine();

				System.out.println("Is it medicine(Yes/No)?");
				String medicine = input.nextLine();

				System.out.println("Is it weed(Yes/No)?");
				String weed = input.nextLine();

				Consumable myConsumable = new Consumable(name2, ID2, weight2, value2, durability2, food, medicine, weed);
				maxWeight = maxWeight + (weight2 * 0.001);

				shiphold.add(myConsumable);

				break;
			case 3:
				System.out.println("Enter the name of the Weapon you would like to add: ");
				String name3 = input.nextLine();

				System.out.println("Enter the ID of the Weapon: ");
				int ID3 = input.nextInt();
				input.nextLine();

				System.out.println("Enter the weight of the weapon(in pounds):");
				double weight3 = input.nextDouble();
				input.nextLine();

				System.out.println("Enter the value of the weapon($):");
				double value3 = input.nextDouble();
				input.nextLine();

				System.out.println("Enter the durability of the weapon(1-10):");
				int durability3 = input.nextInt();
				input.nextLine();

				System.out.println("Enter the strength/force per hit(in newtons):");
				int strengthPerHit = input.nextInt();
				input.nextLine();

				System.out.println("Enter type of weapon:");
				String type = input.nextLine();

				System.out.println("Enter damage speed of weapon(m/s):");
				int damageSpeed = input.nextInt();
				input.nextLine();

				Weapon myWeapon = new Weapon(name3, ID3, weight3, value3, durability3, strengthPerHit, type, damageSpeed);

				shiphold.add(myWeapon);
				maxWeight = maxWeight + (weight3 * 0.001);

				break;
			}

		}
		else {
			System.out.println("The Shiphold has reached maximum capacity of 25 tons. Please remove items to add more.");//only when adding items should the user know when the maximum capacity has been reached
		}
	}
	private void removeItem(ArrayList<Item> shiphold) {
		// TODO: Remove an item that is specified by the user
		System.out.println("Enter the name of the item: ");
		String name = input.nextLine();
		System.out.println("Enter the ID of the item: ");
		int ID = input.nextInt();

		System.out.println("Enter the weight of the item: ");
		double weight = input.nextDouble();

		System.out.println("Enter the value of the item: ");
		double value = input.nextDouble();

		System.out.println("Enter the durability of the item: ");
		int durability = input.nextInt();

		for (int i = 0; i < shiphold.size(); i++) {
			if(shiphold.get(i).getName().equals(name) && shiphold.get(i).getID() == ID
					&& shiphold.get(i).getWeight() == weight && 
					shiphold.get(i).getValue() == value && shiphold.get(i).getDurability() == durability) {

				shiphold.remove(i);
				System.out.println("The item has been removed");
				return;
			}
		}
	}
	private void sortItems(ArrayList<Item> shiphold) {
		// TODO: Sort the items in the cargo hold (No need to display them here) - Use Selection or Insertion sorts
		// NOTE: Special care is needed when dealing with strings! research the compareTo() method with strings
		for (int i = 0; i < shiphold.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < shiphold.size(); j++) {
				if (shiphold.get(min).getName().compareToIgnoreCase(shiphold.get(j).getName()) > 0) {
					min = j;
				}
			}
			Item temp = shiphold.get(min);
			shiphold.set(min,  shiphold.get(i));
			shiphold.set(i,  temp);
		}	
	}
	private void searchItems(ArrayList<Item> shiphold) {
		System.out.println("Enter the name of the item to find");
		String nameToSearch = input.nextLine();
		System.out.println("Enter the id of the item to search");
		int idToSearch = input.nextInt();
		input.nextLine();
		//*Needs Help*
		for (Item item : shiphold) {
			if(item.getName().equalsIgnoreCase(nameToSearch) && item.getID() == idToSearch) {//if no value in the shiphold is null, and the searched term matches ignoring
				System.out.println(item.getName() + " was found at index " + shiphold.indexOf(item)); //the case, then it will print the result of its findings
				System.out.println();
				return;
			}
		}
		System.out.println(nameToSearch + " with id " + idToSearch + " was not found");
		System.out.println();
	}

	private void displayItems(ArrayList<Item> shiphold) {
		for (int o = 0; o < shiphold.size(); o++) {
			System.out.println(shiphold.get(o).toString());
		}
	}
	private void decodeMessage() {
		System.out.println("Enter the message received to decrypt");
		String ciphertext = input.nextLine();
		StringBuffer decrypt = new StringBuffer();

		for (int i = 1; i < 26; i++) {
			int evenKey = i;

			for (int j = 1; j < 26; j++) {
				int oddKey = j;
				decrypt.delete(0, decrypt.length());

				for(int k = 0; k < ciphertext.length(); k++) {

					char currentChar = ciphertext.charAt(k);
					boolean isAlphabet = Character.isAlphabetic(currentChar);//set range of possible variable values
					boolean isLower = currentChar >= 97 && currentChar <= 122;//set range of possible variable values
					boolean isUpper = currentChar >= 65 && currentChar <= 90;//set range of possible variable values
					boolean isEven = k % 2 == 0;//set range of possible variable values

					if(isEven && isLower && currentChar + evenKey > 122) {
						currentChar -= (char) 26;
					} else if (isEven && isUpper && currentChar + evenKey > 90) {
						currentChar -= (char) 26;
					} else if (!isEven && isLower && currentChar + oddKey > 122) {
						currentChar -= (char) 26;
					} else if (!isEven && isUpper && currentChar + oddKey > 90) {
						currentChar -= (char) 26;
					}

					if(isAlphabet && isEven) {
						decrypt.append((char) (currentChar + evenKey));
					} else if (isAlphabet && !isEven) {
						decrypt.append((char) (currentChar + oddKey));
					} else {
						decrypt.append((char) currentChar);
					}
				}

				/*if (decrypt.charAt(0) == 71 && decrypt.charAt(1) == 114) {
						System.out.println(decrypt);
					}*/
				System.out.println(decrypt);
			}

		}

	}
	private void loader(ArrayList<Item> shiphold) {
		System.out.println("Would you like to load a previous file? (Y/N)");
		String choice = input.nextLine().trim().toUpperCase();
		if(choice.charAt(0) == 'Y') {
			System.out.println("Enter the name of the file you want to load: ");
			String fileName = input.nextLine();
			try {
				Scanner fileInput = new Scanner(new File(fileName));
				while(fileInput.hasNextLine()) {
					String answer = fileInput.nextLine();
					System.out.println(answer);
				}
				fileInput.close();
			} catch (FileNotFoundException e) {
				System.out.println("404 Error: File not found. Exciting program...");
				System.exit(0);
			}
		}
		else {
			PrintStream pStream = null;
			try {
				File outFile = new File("shiphold-items.txt");
				FileOutputStream fos = new FileOutputStream(outFile);
				pStream = new PrintStream(fos);
				for (int o = 0; o < shiphold.size(); o++) {
					pStream.println(shiphold.get(o).toString());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				pStream.close();
			}
		}
	}

}
