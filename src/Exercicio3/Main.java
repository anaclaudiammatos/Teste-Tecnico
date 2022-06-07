package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor = scan.nextDouble();

		Imposto icms = new ICMS();
		Imposto ipi = new IPI();
		Imposto confins = new CONFINS();

		double impostoICMS = icms.calculaImposto(valor);
		double impostoIPI = ipi.calculaImposto(valor);
		double impostoCONFINS = confins.calculaImposto(valor);

		double impostoTolal = valor + impostoICMS + impostoIPI + impostoCONFINS;

		System.out.printf("ICMS: %.1f\n", impostoICMS);
		System.out.printf("IPI: %.1f\n", impostoIPI);
		System.out.printf("CONFINS: %.1f\n", impostoCONFINS);
		System.out.printf("Valor Final: %.1f\n", impostoTolal);
	}

}

