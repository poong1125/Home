package baek_joon;

import java.util.Scanner;

public class Main10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Bucket[] = new int[sc.nextInt()];
		int Cycle = sc.nextInt();
		int[][] CNum = new int[Cycle][3];
		for(int i = 0; i < Cycle ; i++) {
			for(int ii = 0; ii < 3 ; ii++) {
				CNum[i][ii] = sc.nextInt();
			}
		}
		sc.close();
//		for(int i = 0; i < Cycle ; i++) {
//			for(int ii = 0; ii < 3 ; ii++) {
//				System.out.print(CNum[i][ii]);
//			}
//			System.out.println();
//		} //2차원 배열에 값이 제대로 들어왔는지 확인
		for(int i = 0; i < Cycle ; i++) {
			int minus = 0;
			for( int ii = 0; ii < (CNum[i][1]-CNum[i][0]+(1));ii++) {
				Bucket[CNum[i][0]-1+minus]=CNum[i][2];
				minus++;
			}
		}
		for(int p=0; p < Bucket.length; p++) {
			System.out.print(Bucket[p]+" ");
		}
	}
}
