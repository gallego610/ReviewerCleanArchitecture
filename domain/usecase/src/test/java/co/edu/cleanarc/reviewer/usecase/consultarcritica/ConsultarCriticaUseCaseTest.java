package co.edu.cleanarc.reviewer.usecase.consultarcritica;

import co.edu.cleanarc.reviewer.model.critica.Critica;
import co.edu.cleanarc.reviewer.model.libro.Libro;
import co.edu.cleanarc.reviewer.model.serie.Serie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class ConsultarCriticaUseCaseTest {

    private ConsultarCriticaUseCase consultarCriticaUseCase;
    private Critica criticaTest;
    private Serie serieTest;
    private Libro libroTest;


    @BeforeEach
    void setUp() {
        this.consultarCriticaUseCase = new ConsultarCriticaUseCase();
        this.criticaTest = new Critica(300, 4.3f,
                "Comentario de prueba sobre la serie", null);
        this.serieTest = new Serie("AAAA001", "Serie prueba 1",
                "Una serie de prueba sobre los test unitarios",
                4.3f);
        libroTest = new Libro();
    }

    @Test
    void getNombreEntretenimientoSerie() {
        this.criticaTest.setEntretenimiento(serieTest);
        this.consultarCriticaUseCase.setCritica(criticaTest);
        String valorEsperado = "Serie";
        assertEquals(valorEsperado, this.consultarCriticaUseCase.getNombreEntretenimiento());
    }

    @Test
    void getNombreEntretenimientoLibro() {
        this.criticaTest.setEntretenimiento(libroTest);
        this.consultarCriticaUseCase.setCritica(this.criticaTest);
        String valorEsperado = "Libro";
        assertEquals(valorEsperado, this.consultarCriticaUseCase.getNombreEntretenimiento());
    }
}