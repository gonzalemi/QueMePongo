package Prenda;

public class PrendaBuilder {
    private Tipo tipo;
    private Material material;
    private Color colorPrincipal;
    private Trama trama;
    private Integer temperaturaMaxima;

    public PrendaBuilder setTipo(Tipo tipo) {
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

    public PrendaBuilder setTrama(Trama trama) {
        this.trama = trama;
        return this;
    }

    public PrendaBuilder setTemperaturaMaxima(Integer temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
        return this;
    }

    public Prenda Prenda() {
        return new Prenda(tipo, material, colorPrincipal, trama, temperaturaMaxima);
    }
}