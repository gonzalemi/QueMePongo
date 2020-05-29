public class ValidadorPrenda {

    private final Prenda prenda;

    public ValidadorPrenda(Prenda prenda) {
       this.prenda = prenda;
    }

    public void validar() {
        validarTipo();
        validarMaterial();
        validarColorPrincipal();
        validarMaterialesAdecuados();
    }

    private void validarTipo() {
        if (prenda.getTipo() == null)
            throw new SinTipoException();
    }

    private void validarMaterial() {
        if (prenda.getMaterial() == null)
            throw new SinMaterialException();
    }

    private void validarColorPrincipal() {
        if (prenda.getColorPrincipal() == null)
            throw new SinColorPrincipalException();
    }

    private void validarMaterialesAdecuados() {

        if(!prenda.getTipo().admiteMaterial(prenda.getMaterial())){
            throw new MaterialesInadecuadosException(prenda.getTipo(), prenda.getMaterial());
        }
    }

    public static class SinTipoException extends RuntimeException {
        public SinTipoException() {
            super("La prenda debe poseer un tipo");
        }
    }

    public static class SinMaterialException extends RuntimeException {
        public SinMaterialException() {
            super("La prenda debe poseer un material");
        }
    }

    public static class SinColorPrincipalException extends RuntimeException {
        public SinColorPrincipalException(){ super("La prenda debe poseer un color principal"); }
    }

    public static class MaterialesInadecuadosException extends RuntimeException {
        public MaterialesInadecuadosException(Tipo tipo, Material material) {
            super("Un(a) " + tipo + "no puede ser de " + material);
        }
    }
}