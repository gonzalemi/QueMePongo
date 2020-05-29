package Prenda;

import Sugerencias.ServicioClimaAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class PrendaService {

    ServicioClimaAdapter adapter;

    public PrendaService(ServicioClimaAdapter adapter){
        this.adapter = adapter;
    }

    public List<Prenda> getPrendasAptas(List<Prenda> prendas, String ciudad) {
       Integer temperaturaMaxima = adapter.getTemperatura(ciudad);

        return prendas
                .stream()
                .filter(prenda -> prenda.esApta(temperaturaMaxima))
                .collect(Collectors.toList());
    }
}
