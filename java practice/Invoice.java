import java.util.Scanner;

//creating the Inovice class
public class Invoice {
	// below are our instance variables being declared
	private String partNumber; // partNumber represents and id number for a specific part, its in form string
								// as it doesn't need any form of calculation
	private String partDescription; // this reps what the part is, its the parts description
	private int amountPurchased; // this is the amount of parts being bought, in form of int, as we might have to
									// perform some calculation
	private double pricePerItem;

	// constructor for the class
	public Invoice(String partNumber, String partDescriptions, int amountPurchased, double priceForItem) {// takes 4
																											// parameters
																											// for
																											// creating
																											// fields of
																											// the
																											// object
		this.partNumber = partNumber; // we are using the this so partNumber the instance variable doesn't get
										// shadowed by the parameter of the same name
		this.partDescription = partDescriptions;
		this.amountPurchased = 0;
		this.pricePerItem = 0.0; // the parameter is what gets assigned to the instance variable, parameter on
									// the right hand side of the =

	}

	// get and sets for the part number
	public void setPartNumber(String partNumber) {// this metod needs the void keyward as it will not return any data,
													// just setting the data
		this.partNumber = partNumber;
	}

	public String getPartNumber() {// doesn't need any parameters and void not needed as we are returning a value
		return this.partNumber; // doesn't need the this. but is easier for readability and nowing which one its
								// refering to
	}

	// get and sets for the part Description
	public void setPartDescription(String partDes) {
		this.partDescription = partDes;
	}

	public String getPartDescription() {
		return this.partDescription;
	}

	// get and sets for amount purchased
	public void setAmountPurchased(int amountPurchased) {
		this.amountPurchased = amountPurchased;
	}

	public int getAmountPurchased() {
		return this.amountPurchased;
	}

	// get and set for item price
	public void setPricePerItem(double priceForEachItem) {
		this.pricePerItem = priceForEachItem;
	}

	public double getPricePerItme() {
		return this.pricePerItem;
	}

	// invoive amount method this will calculate the total price of all the
	// everything, the formula used will be amountPurchased * pricePerItem

	public double invoiceAmount() {
		// check if the quanitity is less than 0, we don't want to accept negative
		// numbers
		if (this.amountPurchased < 0) {
			this.amountPurchased = 0; // if it is negative assign 0 to the variable
		}

		// check if price per item is negative if it is assign 0.0 to its varaiables
		if (this.pricePerItem < 0) {
			this.pricePerItem = 0.0;
		}

		// get the total price of all the items being purhcased * price per item
		double totalPrice = this.pricePerItem * this.amountPurchased;
		return totalPrice;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Making a new object of class Invoice: ");

		// calling the method getInput() to use the input that was provided by the user
		Invoice invoice = getInput(input);

		System.out.println("\nUsing all the get methods the state of the object is: ");
		printInvoice(invoice);

		// Using the set methods to now mutate the object
		System.out.println("\nUsing the setters to mutate the object one step at a time: \n\n");

		// now we are getting a new input for the new price of the items
		System.out.println("Enter the new Price Per Item with cents in decimals: ");
		double newPricePerItem = input.nextDouble();
		invoice.setPricePerItem(newPricePerItem);

		System.out.println("Using all the get methods the state of the object is:");
		printInvoice(invoice);

		System.out.println("\nEnter the new Quantity of Items: \n");
		int newAmountPurchased = input.nextInt();
		invoice.setAmountPurchased(newAmountPurchased);
		System.out.println("Using all the get methods the state of the object is:");
		printInvoice(invoice);

		System.out.println("\nEnter the new part description: \n");
		input.nextLine();
		String newDescrip = input.nextLine();
		invoice.setPartDescription(newDescrip);
		System.out.println("Using all the get methods the state of the object is:");
		printInvoice(invoice);

		System.out.println("\nEnter the new part number: \n");
		String newPartNumber = input.nextLine();
		invoice.setPartNumber(newPartNumber);
		System.out.println("Using all the get methods the state of the object is:");
		printInvoice(invoice);

		input.close();
	}

	// create a new object for invoice
	private static Invoice getInput(Scanner input) {
		System.out.print("Enter the part number: ");
		String partNumber = input.nextLine();

		System.out.print("Enter the part description: ");
		String partDescription = input.nextLine();

		System.out.print("Enter the Quantity of Items: ");
		int amountPurchased = input.nextInt();

		System.out.print("Enter the Price Per Item with cents in decimals: ");
		double pricePerItem = input.nextDouble();

		return new Invoice(partNumber, partDescription, amountPurchased, pricePerItem);
	}

	// here we create a sperate method so that we can reuse invoking the getters,
	// instead of having to re write the same code and we can later call the method
	// in to place where it is needed for priniting things to the screen
	private static void printInvoice(Invoice invoice) {
		// invoking the get methods to get the data and print out to the screen
		System.out.printf("The part number: %s%n", invoice.getPartNumber());

		System.out.printf("The part description: %s%n", invoice.getPartDescription());

		System.out.printf("The Quantity of Items: %d%n", invoice.getAmountPurchased());

		System.out.printf("The Price Per Item with cents in decimals: %.2f%n", invoice.getPricePerItme());

		System.out.printf("Using getInvoiceAmount the Invoice is: %.2f%n", invoice.invoiceAmount());
	}

}