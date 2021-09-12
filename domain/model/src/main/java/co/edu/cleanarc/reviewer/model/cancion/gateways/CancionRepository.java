package co.edu.cleanarc.reviewer.model.cancion.gateways;

import java.util.List;

import co.edu.cleanarc.reviewer.model.cancion.Cancion;

public interface CancionRepository {
	
	public List<Cancion> consultarCanciones();
}
