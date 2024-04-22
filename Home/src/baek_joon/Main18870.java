package baek_joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String bfbf = bf.readLine();
		String[] bfbfbf = bf.readLine().split(" ");

		
		int Bae[] = new int[Integer.parseInt(bfbf)];
		int Bae2[] = new int[Bae.length];
		for(int i = 0; i < Bae.length; i++) {
			Bae2[i] = Integer.parseInt(bfbfbf[i]);
			Bae[i] = Integer.parseInt(bfbfbf[i]);
		}
		
		Bae2 = Arrays.stream(Bae).distinct().toArray();
		
//		int Count;
//		for(int i = 0; i < Bae.length; i++) {
//			Count=0;
//			for( int o =0; o < Bae2.length; o++) {
//				if(Bae[i] < Bae2[o]) {
//				}else if(Bae2[o]<Bae[i]) {
//					Count++;
//				}
//			}
//			System.out.print(Count + " ");
//		} 2중 for문 사용 시 입력시간 초과로 인해 정렬 수 갯수만 출력하기로 함
		Arrays.sort(Bae2);
		for( int i = 0; i < Bae.length; i++) {
			int index = Arrays.binarySearch(Bae2, Bae[i]);
			if (index >= 0) {
	            System.out.print(index + " ");
			}
		}
	}
}
