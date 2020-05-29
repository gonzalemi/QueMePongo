package Sugerencias;

import java.util.List;
import java.util.Map;

public class ServicioClimaAdapterAccuWeather implements ServicioClimaAdapter{

    AccuWeather servicioCLima;

    public ServicioClimaAdapterAccuWeather(AccuWeather servicioClima){
        this.servicioCLima = servicioClima;
    }

    @Override
    public Integer getTemperatura(String ciudad) {
        List<Map<String, Object>> clima = servicioCLima.getWeather(ciudad);

        return (Integer) clima.get(0).get("Temperatura");
    }
}
