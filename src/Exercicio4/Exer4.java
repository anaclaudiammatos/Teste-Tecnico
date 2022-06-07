package Exercicio4;


import java.util.Random;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random gerador = new Random();
		int numGerado = gerador.nextInt(10);
		int valor;
		System.out.println(numGerado);

		do {
			valor = scan.nextInt();
		} while (valor != numGerado);

		System.out.println("FIM");
	}

}

