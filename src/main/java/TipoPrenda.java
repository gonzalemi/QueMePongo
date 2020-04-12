public enum TipoPrenda {
    ZAPATOS(CategoriaPrenda.CALZADO),
    CAMISA(CategoriaPrenda.SUPERIOR),
    PANTALON(CategoriaPrenda.INFERIOR),
    ANTEOJOS(CategoriaPrenda.ACCESORIOS);

    private CategoriaPrenda categoria;

    TipoPrenda(CategoriaPrenda categoria) {

        this.categoria = categoria;
    }

    public CategoriaPrenda getCategoria() {
        return categoria;
    }
}