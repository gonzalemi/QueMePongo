public enum TipoPrenda {
    ZAPATOS(CategoriaPrenda.CALZADO),
    CAMISA(CategoriaPrenda.PARTE_SUPERIOR),
    PANTALON(CategoriaPrenda.PARTE_INFERIOR),
    ANTEOJOS(CategoriaPrenda.ACCESORIOS);

    private CategoriaPrenda categoria;

    TipoPrenda(CategoriaPrenda categoria) {

        this.categoria = categoria;
    }

    public CategoriaPrenda getCategoria() {
        return categoria;
    }
}