package co.edu.cleanarc.reviewer.usecase.consultarserie;

import co.edu.cleanarc.reviewer.model.serie.Serie;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConsultarSerieUseCase {

    private Serie serie;

    public void consultarSerieUseCase() {
        this.serie = new Serie("BGSGG45", "La Casa de Papel",
                "Un grupo de amigos se une para un robo..",
                4.0f);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "----NOMBRE----" + serie.getNombre() +
                "----NOTA----" + serie.getCalificacionGeneral() +
                "----SINOPSIS----" + serie.getSinopsis() +
                "--------" + serie.getSerial() + "--------" +
                '}';
    }
}
