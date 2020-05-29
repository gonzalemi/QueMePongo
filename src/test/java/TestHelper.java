public class TestHelper {

    public static class ProveedorPrendas {

        private static final Color color = new Color(155, 233, 444);

        public static Prenda pantalonSinTipo() {
            return new PrendaBuilder()
                    .setMaterial(Material.ALGODON)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda zapatosSinMaterial() {
            return new PrendaBuilder()
                    .setTipo(Tipo.ZAPATOS)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda camisaSinColorPrincipal() {
            return new PrendaBuilder()
                    .setTipo(Tipo.CAMISA)
                    .setMaterial(Material.ALGODON)
                    .setTrama(Trama.RAYADA)
                    .Prenda();
        }

        public static Prenda parDeAnteojos() {
            return new PrendaBuilder()
                    .setTipo(Tipo.ANTEOJOS)
                    .setMaterial(Material.PLASTICO)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda camisaConTramaRayada() {
            return new PrendaBuilder()
                    .setTipo(Tipo.CAMISA)
                    .setMaterial(Material.ALGODON)
                    .setColorPrincipal(color)
                    .setTrama(Trama.RAYADA)
                    .Prenda();
        }

        public static Prenda pantalonConColorSecundario() {
            Prenda prenda = new PrendaBuilder()
                    .setTipo(Tipo.PANTALON)
                    .setMaterial(Material.ALGODON)
                    .setColorPrincipal(color)
                    .setTrama(Trama.A_CUADROS)
                    .Prenda();

            prenda.setColorSecundario(color);

            return prenda;
        }

        public static Prenda pantalonConMaterialesInadecuados() {
            return new PrendaBuilder()
                    .setTipo(Tipo.PANTALON)
                    .setMaterial(Material.PLASTICO)
                    .setColorPrincipal(color)
                    .setTrama(Trama.ESTAMPADO)
                    .Prenda();
        }
    }
}