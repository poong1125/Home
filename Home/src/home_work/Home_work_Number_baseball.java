package home_work;

import java.util.Random;
import java.util.Scanner;

public class Home_work_Number_baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] RN = new int[3]; //RN 랜덤 숫자 
		Random random = new Random();
		System.out.println("타자 Mookie Betts가 입장합니다.");
		
		for(int i = 0; i < RN.length; i++) {
			RN[i] = random.nextInt(8)+1;
			for(int o =0; o < i; o++) {
				if(RN[i] == RN[o]) {
					i--;
				}
			}
		}
//		System.out.println(RN[0]+""+RN[1]+""+RN[2]); 난 수 확인용
		while(true) {
			int Scount = 0;
			int Bcount = 0;
			System.out.println("세 자리 숫자를 입력하여 아웃 카운트를 잡으세요.");
			String input = sc.next();
			if(input.length() != 3) {
				System.out.println("Balk");
			}
			char[] pitching = new char[3];
			for(int i = 0; i < 3; i++) {
				pitching[i] = input.charAt(i);
			}
			for(int i = 0; i < RN.length; i++) {
				for(int o = 0; o < pitching.length; o++) {
					if(RN[i] == (pitching[o]-'0')) {
						if(i == o) {
							Scount++;
						}else {
							Bcount++;
						}
					}
				}
			}
			System.out.println("볼 카운트 : " +  Bcount + " 스트라이크 카운트 : " + Scount);
			if(Scount == 3){
				break;
			}
		}
		sc.close();
		System.out.println("3 스트라이크 삼진 아웃. 공수교대");
	}
}
