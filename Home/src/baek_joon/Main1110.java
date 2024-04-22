package baek_joon;

import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		int B = A;
		for(int n = 1; n!=0; n++){
			B = (10*(B%10)) + ((B/10)+(B%10))%10;
			if(A == B) {
				System.out.print(n);
				break;
			}
	
		}
	}
}
