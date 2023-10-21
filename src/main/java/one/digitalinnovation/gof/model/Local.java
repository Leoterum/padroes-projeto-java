package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Local {

	@Id
	private String localizacao;
	private String description;
	private String temp;
	private String country;
	private String humidity;
	private String pressure;
	private String name;

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String GetDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
