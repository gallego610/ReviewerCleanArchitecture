package co.edu.cleanarc.reviewer.usecase.consultarcancion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import co.edu.cleanarc.reviewer.model.cancion.Cancion;
import co.edu.cleanarc.reviewer.model.cancion.gateways.CancionRepository;

@ExtendWith(SpringExtension.class)
class ConsultarCancionUseCaseTest {

	private static ConsultarCancionUseCase consultarCancionUseCase;

	@Mock
	private static CancionRepository cancionRepository;

	List<Cancion> listaCancionesConsultadas = new ArrayList<Cancion>();
	@BeforeEach
	void setUpBeforeClass() throws Exception {
		consultarCancionUseCase = new ConsultarCancionUseCase(cancionRepository);
		Cancion cancion2 = new Cancion("0002", "vivir sin aire", "Pop", "Maná", "¿Dónde Jugarán los Niños?");
		listaCancionesConsultadas.add(cancion2);
	}

	@Test
	void testConsultarCancionUseCase() {
		when(cancionRepository.consultarCanciones()).thenReturn(listaCancionesConsultadas);
		consultarCancionUseCase.consultarCancionUseCase();
		String respuesta = consultarCancionUseCase.toString();
		assertTrue(respuesta.contains("Maná"));

	}

}
