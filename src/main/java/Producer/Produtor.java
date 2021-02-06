package Producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import Model.Venda;
import Serializer.VendaSerializer;
import Servico.GeradorVendas;

public class Produtor {
	
	public void EnviarMensagem() throws InterruptedException{
		
		Properties prop = new Properties();
		prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, VendaSerializer.class.getName());
		
		try(KafkaProducer<String, Venda> producer = new KafkaProducer<String, Venda>(prop)){
			
			while(true) {
				GeradorVendas gerador = new GeradorVendas();
				Venda venda = gerador.CriarVenda();
				
				ProducerRecord<String, Venda> record = new ProducerRecord<String, Venda>("venda-ingressos", venda);			
				producer.send(record);	
				Thread.sleep(200);
			}			
		}		
	}
}
