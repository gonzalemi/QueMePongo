import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Tipo {

    ZAPATOS(Categoria.CALZADO, Arrays.asList(Material.ALGODON, Material.CUERO)),
    CAMISA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON, Material.POLIESTER)),
    PANTALON(Categoria.PARTE_INFERIOR, Arrays.asList(Material.ALGODON, Material.POLIESTER)),
    ANTEOJOS(Categoria.ACCESORIOS, Collections.singletonList(Material.PLASTICO));

    private final Categoria categoria;
    private final List<Material> materialesAdecuados;

    Tipo(Categoria categoria, List<Material> materialesAdecuados) {
        this.categoria = categoria;
        this.materialesAdecuados = materialesAdecuados;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean admiteMaterial(Material  material) {
        return materialesAdecuados.contains(material);
    }
}