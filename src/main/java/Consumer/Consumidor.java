package Consumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import Model.Venda;
import Serializer.VendaDeserializer;

public class Consumidor {
	
	public void ConsumirVendas(String topico) throws InterruptedException {
		Properties prop = new Properties();
		prop.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		prop.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, VendaDeserializer.class.getName());		
		prop.put(ConsumerConfig.GROUP_ID_CONFIG, "grupo-processamento");
		prop.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		
		prop.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "10");
		
		
		try(KafkaConsumer<String, Venda> consumer = new KafkaConsumer<String, Venda>(prop)){
			consumer.subscribe(Arrays.asList("venda-ingressos"));
			
			while(true) {
				consumer.subscribe(Arrays.asList(topico));
				
				while(true) {
					
					ConsumerRecords<String, Venda> vendas = consumer.poll(Duration.ofMillis(200));
					
					for(ConsumerRecord<String, Venda> record : vendas) {
						Venda venda = record.value();
						
						if(new Random().nextBoolean()) {
							venda.setStatus("APROVADA");
						}else {
							venda.setStatus("REPROVADA");
						}
						Thread.sleep(500);
						System.out.println(venda);
					}
				}				
			}
		}		
	}

}
