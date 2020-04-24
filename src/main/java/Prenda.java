public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private Color colorPrincipal;
    private String colorSecundario;

    private ValidadorPrenda validadorPrenda = new ValidadorPrenda();

    public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, String colorSecundario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;

        validadorPrenda.validar(this);
    }

    public TipoPrenda getTipo() {
        return tipo;
    }

    public void setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
    }

    public CategoriaPrenda getCategoria() {
        return getTipo().getCategoria();
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(Color Color) {
        this.colorPrincipal = Color;
    }
}





