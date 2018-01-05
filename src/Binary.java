
public class Binary {

	public int convertDec(String x) {
		int returns = 0;
		int final1 = 0;
		char[] s = x.toCharArray();
		int y = s.length;

		for (int i = 0; i < s.length; i++) {
			if (x.charAt(i) == '0') {

			} else {
				returns += Math.pow(Integer.parseInt(x.charAt(i) + "") * 2, y - 1);
			}
			y = y - 1;
		}
		return returns;
	}

	public String convertHex(String x) {
		String returns = "0";
		int y = x.length();
		for(int i = 0; i < x.length(); i++) {
			switch(x) {
				case "0001":
					returns += "1";
					break;
				case "0010":
					returns += "2";
					break;
				case "0011":
					returns += "3";
					break;
				case "0100":
					returns += "4";
					break;
				case "0101":
					returns += "5";
					break;
				case "0110":
					returns += "6";
					break;
				case "0111":
					returns += "7";
					break;
				case "1000":
					returns += "8";
					break;
				case "1001":
					returns += "9";
					break;
				case "1010":
					returns += "A";
					break;
				case "1011":
					returns += "B";
					break;
				case "1100":
					returns += "C";
					break;
				case "1101":
					returns += "D";
					break;
				case "1110":
					returns += "E";
					break;
				case "1111":
					returns += "F";
					break;
			}
		}

		
		for (int i = 0; i < x.length(); i++) {
			returns += Math.pow(Integer.parseInt(x.charAt(i) + "") * 16, y - 1);
			y = y - 1;
		}

		return returns;
	}
}
