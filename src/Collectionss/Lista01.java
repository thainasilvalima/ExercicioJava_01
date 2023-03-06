package Collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Lista01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList();

		System.out.println("\nDigite 5 cores: ");
	 
        for (int i = 0; i < 5; i++) {
			String cor = read.nextLine();
            cores.add(cor);
        } 
	
		Collections.sort(cores);

		System.out.println("\n Cores digitadas em ordem crescente: ");
		for (String c : cores) {
			System.out.println(c);
        }
	     read.close();
	} 
	
	

}
