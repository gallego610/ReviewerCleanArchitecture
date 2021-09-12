/**
 * 
 */
package co.edu.cleanarc.reviewer.externalsearch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.edu.cleanarc.reviewer.model.cancion.Cancion;
import co.edu.cleanarc.reviewer.model.cancion.gateways.CancionRepository;

@Component
public class ConsultaCancionesAdapter implements CancionRepository {

	/**
	 * 
	 */
	public ConsultaCancionesAdapter() {
	}

	@Override
	public List<Cancion> consultarCanciones() {
		List<Cancion> listaCancionesConsultadas = new ArrayList<Cancion>();
		Cancion cancion1 = new Cancion("0001", "La bicicleta", "Vallenato", "Shakira, Carlos Vives", "El Dorado");
		Cancion cancion2 = new Cancion("0002", "vivir sin aire", "Pop", "Maná", "¿Dónde Jugarán los Niños?");
		Cancion cancion3 = new Cancion("0003", "Mientes tan bien", "Pop", "Sin Bandera", "De viaje");
		Cancion cancion4 = new Cancion("0004", "Por ti", "Pop", "Nicolas mayorca", "Por Ti");
		listaCancionesConsultadas.add(cancion1);
		listaCancionesConsultadas.add(cancion2);
		listaCancionesConsultadas.add(cancion3);
		listaCancionesConsultadas.add(cancion4);
		return listaCancionesConsultadas;
	}

}
