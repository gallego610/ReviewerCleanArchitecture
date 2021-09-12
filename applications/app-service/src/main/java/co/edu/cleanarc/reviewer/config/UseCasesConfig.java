package co.edu.cleanarc.reviewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.cleanarc.reviewer.model.cancion.gateways.CancionRepository;
import co.edu.cleanarc.reviewer.model.videojuego.gateways.VideoJuegoRepository;
import co.edu.cleanarc.reviewer.usecase.consultarcancion.ConsultarCancionUseCase;
import co.edu.cleanarc.reviewer.usecase.consultarcritica.ConsultarCriticaUseCase;
import co.edu.cleanarc.reviewer.usecase.consultarserie.ConsultarSerieUseCase;
import co.edu.cleanarc.reviewer.usecase.consultarvideojuego.ConsultarVideojuegoUseCase;

@Configuration
public class UseCasesConfig {

	@Bean
	public ConsultarSerieUseCase consultarSerieUseCase() {
		return new ConsultarSerieUseCase();
	}

	@Bean
	public ConsultarCriticaUseCase consultarCriticaUseCase() {
		return new ConsultarCriticaUseCase();
	}

	@Bean
	public ConsultarCancionUseCase consultarCancionUseCase(CancionRepository cancionRepository) {
		return new ConsultarCancionUseCase(cancionRepository);
	}

	@Bean
	public ConsultarVideojuegoUseCase consultarVideojuegoUseCase(VideoJuegoRepository videoJuegoRepository) {
		return new ConsultarVideojuegoUseCase(videoJuegoRepository);
	}

}
