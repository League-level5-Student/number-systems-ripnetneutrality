import java.util.Stack;

public class Decimal {

	public String decToHex(Integer input) {
		int temp1 = input;
		Integer temp2;
		String word = "";
		Stack<String> s = new Stack<String>();
		while (temp1 != 0) {
			temp2 = temp1 % 16;

			temp1 = temp1 / 16;
			switch (temp2) {
			case 10:
				s.push("A");
				break;
			case 11:
				s.push("B");
				break;
			case 12:
				s.push("C");
				break;
			case 13:
				s.push("D");
				break;
			case 14:
				s.push("E");
				break;
			case 15:
				s.push("F");
				break;
			default:
				s.push(temp2 + "");

			}
			for (int i = 0; i < s.size(); i++) {
				word = word + s.pop();
			}

		}
		return word;
	}

public String decToBin(Integer input) {
	int temp1 = input;
	Integer temp2;
	String word = "";
	Stack<String> s = new Stack<String>();
	while (temp1 != 1) {
		temp2 = temp1 % 2;

		temp1 = temp1 / 2;
		s.push(temp2 + "");
		}
		for (int i = 0; i < s.size(); i++) {
			word = word + s.pop();
		}

	
	return word;
}
}