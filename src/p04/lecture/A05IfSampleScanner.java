package p04.lecture;

import java.util.Scanner;

public class A05IfSampleScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("입력>");
		String str = sc.nextLine();
		
		System.out.println("출력>");
		System.out.println(str);
		
		System.out.println("수 입력");
		int in = sc.nextInt();
		
		System.out.println("수 출력");
		System.out.println(in);
	}
}
