public class TestHelper {

    public static class ProveedorPrendas {

        private static Color color = new Color(155, 233, 444);

        public static Prenda pantalonSinTipo() {
            return new PrendaBuilder()
                    .setMaterial(Material.ALGODON)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda zapatosSinMaterial() {
            return new PrendaBuilder()
                    .setTipo(TipoPrenda.ZAPATOS)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda camisaSinColorPrincipal() {
            Material material = Material.PLASTICO;
            material.setTrama(Trama.RAYADA);

            return new PrendaBuilder()
                    .setTipo(TipoPrenda.CAMISA)
                    .setMaterial(Material.ALGODON)
                    .Prenda();
        }

        public static Prenda parDeAnteojos() {
            return new PrendaBuilder()
                    .setTipo(TipoPrenda.ANTEOJOS)
                    .setMaterial(Material.PLASTICO)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda camisaConTramaRayada() {
            Material material = Material.PLASTICO;
            material.setTrama(Trama.RAYADA);

            return new PrendaBuilder()
                    .setTipo(TipoPrenda.CAMISA)
                    .setMaterial(material)
                    .setColorPrincipal(color)
                    .Prenda();
        }

        public static Prenda pantalonConColorSecundario() {
            Prenda prenda = new PrendaBuilder()
                    .setTipo(TipoPrenda.CAMISA)
                    .setMaterial(Material.ALGODON)
                    .setColorPrincipal(color)
                    .Prenda();

            prenda.setColorSecundario(color);

            return prenda;
        }
    }
}