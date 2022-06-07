package Exercicio1;

public class Main {

	public static void main(String[] args) {
Caixa caixa = new Caixa();
		
		Produto banana = new Produto();
		banana.setNome("Banana");
		banana.setValor(0.99);
		banana.setTipo(2);
		
		double valorFinalBanana = caixa.calculaValorFinal(banana, 3);
		System.out.printf("Banana R$%.2f\n", valorFinalBanana);
		
		Produto energetico = new Produto();
		energetico.setNome("Energetico");
		energetico.setValor(5.49);
		energetico.setTipo(3);
		
		double valorFinalEnergetico = caixa.calculaValorFinal(energetico, 7);
		System.out.printf("Energetico R$%.2f\n", valorFinalEnergetico);
		
		Produto arroz = new Produto();
		arroz.setNome("Arroz");
		arroz.setValor(20.00);
		arroz.setTipo(1);
		
		double valorFinalArroz = caixa.calculaValorFinal(arroz, 1);
		System.out.printf("Arroz R$%.2f\n", valorFinalArroz);
		
		Produto chocolate = new Produto();
		chocolate.setNome("Chocolate");
		chocolate.setValor(4.5);
		chocolate.setTipo(1);
		
		double valorFinalChocolate = caixa.calculaValorFinal(chocolate, 12);
		System.out.printf("Chocolate R$%.2f\n", valorFinalChocolate);
		
		Produto leite = new Produto();
		leite.setNome("Leite");
		leite.setValor(3.73);
		leite.setTipo(3);
		
		double valorFinalLeite = caixa.calculaValorFinal(leite, 5);
		System.out.printf("Leite R$%.2f\n", valorFinalLeite);
		
		Produto abacaxi = new Produto();
		abacaxi.setNome("Abacaxi");
		abacaxi.setValor(2.4);
		abacaxi.setTipo(2);
		
		double valorFinalAbacaxi = caixa.calculaValorFinal(abacaxi, 1);
		System.out.printf("Abacaxi R$%.2f\n", valorFinalAbacaxi);
		
	}


	}

