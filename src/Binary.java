
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

	public int convertHex(String x) {
		int returns = 0;
		char[] s = x.toCharArray();
		int y = s.length;

		for (int i = 0; i < s.length; i++) {
			returns += Math.pow(Integer.parseInt(x.charAt(i) + "") * 16, y - 1);
			y = y - 1;
		}

		return returns;
	}
}
