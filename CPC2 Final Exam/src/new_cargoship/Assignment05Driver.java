package new_cargoship;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class Assignment05Driver {
	private Scanner input = new Scanner(System.in);
	private Node start, tail = null;
	
	public static void main(String[] args) {
		new Assignment05Driver();
	}
	
	public Assignment05Driver() {
		System.out.println("Welcome to the BlackStar Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while (true) {
			while (true) {
				System.out.println("1: Add an item to the cargo hold.");
				System.out.println("2: Remove an item from the cargo hold.");
				System.out.println("3: Sort the contents of the cargo hold.");
				System.out.println("4: Search for an item.");
				System.out.println("5: Display the items in the cargo hold.");
				System.out.println("6: Decode intercepted message");
				System.out.println("7: Unload/load items");
				System.out.println("8: Ransack an item");
				System.out.println("0: Exit the BlackStar Cargo Hold interface.");
				String userchoice = input.nextLine().trim();
				
				switch (userchoice) {
					case "1":
						addItem();//works
						break;
					case "2":
						removeItem();//works
						break;
					case "3":
						sortItems();//doesn't work like I wanted it too, would love an explanation of this after the exam is turned in, maybe email
						break;
					case "4":
						searchItems();//works
						break;
					case "5":
						display();//works
						break;
					case "6":
						decodeMessage();//works
						break;
					case "7":
						loader();//works
						break;
					case "8":
						ransack();//mostly works beside the sort
						break;
					case "0":
						System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
						System.exit(0);
				}
			}
		}

	}
	public double maxWeight = 0;
	private void addItem() {
			System.out.println("1: Add an Equippable");
			System.out.println("2: Add a Consumable");
			System.out.println("3: Add a weapon");
			String choice = input.nextLine();
			switch(choice) {
			case "1":
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

				if (maxWeight <= 25) {
					Equippable myEquippable = new Equippable(perk, material, age, name, weight, value, ID, durability);
					if(start == null) {
						start = new Node(myEquippable, null);
						tail = start;
					}else {
						tail.setNext(new Node(myEquippable, null));
						tail = tail.getNext();
					}
					
					maxWeight = maxWeight + (weight * 0.0005);
				}
				else {
					System.out.println("The Cargohold has reached maximum capacity of 25 tons. Please remove items to add more.");
				}
				display();
				break;
			case "2":
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
				
				if (maxWeight <= 25) {
					Consumable myConsumable = new Consumable(food, medicine, weed, name2, weight2, value2, ID2, durability2);
					if(start == null) {
						start = new Node(myConsumable, null);
						tail = start;
					}else {
						tail.setNext(new Node(myConsumable, null));
						tail = tail.getNext();
					}
					
					
					maxWeight = maxWeight + (weight2 * 0.0005);
				} else {
					System.out.println("The Cargohold has reached maximum capacity of 25 tons. Please remove items to add more.");
				}
				break;
			case "3":
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

				if (maxWeight <= 25) {
				Weapon myWeapon = new Weapon(strengthPerHit, type, damageSpeed, name3, weight3, value3, ID3, durability3);
				if(start == null) {
					start = new Node(myWeapon, null);
					tail = start;
				}else {
					tail.setNext(new Node(myWeapon, null));
					tail = tail.getNext();
				}
					
				
				maxWeight = maxWeight + (weight3 * 0.0005);
				}
				else {
					System.out.println("The Cargohold has reached maximum capacity of 25 tons. Please remove items to add more.");
				}
				break;
			}
		}
	private void display() {
		Node p = start;
		while(p != null) {
			System.out.println(p.getEquippable());
			System.out.println(p.getConsumable());
			System.out.println(p.getWeapon());
			p = p.getNext();
		}
		if (p == null) {
			System.out.println("No items in the cargo hold.");
		}
	}
	private void removeItem() {
		Scanner input = new Scanner(System.in);
	
		System.out.println("1: Remove an Equippable");
		System.out.println("2: Remove a Consumable");
		System.out.println("3: Remove a weapon");
		String removechoice = input.nextLine();
		switch(removechoice) {
			case "1":
				System.out.println("Enter the name of the item: ");
				String name = input.nextLine();
				
				Node del = start, prev = null;
				
				while(del != null) {
					if(name.contentEquals(del.getEquippable().getName())) {
						System.out.println("Item has been removed.");
						break;
					}
					
					prev = del;
					del = del.getNext();
					
				}
				if(del == null) {
					System.out.println("Item was not found, and could not be removed");
				}
				else {
					if(del == start) {
						start = start.getNext();
					}
					else {
						if(del != start) {
							prev.setNext(del.getNext());
						}
					}
				}
				
				display();
				break;
			case "2":
				System.out.println("Enter the name of the item: ");
				String name2 = input.nextLine();
				
				Node del2 = start, prev2 = null;
				
				while(del2 != null) {
					if(name2.contentEquals(del2.getConsumable().getName())) {
						System.out.println("Item has been removed.");
						break;
					}
					
					prev2 = del2;
					del2 = del2.getNext();
					
				}
				if(del2 == null) {
					System.out.println("Item was not found, and could not be removed");
				}
				else {
					if(del2 == start) {
						start = start.getNext();
					}
					else {
						if(del2 != start) {
							prev2.setNext(del2.getNext());
						}
					}
				}
				
				display();
				break;
			case "3":
				System.out.println("Enter the name of the item: ");
				String name3 = input.nextLine();
				
				Node del3 = start, prev3 = null;
				
				while(del3 != null) {
					if(name3.contentEquals(del3.getWeapon().getName())) {
						System.out.println("Item has been removed.");
						break;
					}
					
					prev3 = del3;
					del3 = del3.getNext();
					
				}
				if(del3 == null) {
					System.out.println("Item was not found, and could not be removed");
				}
				else {
					if(del3 == start) {
						start = start.getNext();
					}
					else {
						if(del3 != start) {
							prev3.setNext(del3.getNext());
						}
					}
				}
				
				display();
				input.close();
				break;
		}
	}

	private void sortItems() {
		Node current = start, index = null;  
        Equippable temp;  
        Consumable temp2;
        Weapon temp3;
        if(start == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                  
                index = current.getNext();  
                  
                while(index != null) {  
                    
                    if(current.getEquippable().getName().compareToIgnoreCase(current.getEquippable().getName()) > 0) {  
                        temp = current.getEquippable();  
                        current = index.getNext();  
                        index = temp;  
                    }  
                    index = index.getNext();  
                }  
                current = current.getNext();  
            }      
        }
        
        
        if(start == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                  
                index = current.getNext();  
                  
                while(index != null) {  
                    
                    if(current.getConsumable().getName().compareToIgnoreCase(current.getConsumable().getName()) > 0) {  
                        temp2 = current.getConsumable();  
                        current = index.getNext();  
                        index = temp2;  
                    }  
                    index = index.getNext();  
                }  
                current = current.getNext();  
            }      
        } 
        if(start == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                  
                index = current.getNext();  
                  
                while(index != null) {  
                    
                    if(current.getWeapon().getName().compareToIgnoreCase(current.getWeapon().getName()) > 0) {  
                        temp3 = current.getWeapon();  
                        current = index.getNext();  
                        index = temp3;  
                    }  
                    index = index.getNext();  
                }  
                current = current.getNext();  
            }      
        }  
	}
	private void searchItems() {
		System.out.println("1: Search for Equippable Items");
		System.out.println("2: Search for Consumable Items");
		System.out.println("3: Search for Weapons");
		String searchQuery = input.nextLine().trim();
		
		switch(searchQuery) {
		case "1":
			System.out.println("Enter name of equippable Item:");
			String searchName = input.nextLine().trim();
			Node p = start;
			while(p != null) {
				if(searchName.contentEquals(p.getEquippable().getName())) {
					break;
				}
				p = p.getNext();
			}
			
			if(p != null) {
				System.out.println("Equippable was found:");
				System.out.println(p.getEquippable());
			}else {
				System.out.println("Equippable was not found. Search again.");
			}
			break;
		case "2":
			System.out.println("Enter name of consumable Item:");
			String searchName2 = input.nextLine().trim();
			Node p1 = start;
			while(p1 != null) {
				if(searchName2.contentEquals(p1.getConsumable().getName())) {
					break;
				}
				p1 = p1.getNext();
			}
			
			if(p1 != null) {
				System.out.println("Consumable was found:");
				System.out.println(p1.getConsumable());
			}else {
				System.out.println("Consumable was not found. Search again.");
			}
			break;
		case "3":
			System.out.println("Enter name of Weapon:");
			String searchName3 = input.nextLine().trim();
			Node p2 = start;
			while(p2 != null) {
				if(searchName3.contentEquals(p2.getWeapon().getName())) {
					break;
				}
				p2 = p2.getNext();
			}
			
			if(p2 != null) {
				System.out.println("Weapon was found:");
				System.out.println(p2.getWeapon());
			}else {
				System.out.println("Consumable was not found. Search again.");
			}
			break;
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

				if (decrypt.charAt(0) == 71 && decrypt.charAt(1) == 114) {
						System.out.println(decrypt);
					}
				
			}

		}

	}
	private void loader() {
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
				File outFile = new File("cargohold-items.txt");
				FileOutputStream fos = new FileOutputStream(outFile);
				pStream = new PrintStream(fos);
				Node p = start;
				while(p != null) {
					pStream.println(p.getEquippable());
					pStream.println(p.getConsumable());
					pStream.println(p.getWeapon());
					p = p.getNext();
					break;
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				pStream.close();
			}
			
		}
	}
	
	private void ransack() {
		while (maxWeight <= 25) {
				System.out.println("Create a list of items to steal, and the cargohold will determine swiftly what should be stolen first");
				System.out.println("1: Select an Equippable");
				System.out.println("2: Add a Consumable");
				System.out.println("3: Add a weapon");
				System.out.println("4: Print optimal list of items to ransack(top is best value)");
				int choice = input.nextInt();
				input.nextLine();
				switch(choice) {
				case 1:
					System.out.println("Enter the name of the plunder you would like to add: ");
					String name = input.nextLine();

					System.out.println("Enter the weight of the plunder(in pounds):");
					double weight = input.nextDouble();
					input.nextLine();

					System.out.println("Enter the value of the plunder($):");
					double value = input.nextDouble();
					input.nextLine();
					
					if (maxWeight <= 25) {
						plunder myPlunder = new plunder(name, weight, value);
						if(start == null) {
							start = new Node(myPlunder, null);
							tail = start;
						}else {
							tail.setNext(new Node(myPlunder, null));
							tail = tail.getNext();
						}
						
						maxWeight = maxWeight + (weight * 0.0005);
					}
					else {
						System.out.println("The Cargohold has reached maximum capacity of 25 tons. Please remove items to add more.");
					}
					Node p = start;
					while(p != null) {
						System.out.println(p.getPlunder());
						p = p.getNext();
					}

					break;
				case 2:
					System.out.println("Enter the name of the Consumable you would like to add: ");
					String name2 = input.nextLine();

					System.out.println("Enter the weight of the Consumable(in pounds):");
					double weight2 = input.nextDouble();
					input.nextLine();

					System.out.println("Enter the value of the Consumable($):");
					double value2 = input.nextDouble();
					input.nextLine();

					if (maxWeight <= 25) {
						plunder myConsumable = new plunder(name2, weight2, value2);
						if(start == null) {
							start = new Node(myConsumable, null);
							tail = start;
						}else {
							tail.setNext(new Node(myConsumable, null));
							tail = tail.getNext();
						}
						
						maxWeight = maxWeight + (weight2 * 0.0005);
					}
					else {
						System.out.println("The Cargohold has reached maximum capacity of 25 tons. Please remove items to add more.");
					}
					Node p1 = start;
					while(p1 != null) {
						System.out.println(p1.getPlunder());
						p1 = p1.getNext();
					}

					break;
				case 3:
					System.out.println("Enter the name of the Weapon you would like to add: ");
					String name3 = input.nextLine();

					System.out.println("Enter the weight of the weapon(in pounds):");
					double weight3 = input.nextDouble();
					input.nextLine();

					System.out.println("Enter the value of the weapon($):");
					double value3 = input.nextDouble();
					input.nextLine();

					if (maxWeight <= 25) {
						plunder myWeapon3 = new plunder(name3, weight3, value3);
						if(start == null) {
							start = new Node(myWeapon3, null);
							tail = start;
						}else {
							tail.setNext(new Node(myWeapon3, null));
							tail = tail.getNext();
						}
						
						maxWeight = maxWeight + (weight3 * 0.0005);
					}
					else {
						System.out.println("The Cargohold has reached maximum capacity of 25 tons. Please remove items to add more.");
					}
					Node p2 = start;
					while(p2 != null) {
						System.out.println(p2.getPlunder());
						p2 = p2.getNext();
					}

					break;
				
				case 4:
					Node current = start, index = null;  
			        plunder temp4;
			        if(start == null) {  
			            return;  
			        }  
			        else {  
			            while(current != null) {  
			                  
			                index = current.getNext();  
			                  
			                while(index != null) {  
			                    
			                    if(current.getPlunder().getName().compareToIgnoreCase(current.getPlunder().getName()) > 0) {  
			                        temp4 = current.getPlunder();  
			                        current = index.getPlunder().getNext();  
			                        index = temp4;  
			                    }  
			                    index = index.getNext();  
			                }  
			                current = current.getNext();  
			            }      
			        }
					break;
					
				}
		}
	}

}
