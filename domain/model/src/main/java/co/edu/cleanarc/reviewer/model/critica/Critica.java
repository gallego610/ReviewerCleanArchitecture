package co.edu.cleanarc.reviewer.model.critica;
import co.edu.cleanarc.reviewer.model.entretenimiento.Entretenimiento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Critica {

    private Integer id;
    private Float calificacion;
    private String comentario;
    private Entretenimiento entretenimiento;
}
