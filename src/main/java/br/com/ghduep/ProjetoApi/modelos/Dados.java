package br.com.ghduep.ProjetoApi.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(@JsonAlias("todayCases") Integer casosDeHoje, @JsonAlias("todayDeaths") Integer mortesDeHoje, @JsonAlias("todayRecovered") Integer recuperadosDeHoje, @JsonAlias("affectedCountries") Integer paisesAfetados) {
}
