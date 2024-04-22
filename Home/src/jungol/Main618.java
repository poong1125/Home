package jungol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

       
        for (int i = 0; i < 5; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            double weight = Double.parseDouble(input[2]);
            people.add(new Person(name, height, weight));
        }
        scanner.close();

       
        Collections.sort(people, Comparator.comparing(person -> person.name));
        System.out.println("name");
        for (Person person : people) {
            System.out.println(person.name + " " + person.height + " " + person.weight);
        }

        
        Collections.sort(people, Comparator.comparingDouble(person -> person.weight));
        Collections.reverse(people); 
        System.out.println("\nweight");
        for (Person person : people) {
            System.out.printf("%s %d %.1f%n", person.name, person.height, person.weight);
        }

    }
}