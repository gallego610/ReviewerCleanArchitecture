package co.edu.cleanarc.reviewer.api;
import co.edu.cleanarc.reviewer.usecase.consultarcancion.ConsultarCancionUseCase;
import co.edu.cleanarc.reviewer.usecase.consultarcritica.ConsultarCriticaUseCase;
import co.edu.cleanarc.reviewer.usecase.consultarserie.ConsultarSerieUseCase;
import co.edu.cleanarc.reviewer.usecase.consultarvideojuego.ConsultarVideojuegoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reviewer/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final ConsultarSerieUseCase consultarSerieUseCase;
    private final ConsultarCriticaUseCase consultarCriticaUseCase;
    private final ConsultarCancionUseCase consultarCancionUseCase;
    private final ConsultarVideojuegoUseCase consultarVideojuegoUseCase;

    @GetMapping(path = "/")
    public String saludo() {
        return "Hola a todos!!";
    }

    @GetMapping(path = "/consultarSeries")
    public String consultarSeries() {
        return this.consultarSerieUseCase.toString();
    }

    @GetMapping(path = "/consultarCriticas")
    public String consultarCriticas() {
        return this.consultarCriticaUseCase.toString();
    }
    
    @GetMapping(path = "/consultarCanciones")
    public String consultarCanciones() {
        consultarCancionUseCase.consultarCancionUseCase();
        return this.consultarCancionUseCase.toString();
        
    }
    
    @GetMapping(path = "/consultarVideoJuegos")
    public String consultarVideoJuegos() {
    	consultarVideojuegoUseCase.consultarVideojuegoUseCase();
        return this.consultarVideojuegoUseCase.toString();
    }
}
