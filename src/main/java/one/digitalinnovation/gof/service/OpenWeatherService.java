package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Local;

@FeignClient(name = "weather", url = "https://api.openweathermap.org/data/2.5")
public interface OpenWeatherService {

	@GetMapping("weather?q={local}&appid='suakey'") //inserir openweatherAPI key.
	Local consultarLocalizacao(@PathVariable("local") String local);
}
