package Sugerencias;

import java.util.List;
import java.util.Map;

// Simula que se configura la API Real y se obtiene información
public interface AccuWeatherAPI {
   List<Map<String, Object>> getWeather(String city);
}
