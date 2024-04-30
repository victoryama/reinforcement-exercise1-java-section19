package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		char course;
		for (int i = 0; i<3 ;i++) {
			
			if (i == 0) {
				course = 'A';
			}
			else if (i == 1){
				course = 'B';
			}
			else {
				course = 'C';
			}
			
			System.out.print("How many students for course " + course + "? ");
			int n = sc.nextInt();
			for (int j = 0; j<n; j++) {
				int student = sc.nextInt();
				if (i == 0) {
					a.add(student);
				}
				else if (i == 1) {
					b.add(student);
				}
				else {
					c.add(student);
				}		
			}
			
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total: " + total.size());
		sc.close();
	}

}
