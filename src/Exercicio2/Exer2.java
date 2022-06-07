package Exercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exer2 {

	public static void main(String[] args) {


		int maior = 0;
		int menor = 0;
		double media = 0;
		List<Integer> acima = new ArrayList<>();
		List<Integer> abaixo = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		while(numeros.size() <= 10) {
			numeros.add(scan.nextInt());
			
		}
		
	}

}
