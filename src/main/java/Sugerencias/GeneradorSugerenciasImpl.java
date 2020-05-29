package Sugerencias;

import Prenda.Prenda;

import java.util.List;
import java.util.stream.Collectors;

public class GeneradorSugerenciasImpl implements  GeneradorSugerencias {
    ServicioClimaAdapter adapter;

    @Override
    public List<Sugerencia> generadorSugerenciasDesde(List<Prenda> prendasAptas) {
        return null;
    }

    public GeneradorSugerenciasImpl(ServicioClimaAdapter adapter){
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
