import Prenda.ValidadorPrenda;
import org.junit.Test;

public class ValidadorPrendaTest {

    @Test(expected = ValidadorPrenda.SinTipoException.class)
    public void debeValidarCorrectamentePrendasSinTipo() {
        new ValidadorPrenda(TestHelper.ProveedorPrendas.pantalonSinTipo()).validar();
    }

    @Test(expected = ValidadorPrenda.SinMaterialException.class)
    public void debeValidarCorrectamentePrendasSinTela() {
        new ValidadorPrenda(TestHelper.ProveedorPrendas.zapatosSinMaterial()).validar();
    }

    @Test(expected = ValidadorPrenda.SinColorPrincipalException.class)
    public void debeValidarCorrectamentePrendasSinColorPrincipal() {
        new ValidadorPrenda(TestHelper.ProveedorPrendas.camisaSinColorPrincipal()).validar();
    }

    @Test(expected = ValidadorPrenda.MaterialesInadecuadosException.class)
    public void debeValidarCorrectamentePrendasConMaterialesInadecuados() {
        new ValidadorPrenda(TestHelper.ProveedorPrendas.pantalonConMaterialesInadecuados()).validar();
    }
}
