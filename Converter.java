public class Converter {

	public Converter() {

	}

	public String toDecimal(String binary) {
		int decimal = 0;
		for (int i = 0; i < binary.length(); i++) {
			decimal += (binary.charAt(i) - '0') * (Math.pow(2, (binary.length() - i - 1)));
		}
		return "" + decimal;
	}

	public String toBinary(int decimal) {
		if (decimal / 2 == 0) {
			return "" + decimal % 2;
		}
		return toBinary((decimal / 2)) + decimal % 2;
	}
}
