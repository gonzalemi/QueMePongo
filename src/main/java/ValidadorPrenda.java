public class ValidadorPrenda {

    public void validar(Prenda prenda) {
        validarTipo(prenda);
        validarTela(prenda);
        validarColorPrincipal(prenda);
    }

    private void validarTipo(Prenda prenda) {
        if (prenda.getTipo() == null)
            throw new SinTipoException("");
    }

    private void validarTela(Prenda prenda) {
        if (prenda.getTela().isEmpty())
            throw new SinTelaException("");
    }

    private void validarColorPrincipal(Prenda prenda) {
        if (prenda.getColorPrincipal().isEmpty())
            throw new SinColorPrincipalException("");
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