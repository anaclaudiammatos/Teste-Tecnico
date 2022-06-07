package Exercicio3;

public class CONFINS implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		
		if (valor > 17000) {
			return valor * 0.08;
		} else {
			return 0;
		}
	}

	
}

