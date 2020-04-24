public enum Material {
    ALGODON, PLASTICO;

    private Trama trama;

    Material() {
        this.setTrama(Trama.LISA);
    }

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }
}