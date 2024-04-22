package baek_joon;

import java.util.Scanner;

public class Main2720 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int inp = sc.nextInt();
		int money[] = new int[inp];
		for( int i = 0; i < inp ; i++) {
			money[i] = sc.nextInt();
		}
		sc.close();
		
		int Q,D,N,P;

		int total=0;
		
		for(int i = 0; i < inp; i++) {
			int a = money[i];
			int b = a;
			total = 0;
			
			Q = 0;
			D = 0;
			N = 0;
			P = 0;
			for(;;) {
				if(total == a) {
				break;
				}else if(total < a) {
					if(25<=b) {
						Q++;
						total+=25;
						b-=25;
					}else if(10<=b) {
						D++;
						total+=10;
						b-=10;
					}else if(5<=b) {
						N++;
						total+=5;
						b-=5;
					}else if(1<=b) {
						P++;
						total+=1;
						b-=1;
					}
				}
			}
			System.out.println(Q+" "+D+" "+N+" "+P);
		}

		
	}

}
