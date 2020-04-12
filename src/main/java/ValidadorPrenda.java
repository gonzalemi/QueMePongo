public class ValidadorPrenda {

    public void validar(Prenda prenda) {
        validarTipo(prenda);
        validarTela(prenda);
        validarColorPrincipal(prenda);
    }

    private void validarTipo(Prenda prenda) {
        if (prenda.getTipo() == null)
            throw new SinTipoException("La prenda seleccionada no posee tipo");
    }

    private void validarTela(Prenda prenda) {
        if (prenda.getTela().isEmpty())
            throw new SinTelaException("La prenda seleccionada no posee tela");
    }

    private void validarColorPrincipal(Prenda prenda) {
        if (prenda.getColorPrincipal().isEmpty())
            throw new SinColorPrincipalException("La prenda seleccionada no posee color principal");
    }

    public class SinTipoException extends RuntimeException {
        public SinTipoException(String message) {
            super(message);
        }
    }

    public class SinTelaException extends RuntimeException {
        public SinTelaException(String message) {
            super(message);
        }
    }

    public class SinColorPrincipalException extends RuntimeException {
        public SinColorPrincipalException(String message) {
            super(message);
        }
    }
}