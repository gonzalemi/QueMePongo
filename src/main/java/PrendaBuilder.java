public class PrendaBuilder {
    private TipoPrenda tipo;
    private Material material;
    private Color colorPrincipal;
    private String colorSecundario;

    public PrendaBuilder setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
        return this;
    }

    public PrendaBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public PrendaBuilder setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
        return this;
    }

    public Prenda Prenda() {
        return new Prenda(tipo, material, colorPrincipal);
    }
}