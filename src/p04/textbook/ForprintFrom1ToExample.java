package p04.textbook;

public class ForprintFrom1ToExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 10; i >= 1; i-=2) {
			System.out.println(i);
		}
		for (int i = 9; i >= 1; i-=2) {
			System.out.println(i);
		}
	}
}
