package hw3.composition.ex2;

public class TestAuthor {
	public static void main() {
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
		System.out.println(ahTeck); // Test toString()
		ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
		System.out.println("name is: " + ahTeck.getName()); // Test getter
		System.out.println("email is: " + ahTeck.getEmail()); // Test getter
		System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter
	}
}
