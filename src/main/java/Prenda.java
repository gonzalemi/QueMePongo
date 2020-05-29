public class Prenda {
    private final Tipo tipo;
    private final Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;


    public Prenda(Tipo tipo, Material material, Color colorPrincipal, Trama trama) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.trama = trama;

        new ValidadorPrenda(this).validar();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Categoria getCategoria() {
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

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Trama getTrama() {
        return trama;
    }
}





