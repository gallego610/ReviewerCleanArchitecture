package co.edu.cleanarc.reviewer.model.videojuego.gateways;

import java.util.List;

import co.edu.cleanarc.reviewer.model.videojuego.VideoJuego;

public interface VideoJuegoRepository {
	
	public List<VideoJuego> consultarVideoJuegos();
}
