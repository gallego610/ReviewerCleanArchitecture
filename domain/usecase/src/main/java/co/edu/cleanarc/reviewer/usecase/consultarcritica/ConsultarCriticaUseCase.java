package co.edu.cleanarc.reviewer.usecase.consultarcritica;

import co.edu.cleanarc.reviewer.model.critica.Critica;
import co.edu.cleanarc.reviewer.model.serie.Serie;
import lombok.Data;

@Data
public class ConsultarCriticaUseCase {

    private Critica critica;

    public ConsultarCriticaUseCase() {
        Serie serie = new Serie("BGSGG45", "La Casa de Papel",
                "Un grupo de amigos se une para un robo..",
                4.0f);

        this.critica = new Critica(120, 4.0f,
                "Me gusto la serie, es entretenida", serie);
    }

    @Override
    public String toString() {
        return "Critica de " + getNombreEntretenimiento() + "{" +
                "(" + this.critica.getCalificacion() + "): " + this.critica.getComentario();
    }

    protected String getNombreEntretenimiento(){
        String[] nombreClase = this.critica.getEntretenimiento().getClass().getName().split("\\.");
        return nombreClase[nombreClase.length-1];
    }
}
