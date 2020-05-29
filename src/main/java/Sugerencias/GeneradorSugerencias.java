package Sugerencias;

import Prenda.Prenda;

import java.util.List;

public interface GeneradorSugerencias {

    List<Sugerencia> generadorSugerenciasDesde(List<Prenda> prendasAptas);
}
