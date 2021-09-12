package co.edu.cleanarc.reviewer.model.cancion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Cancion {
	
	private String id;
	private String nombre;
	private String genero;
	private String autor;
	private String album;
	
}
