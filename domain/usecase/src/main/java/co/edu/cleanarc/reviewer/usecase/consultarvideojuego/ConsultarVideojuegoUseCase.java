package co.edu.cleanarc.reviewer.usecase.consultarvideojuego;

import java.util.Iterator;
import java.util.List;

import co.edu.cleanarc.reviewer.model.videojuego.VideoJuego;
import co.edu.cleanarc.reviewer.model.videojuego.gateways.VideoJuegoRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConsultarVideojuegoUseCase {
	
	@NonNull
	private final VideoJuegoRepository videoJuegoRepository;
	
	private List<VideoJuego> listaVideoJuegos;


	public void consultarVideojuegoUseCase() {
		this.listaVideoJuegos = videoJuegoRepository.consultarVideoJuegos();
	}
	
	@Override
	public String toString() {
		StringBuilder toString = new StringBuilder(); 
		toString.append("Video Juegos \n");

		for (Iterator<VideoJuego> iterator = listaVideoJuegos.iterator(); iterator.hasNext();) {
			VideoJuego videoJuego = iterator.next();
			toString.append("\n\tNombre: " + videoJuego.getNombre());
			toString.append("\n\tDescripcion: " + videoJuego.getDescripcion());
			toString.append("\n\tPlataforma: " + videoJuego.getPlataforma());
			toString.append("\n\tSitioWeb: " + videoJuego.getSitioWeb());
			toString.append("\n\tGenero: " + videoJuego.getGenero());
			toString.append("\n\tAño Lanzamiento: " + videoJuego.getAnioLanzamiento());
			toString.append("\n ");

		}
		return toString.toString();
	}
	
}
