package decimalAndBinary;

public class Converter {

	public Converter() {

	}

	public long toDecimal(String binary) {
		long decimal = 0;
		long multiplier = 1;
		String num = binary;
		for (int i = num.length() - 1; i >= 0; i--) {
			int c = num.charAt(i) - '0';
			decimal += c * multiplier;
			multiplier = multiplier * 2;
		}
		return decimal;
	}

	public String toBinary(long decimal) {
		if (decimal / 2 == 0) {
			return "" + decimal % 2;
		}
		return toBinary((decimal / 2)) + decimal % 2;
	}
}
