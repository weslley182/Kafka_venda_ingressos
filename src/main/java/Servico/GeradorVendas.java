package Servico;

import java.math.BigDecimal;
import java.util.Random;

import Model.Venda;

public class GeradorVendas {
	private Random rand = new Random();
	private long operacao = 0;
	private BigDecimal valorIngresso = BigDecimal.valueOf(500);
	
	public Venda CriarVenda() {
		return GerarVenda();
	}
	
	private Venda GerarVenda() {
		long cliente = rand.nextLong();
		int qtdIingressos = rand.nextInt(10);
		
		return new Venda(
				operacao++, 
				cliente, 
				qtdIingressos, 
				valorIngresso.multiply(BigDecimal.valueOf(qtdIingressos))				
				);
	}

}
