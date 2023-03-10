package decimalAndBinary;

import java.util.Scanner;

public class ConverterTester {

	public static void main(String[] args) {

		Converter convertion = new Converter();
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you want to convert to binary or to decimal (binary/decimal)?");
		String dOrB = scan.next();
		System.out.println("What do you want to convert?");

		if (dOrB.equalsIgnoreCase("decimal")) {
			String num = scan.next();
			System.out.println(convertion.toDecimal(num));
		} else {
			int number = scan.nextInt();
			System.out.println(convertion.toBinary(number));
		}
		scan.close();
	}

}
