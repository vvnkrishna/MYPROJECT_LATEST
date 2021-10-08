package JavaPackage;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String s = "Strawberries";

		int length = s.length();

		String characters = "";
		String duplicates = "";

		for (int i = 0; i < length; i++) {

			String current = Character.toString(s.charAt(i));

			if (characters.contains(current)) {

				if (!duplicates.contains(current)) {

					duplicates = duplicates + current;

					// System.out.println(duplicates);
				}
			}

			characters = characters + current;

		}

		System.out.println(duplicates);

		System.out.println(characters);

		for (int k = 0; k < duplicates.length(); k++) {

			getoccur(s, duplicates.charAt(k), length);

		}

	}

	public static void getoccur(String str, char ch, int len) {

		int count = 0;

		for (int j = 0; j < len; j++) {

			char val = str.charAt(j);

			if (ch == val) {

				count++;
			}

		}

		System.out.println(ch + ":" + count);

	}
}
