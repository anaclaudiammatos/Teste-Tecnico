package Exercicio1;

public class Caixa {
	
	public double calculaValorFinal(Produto produto, int quantidade) {
		
		double valorFinal = produto.getValor() * quantidade;
		
		if(produto.getTipo() == 1) {
			valorFinal = valorFinal - (valorFinal * 0.10);
		}else if(produto.getTipo() == 2) {
			valorFinal = valorFinal - (valorFinal * 0.20);
		}else if(produto.getTipo() == 3 && quantidade > 5) {
			valorFinal = valorFinal - (valorFinal * 0.10);
		}
		
	return valorFinal;
	}
}
