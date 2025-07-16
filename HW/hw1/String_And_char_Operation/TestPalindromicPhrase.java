package hw1.String_And_char_Operation;

import java.util.Scanner;

public class TestPalindromicPhrase {

	public static void main() {
		TestPalindromicPhrase aTestPalindromicPhrase = new TestPalindromicPhrase();

		aTestPalindromicPhrase.run("Madam, I'm Adam");
		aTestPalindromicPhrase.run("A man, a plan, a canal - Panama!");

		try (Scanner in = new Scanner(System.in)) {
			String phrase;
			System.out.print("Please enter a phrase to test it for palindromic: ");
			phrase = in.nextLine();
			aTestPalindromicPhrase.run(phrase);
		}
	}

	private void run(String phrase) {
		String phraseLeftToRight = sanitizeString(phrase);
		String phraseRightToLeft = "";
		for (int i = phraseLeftToRight.length() - 1; i >= 0; i--) {
			phraseRightToLeft += phraseLeftToRight.charAt(i);
		}

		if (phraseLeftToRight.toLowerCase().equals(phraseRightToLeft.toLowerCase())) {
			System.out.printf("\"%1$s\" is a palindrome.\n", phrase);
		} else {
			System.out.printf("\"%1$s\" is not a palindrome.\n", phrase);
		}
	}

	private String sanitizeString(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '.':
			case ',':
			case ' ':
			case '-':
			case '\'':
			case '!':
			case '?':
				break;
			default:
				str += s.charAt(i);
				break;
			}
		}
		return str;
	}
}