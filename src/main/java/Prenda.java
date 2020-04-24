public class Prenda {
    private TipoPrenda tipo;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;

    private PrendaBuilder builder;
    private ValidadorPrenda validadorPrenda = new ValidadorPrenda();

    public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;

        validadorPrenda.validar(this);
    }

    public Prenda copy() {
        Prenda copia = new  Prenda(this.tipo, this.material, this.colorPrincipal);
        copia.setColorSecundario(this.colorSecundario);

        return  copia;
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

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
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

    public Trama getTrama() {
        return material.getTrama();
    }
}





