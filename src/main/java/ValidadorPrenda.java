public class ValidadorPrenda {

    public void validar(Prenda prenda) {
        validarTipo(prenda);
        validarMaterial(prenda);
        validarColorPrincipal(prenda);

    }

    private void validarTipo(Prenda prenda) {
        if (prenda.getTipo() == null)
            throw new SinTipoException("La prenda seleccionada no posee tipo");
    }

    private void validarMaterial(Prenda prenda) {
        if (prenda.getMaterial() == null)
            throw new SinMaterialException("La prenda seleccionada no posee material");
    }

    private void validarColorPrincipal(Prenda prenda) {
        if (prenda.getColorPrincipal() == null)
            throw new SinColorPrincipalException("La prenda seleccionada no posee color principal");
    }

    public class SinTipoException extends RuntimeException {
        public SinTipoException(String message) {
            super(message);
        }
    }

    public class SinMaterialException extends RuntimeException {
        public SinMaterialException(String message) {
            super(message);
        }
    }

    public class SinColorPrincipalException extends RuntimeException {
        public SinColorPrincipalException(String message) {
            super(message);
        }
    }
}