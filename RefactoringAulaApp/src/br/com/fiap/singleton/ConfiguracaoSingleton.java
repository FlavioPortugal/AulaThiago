package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {
	
	// 1-Atributo estático que armazena um único objeto
	private static Properties props;
	
	//2-Método que retorno o único objeto
	public static Properties getInstance() {
		if(props == null) {
			props = new Properties();
			try {
				props.load(ConfiguracaoSingleton.class.getResourceAsStream("/app.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return props;
	}
	
	//3- Construtor privado 
	private ConfiguracaoSingleton() {}

}
