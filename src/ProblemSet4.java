/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
public class ProblemSet4 {

	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		
		ps.addMe("a123b456c789", true);
		ps.addMe("a123b456c789", false);
		ps.addMe(null, true);
		ps.addMe("abc 123 def", true);
	}
	
	public String surroundMe(String out, String in) {
		if(in != null && out != null) {
			if(in.length() == 3 && out.length() == 4) {
				int i = 0;
				String value = "";
				while(i < 4) {
					if(i == 2) {
						value = value + (in);
					}
					value = value + (out.charAt(i));
					i++;
				}
				return(value + "\n");
			}
			else {
				return(null);
			}
		}
		else {
			return(null);
		}
	}
	
	public String endsMeet(String str, int n) {
		if(str != null && (n >= 1 && n < str.length()) && (str.length() >= 1 && str.length() <= 10)) {
			String value = str.substring(0, n - 1);
			value = value + str.substring(str.length() - n);
			return(value);
		}
		else {
			return(null);
		}
	}
	
	public String middleMan(String str) {
		String value = null;
		if(str != null) {
			int n = (str.length() % 2);
			if(n == 1) {
				n = (str.length() - 3) / 2;
				value = (str.substring(n, str.length() - n));
			}
		}	
		return(value);
	}
	
	public String doubleVision(String str) {
		String value = null;
		if(str != null) {
			int i = 0;
			while(i < str.length()) {
				value = value + str.charAt(i);
				value = value + str.charAt(i);
			}
		}
		return(value);
	}
	
	public boolean centered(String str, String target) {
		boolean value = false;
		if(str != null && target != null && target.length() == 3) {
			if(str.contains(target) == true) {
				int n = (str.length() % 2);
				if(n == 1) {
					n = (str.length() - 3) / 2;
				}
				else {
					n = (str.length() - 4) / 2;
				}
				if(str.substring(n, str.length() - n).contains(target) || str.substring(n + 1, str.length() - n + 1).contains(target)) {
					value = true;
				}
			}
		}
		return(value);
	}
	
	public int upOrDown(double number, char operation) {
		switch(operation) {
			case 'f':
				number = (int)(number) / 1;
				break;
			case 'r':
				if(number % (int)number >= 0.5) {
					number = ((int)number / 1) + 1;
				}
				else {
					number = (int)number / 1;
				}
				break;
			case 'c':
				number = ((int)number / 1) + 1;
				break;
			default:
				number = -1;
				break;
		}
		return((int)number);
	}	
	
	public int countMe(String text, char end) {
		int count = 0;
		int ascii = (int)end;
		if(text != null && ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))){	
			if(text.charAt(text.length() - 1) == end) {
				count++;
			}
			for(int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == ' ' || text.charAt(i) == '\t' || text.charAt(i) == '\n') {
					if(text.charAt(i - 1) == end) {
						count++;
					}
				}
			}
			return(count);
		}
		else {
			return(-1);
		}
	}
	
	public boolean isNotEqual(String str) {
		int countIs = 0;
		int countNot = 0;
		if(str == null) {
			System.out.println(false);
			return(false);
		}
		else{
			for(int i = 0; i < str.length() - 1; i ++) {
				switch(str.charAt(i)) {
				case 'i':
					if(str.charAt(i + 1) == 's') {
						countIs++;
						i++;
					}
						break;
				case 's':
					if(str.charAt(i - 1) == 'i') {
						countIs++;
					}
						break;
				case 'n':
					if(str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
						countNot++;
						i += 2;
					}
						break;
				case 'o':
					if(str.charAt(i - 1) == 'n' && str.charAt(i + 1) == 't') {
						countNot++;
						i++;
					}
						break;
				case 't':
					if(str.charAt(i - 2) == 'n' && str.charAt(i - 1) == 'o') {
						countNot++;
					}
					break;
				}
			}
			if(countIs == countNot) {
				System.out.println(true);
				return(true);
			}
			else {
				System.out.println(false);
				return(false);
			}
		}
	}
	public int triplets(String str) {
		int count = 0;
		if(str == null) {
			count = -1;
			return(count);
		}
		for(int i = 0; i < str.length() - 1; i++) {
			int ascii = (int)str.charAt(i);
			if(ascii < 65 || (ascii > 90 && ascii < 97) || ascii > 122) {
				i = str.length();
				count = -1;
			}
			if(i == 0) {
				i++;
			}
			if(i != str.length() - 1) {
				if(ascii == (int)str.charAt(i - 1) && ascii == (int)str.charAt(i + 1)) {
					count++;
				}
			}
		}	
		return(count);
	}
	public int addMe(String str, boolean digits) {
		int sum = 0;
		if(str == null) {
			sum = -1;
			System.out.println(sum);
			return(sum);
		}
		for(int v = 0; v < str.length() - 1; v++) {
			if(Character.isWhitespace(str.charAt(v))) {
				sum = -1;
				System.out.println(sum);
				return(sum);
			}
		}
		
		if(digits == true) {
			for(int i = 0; i <= str.length() - 1; i++) {
				switch(str.charAt(i)) {
				case '1':
					sum += 1;
					break;
				case '2':
					sum += 2;
					break;
				case '3':
					sum += 3;
					break;
				case '4':
					sum += 4;
					break;
				case '5':
					sum += 5;
					break;
				case '6':
					sum += 6;
					break;
				case '7':
					sum += 7;
					break;
				case '8':
					sum += 8;
					break;
				case '9':
					sum += 9;
					break;
				}
			}
		}
		else {
			int value = 0;
			for(int i = 0; i <= str.length() - 1; i++) {
				if(Character.isAlphabetic(str.charAt(i)) == true || Character.isDigit(str.charAt(i)) == true) {
					if(Character.isDigit(str.charAt(i)) == true) {
						if(i > 0 && Character.isDigit(str.charAt(i - 1))){
							value *= 10;
						}
						value += Character.getNumericValue(str.charAt(i));
					}
					else if(Character.isAlphabetic(str.charAt(i)) == true) {
						sum += value;
						value = 0;
					}
				}
			}
			sum += value;
		}
		System.out.println(sum);
		return(sum);
	}

}

