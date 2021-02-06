package Servico;

import Consumer.Consumidor;

public class ProcessadorVendas {
	
	public void ConsumirVendas() throws InterruptedException {
		Consumidor consu = new Consumidor();
		consu.ConsumirVendas("venda-ingressos");
	}
}
