package baek_joon;

import java.util.Scanner;

public class Main2439a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int o =1;
		sc.close();
		
		for(int i = 0; i <=a; i++) {
			for(o = 1; o <= a-i; o++) {
				System.out.print(" ");
			}
			for(int p=0; p <= a-o; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


