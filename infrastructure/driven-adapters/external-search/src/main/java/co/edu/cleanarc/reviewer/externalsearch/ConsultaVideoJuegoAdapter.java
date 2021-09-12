/**
 * 
 */
package co.edu.cleanarc.reviewer.externalsearch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.edu.cleanarc.reviewer.model.videojuego.VideoJuego;
import co.edu.cleanarc.reviewer.model.videojuego.gateways.VideoJuegoRepository;

@Component
public class ConsultaVideoJuegoAdapter implements VideoJuegoRepository {

	/**
	 * 
	 */
	public ConsultaVideoJuegoAdapter() {
	}

	@Override
	public List<VideoJuego> consultarVideoJuegos() {
		List<VideoJuego> respuesta = new ArrayList<VideoJuego>();
		VideoJuego videojuego1 = new VideoJuego("001", "Age Of Empires", "Estrategia en tiempo real", "Age of Empires es una serie de videojuegos de estrategia en tiempo real para computadoras personales.", "http://www.ageofempires.com",
				new BigDecimal(50000), "2006", "CD-ROM y descarga directa");
		respuesta.add(videojuego1);
		return respuesta;
	}

}
