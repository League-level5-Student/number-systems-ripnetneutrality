
public class Hexadecimal {
	public String toBinary(String hex) {
		char[] characters = hex.toCharArray();
		System.out.println(characters);
		String binaryNum = "";
		for(int i = 0; i < characters.length; i++) {
			switch(characters[i]) {
				case '1':
					binaryNum += "0001";
					break;
				case '2':
					binaryNum += "0010";
					break;
				case '3':
					binaryNum += "0011";
					break;
				case '4':
					binaryNum += "0100";
					break;
				case '5':
					binaryNum += "0101";
					break;
				case '6':
					binaryNum += "0110";
					break;
				case '7':
					binaryNum += "0111";
					break;
				case '8':
					binaryNum += "1000";
					break;
				case '9':
					binaryNum += "1001";
					break;
				case 'A':
					binaryNum += "1010";
					break;
				case 'B':
					binaryNum += "1011";
					break;
				case 'C':
					binaryNum += "1100";
					break;
				case 'D':
					binaryNum += "1101";
					break;
				case 'E':
					binaryNum += "1110";
					break;
				case 'F':
					binaryNum += "1111";
					break;
			}
		}
		return binaryNum;
	}
	public int toDecimal(String hex) {
		char[] characters = hex.toCharArray();
		System.out.println(characters);
		int binaryNum = 0;
		for(int i = 0; i < characters.length; i++) {
			switch(characters[i]) {
				case '1':
					binaryNum += 1 * Math.pow(16, characters.length - (1 + i));
					break;
				case '2':
					binaryNum += 2 * Math.pow(16, characters.length - (1 + i));
					break;
				case '3':
					binaryNum += 3 * Math.pow(16, characters.length - (1 + i));
					break;
				case '4':
					binaryNum += 4 * Math.pow(16, characters.length - (1 + i));
					break;
				case '5':
					binaryNum += 5 * Math.pow(16, characters.length - (1 + i));
					break;
				case '6':
					binaryNum += 6 * Math.pow(16, characters.length - (1 + i));
					break;
				case '7':
					binaryNum += 7 * Math.pow(16, characters.length - (1 + i));
					break;
				case '8':
					binaryNum += 8 * Math.pow(16, characters.length - (1 + i));
					break;
				case '9':
					binaryNum += 9 * Math.pow(16, characters.length - (1 + i));
					break;
				case 'A':
					binaryNum += 10 * Math.pow(16, characters.length - (1 + i));
					break;
				case 'B':
					binaryNum += 11 * Math.pow(16, characters.length - (1 + i));
					break;
				case 'C':
					binaryNum += 12 * Math.pow(16, characters.length - (1 + i));
					break;
				case 'D':
					binaryNum += 13 * Math.pow(16, characters.length - (1 + i));
					break;
				case 'E':
					binaryNum += 14 * Math.pow(16, characters.length - (1 + i));
					break;
				case 'F':
					binaryNum += 15 * Math.pow(16, characters.length - (1 + i));
					break;
			}
		}
		return binaryNum;
	}
}
