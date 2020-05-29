package Prenda;

public class Prenda {
    private final Tipo tipo;
    private final Material material;
    private final Color colorPrincipal;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;
    private final Integer temperaturaMaxima;


    public Prenda(Tipo tipo, Material material, Color colorPrincipal, Trama trama, Integer temperaturaMaxima) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.trama = trama;
        this.temperaturaMaxima = temperaturaMaxima;

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

    public boolean esApta(Integer temperatura){
        return temperaturaMaxima >= temperatura;
    }
}





