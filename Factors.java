package Test1;

import java.util.Scanner;

public class Factors {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	System.out.print("Factors of number : ");
	for(int i=num; i>=1; i--) {
		System.out.print(i + " ");
	}
}
}
