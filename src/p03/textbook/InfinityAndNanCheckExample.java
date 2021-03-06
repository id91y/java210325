package p03.textbook;

public class InfinityAndNanCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println(Double.isInfinite(z1));
		System.out.println(Double.isNaN(z1));
		
		System.out.println(Double.isInfinite(z2));
		System.out.println(Double.isNaN(z2));
		
		System.out.println(z1 + 2);
		System.out.println(z2 + 2);
	}
}
