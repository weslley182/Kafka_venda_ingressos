package Main;
import Producer.Produtor;
import Servico.ProcessadorVendas;

public class ClasseMain {
	
	public static void main(String[] args) throws InterruptedException {		
		
		Produtor produtor = new Produtor();
		produtor.EnviarMensagem();
		
		//ProcessadorVendas proc = new ProcessadorVendas();
		//proc.ConsumirVendas();
	}
}
