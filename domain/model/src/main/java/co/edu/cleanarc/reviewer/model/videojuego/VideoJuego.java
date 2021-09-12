package co.edu.cleanarc.reviewer.model.videojuego;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class VideoJuego {
	
	
	private String id;
	private String nombre;
	private String genero;
	private String descripcion;
	private String sitioWeb;
	private BigDecimal costo;
	private String anioLanzamiento;
	private String plataforma;
}
