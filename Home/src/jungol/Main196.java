package jungol;

import java.util.ArrayList;
import java.util.Scanner;

class Siuu{
	private String name;
	private String num;
	private String zi;
	
	public Siuu(String name,String num,String zi) {
		this.name = name;
		this.num = num;
		this.zi = zi;
		
	}
}

public class Main196 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> people = new ArrayList<>();
		
		for(int i =0; i < 3; i++) {
			String[] input = sc.nextLine().split(" ");
            String name = input[0];
            String num = input[1];
            String zi =input[2];
            Siuu.add(new Siuu(name, num,zi ));
		}
	}

}
