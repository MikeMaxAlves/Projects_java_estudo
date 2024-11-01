package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Carlos");
		list.add("Joao");
		list.add("Pedro");

		for(String x : list) {
			System.out.println(x);	
		}
	sc.close();
	}
}

