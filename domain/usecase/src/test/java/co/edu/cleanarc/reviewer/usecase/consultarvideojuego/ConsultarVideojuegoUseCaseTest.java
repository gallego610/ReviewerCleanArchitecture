package co.edu.cleanarc.reviewer.usecase.consultarvideojuego;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import co.edu.cleanarc.reviewer.model.videojuego.VideoJuego;
import co.edu.cleanarc.reviewer.model.videojuego.gateways.VideoJuegoRepository;

@ExtendWith(SpringExtension.class)
class ConsultarVideojuegoUseCaseTest {

	private static ConsultarVideojuegoUseCase consultarVideojuegoUseCase;

	@Mock
	private static VideoJuegoRepository videoJuegoRepository;

	List<VideoJuego> listaVideoJuegosConsultadas = new ArrayList<VideoJuego>();

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		consultarVideojuegoUseCase = new ConsultarVideojuegoUseCase(videoJuegoRepository);
		VideoJuego videojuego1 = new VideoJuego("001", "Age Of Empires", "Estrategia en tiempo real",
				"Age of Empires es una serie de videojuegos de estrategia en tiempo real para computadoras personales.",
				"http://www.ageofempires.com", new BigDecimal(50000), "2006", "CD-ROM y descarga directa");
		listaVideoJuegosConsultadas.add(videojuego1);
	}

	@Test
	void testConsultarCancionUseCase() {
		when(videoJuegoRepository.consultarVideoJuegos()).thenReturn(listaVideoJuegosConsultadas);
		consultarVideojuegoUseCase.consultarVideojuegoUseCase();
		String respuesta = consultarVideojuegoUseCase.toString();
		assertTrue(respuesta.contains("Age Of Empires"));
	}

}
