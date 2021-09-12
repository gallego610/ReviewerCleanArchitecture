package co.edu.cleanarc.reviewer.usecase.consultarcancion;

import java.util.Iterator;
import java.util.List;

import co.edu.cleanarc.reviewer.model.cancion.Cancion;
import co.edu.cleanarc.reviewer.model.cancion.gateways.CancionRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConsultarCancionUseCase {

	@NonNull
	private final CancionRepository cancionRepository;

	private List<Cancion> listaCanciones;

	public void consultarCancionUseCase() {
		this.listaCanciones = cancionRepository.consultarCanciones();
	}

	@Override
	public String toString() {
		StringBuilder toString = new StringBuilder(); 
		toString.append("Canciones\n");

		for (Iterator<Cancion> iterator = listaCanciones.iterator(); iterator.hasNext();) {
			Cancion cancion = iterator.next();
			toString.append("\n\tNombre: " + cancion.getNombre());
			toString.append("\n\tAlbum: " + cancion.getAlbum());
			toString.append("\n\tAutor: " + cancion.getAutor());
			toString.append("\n\tGenero: " + cancion.getGenero());
			toString.append("\n ");

		}
		return toString.toString();
	}

}
