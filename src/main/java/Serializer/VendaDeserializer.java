package Serializer;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Venda;

public class VendaDeserializer implements Deserializer<Venda>{

	@Override
	public Venda deserialize(String topic, byte[] venda) {

		try {
			return new ObjectMapper().readValue(venda, Venda.class);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
