public class TestHelper {

    public static class ProveedorPrendas {

        public static Prenda pantalonSinTipo() {
            Prenda prenda = prendaVacia();
            prenda.setTela("Algodon");
            prenda.setColorPrincipal("Azul");

            return prenda;
        }

        public static Prenda anteojosSinCategoria() {
            Prenda prenda = prendaVacia();
            prenda.setTipo(TipoPrenda.ANTEOJOS);
            prenda.setTela("Algodon");
            prenda.setColorPrincipal("Amarillo");
            return prenda;
        }

        public static Prenda zapatosSinTela() {
            Prenda prenda = prendaVacia();
            prenda.setTipo(TipoPrenda.ZAPATOS);
            prenda.setColorPrincipal("Marron");
            return prenda;
        }

        public static Prenda camisaSinColorPrincipal() {
            Prenda prenda = prendaVacia();
            prenda.setTipo(TipoPrenda.CAMISA);
            prenda.setTela("Algodon");
            return prenda;
        }


        public static Prenda parDeAnteojos() {
            Prenda prenda = prendaVacia();
            prenda.setTipo(TipoPrenda.ANTEOJOS);
            prenda.setTela("Plastico");
            prenda.setColorPrincipal("Negro");
            return prenda;
        }

        public static Prenda prendaVacia() {
            return new Prenda();
        }

    }

}