package intro_to_java.ch_3_classes_and_methods;

import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;

	public void dateConstruct(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// get and set for month
	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return this.month;
	}

	// get and set for day
	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	// get and set for year
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	// displayDate method that will display the month, day, year

	public int displayDate() {
		int placehlder = 0;
		// this line will display the date of the object by month/day/year
		System.out.printf("The Date object's state is: %d/%d/%d", getMonth(), getDay(), getYear());

		return placehlder;
	}

	public int getInput() {

		Scanner input = new Scanner(System.in);
		
		// get the input from the user for the day month and year
		System.out.print("Enter the month, day and year in the form XX XX XXXX and hit enter:\n");
		int day = input.nextInt();


		// entering a new year

		System.out.print("Enter a new year:\n");
		int newYearDate = input.nextInt();

		// entering a new day
		System.out.print("Enter a new day:");
		int newDayDate = input.nextInt();



		return new Date(day, newYearDate, newDayDate);


		input.close();
	}
}