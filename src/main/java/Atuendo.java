import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    public List<Prenda> prendas = new ArrayList<>();
    private ValidadorPrenda validadorPrenda = new ValidadorPrenda();

    public void agregarPrenda(Prenda prenda) {
        validadorPrenda.validar(prenda);
        prendas.add(prenda);
    }

}
