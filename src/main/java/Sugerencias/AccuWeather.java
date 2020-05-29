package Sugerencias;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeather implements AccuWeatherAPI {

    @Override
    public List<Map<String, Object>> getWeather(String city){

        //Acá iría el código para configurar y llamar a la API Posta...
        Map<String, Object> map = new HashMap<>();
        map.put("Temperatura", 10);

        return (List<Map<String, Object>>) map;
    }
}
