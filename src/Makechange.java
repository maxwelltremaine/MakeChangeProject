import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double purchasePrice, payment, paymentShort;
		int easyChange;
		Scanner input = new Scanner(System.in);
		easyChange = 0;

		System.out.println("Please enter the price of the item");
		purchasePrice = input.nextDouble();
		System.out.println("Please enter the amount tendered by the valued customer");
		payment = input.nextDouble();
		paymentShort = (purchasePrice - payment);

		if (payment == purchasePrice) {
			System.out.println("Thank you for your purchase dear valued customer!");
		}

		else if (payment > purchasePrice) {

			int numOfDen = 0;
			int changeDue = (int) (100 * (payment - purchasePrice));
			System.out.println("Thank you for your purchase dear valued customer, your change is");

			if (changeDue / 2000 >= 1) {
				numOfDen = (changeDue / 2000);
				changeDue = (changeDue % 2000);
				System.out.print(numOfDen + " Twenties, ");
			}
			if (changeDue / 1000 >= 1) {
				numOfDen = (changeDue / 1000);
				changeDue = (changeDue % 1000);
				System.out.print(numOfDen + " Ten, ");
			}
			if (changeDue / 500 >= 1) {
				numOfDen = (changeDue / 500);
				changeDue = (changeDue % 500);
				System.out.print(numOfDen + " Fives, ");
			}
			if (changeDue / 100 >= 1) {
				numOfDen = (changeDue / 100);
				changeDue = (changeDue % 100);
				System.out.print(numOfDen + " Ones, ");
			}
			if (changeDue / 25 >= 1) {
				numOfDen = (changeDue / 25);
				changeDue = (changeDue % 25);
				System.out.print(numOfDen + " Quarters, ");
			}
			if (changeDue / 10 >= 1) {
				numOfDen = (changeDue / 10);
				changeDue = (changeDue % 10);
				System.out.print(numOfDen + " Dimes, ");
			}
			if (changeDue / 5 >= 1) {
				numOfDen = (changeDue / 5);
				changeDue = (changeDue % 5);
				System.out.print(numOfDen + " Nickles, ");
			}
			if (changeDue / 1 >= 1) {
				numOfDen = (changeDue / 1);
				changeDue = (changeDue % 1);
				System.out.print(numOfDen + " Pennies");
			}

		} else if (payment < purchasePrice) {
			System.out.println("HOW SILLY CUSTOMER! You seem to have underpaid, you're $" + paymentShort + " short");
		}

	}

}
