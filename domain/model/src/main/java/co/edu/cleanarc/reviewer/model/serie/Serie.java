package co.edu.cleanarc.reviewer.model.serie;
import co.edu.cleanarc.reviewer.model.entretenimiento.Entretenimiento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Serie implements Entretenimiento {

    private String serial;
    private String nombre;
    private String sinopsis;
    private Float calificacionGeneral;

    @Override
    public void evaluar() {

    }
}
