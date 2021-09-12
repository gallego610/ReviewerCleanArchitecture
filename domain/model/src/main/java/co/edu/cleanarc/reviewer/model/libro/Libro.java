package co.edu.cleanarc.reviewer.model.libro;
import co.edu.cleanarc.reviewer.model.entretenimiento.Entretenimiento;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder(toBuilder = true)
public class Libro implements Entretenimiento {


    @Override
    public void evaluar() {

    }
}
