package labWrapperClassGui;

public class DemoWrapperClass {
	
	public String minMax() {
		return "Byte: " + "\nMin: " + Byte.MIN_VALUE + "\nMax: " + Byte.MAX_VALUE + "\n\nShort:" +
				"\nMin: " + Short.MIN_VALUE + "\nMax: " + Short.MAX_VALUE + "\n\nInteger:" +
				"\nMin: " + Integer.MIN_VALUE + "\nMax: " + Integer.MAX_VALUE + "\n\nLong:" +
				"\nMin: " + Long.MIN_VALUE + "\nMax: " + Long.MAX_VALUE;
	}
	
	public String toBinary(int number) {
		return "Binary: " + Integer.toBinaryString(number) + "\nOctal: " + Integer.toOctalString(number) +
				"\nHex: " + Integer.toHexString(number);
	}
	
	public String charProperties(char c) {
		if(Character.isLetter(c) && Character.isUpperCase(c)) {
			StringBuilder sb = new StringBuilder();
			sb.append(c);
			sb.append("|");
			sb.append(Character.toLowerCase(c));
			
			return "White Space: " + Character.isWhitespace(c) + "\nDigit: " + Character.isDigit(c) +
					"\nLetter: " + sb.toString();
		}
		
		if(Character.isLetter(c) && Character.isLowerCase(c)) {
			StringBuilder sb = new StringBuilder();
			sb.append(c);
			sb.append("|");
			sb.append(Character.toUpperCase(c));
			
			return "White Space: " + Character.isWhitespace(c) + "\nDigit: " + Character.isDigit(c) +
					"\nLetter: " + sb.toString();
		}
		
		else {
			return "White Space: " + Character.isWhitespace(c) + "\nDigit: " + Character.isDigit(c) +
					"\nLetter: " + Character.isLetter(c);
		}
	}
}
