package InterviewDemo;

public class countOccurence {

	public static void main(String[] args) {

		String s = "Appearance";

		getoccurence(s, 'p');

	}

	public static void getoccurence(String str, char val) {

		int count = 0;

		for (char ch : str.toCharArray()) {

			if (ch == val) {

				count++;
			}

		}

		System.out.println(val + ":" + count);

	}

}
