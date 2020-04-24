public class TestHelper {

    public static class ProveedorPrendas {

        public static Prenda pantalonSinTipo() {
            return new Prenda(null, Material.ALGODON, new Color(155,233, 444), null);
        }

        public static Prenda zapatosSinMaterial() {
            return new Prenda(TipoPrenda.ZAPATOS, null, new Color(123,233, 433), null);
        }

        public static Prenda camisaSinColorPrincipal() {
            return new Prenda(TipoPrenda.CAMISA, Material.ALGODON, null, null);
        }

        public static Prenda parDeAnteojos() {
           return new Prenda(TipoPrenda.ANTEOJOS, Material.PLASTICO,new Color(1,2, 4), null);
        }
    }
}