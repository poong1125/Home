package home_work;

import java.util.Scanner;

public class Main {
      
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      sc.close();
      int N = 0; // N은 input 된 수가 N 번째까지 열을 생성함

      int number = 1; 
      int n = 2; 
      while(number < input){
    	  number += n;
    	  n++;
      }
      N = (n-1); // 몇 번 째로 빼야 다 빼는지 횟수
      int minus = number-input;
      //System.out.println(minus+" "+N);
      
      if(N%2==1) {
    	  for(int i =0; i<N;i++) {
    		  if(i==minus) {
    		  System.out.println(((minus+1))+"/"+(N-minus));
    	  }}
      }else if(N%2==0) {
    	  for(int i=0;i<N;i++) {
    		  if(i==minus) {
    			  System.out.println((N-minus)+"/"+(minus+1));
    		  }
    	  }
      }
      
   }

}