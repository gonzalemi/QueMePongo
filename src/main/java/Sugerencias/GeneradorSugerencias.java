package Sugerencias;

import Prenda.Prenda;

import java.util.List;

public interface GeneradorSugerencias {

    public List<Sugerencia> generadorSugerenciasDesde(List<Prenda> prendasAptas);
}
