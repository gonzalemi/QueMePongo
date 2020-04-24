import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidadorPrendaTest {
    private ValidadorPrenda validador;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void init() {
        validador = new ValidadorPrenda();
    }

    @Test
    public void debeValidarCorrectamentePrendasSinTipo() {
        thrown.expect(ValidadorPrenda.SinTipoException.class);
        validador.validar(TestHelper.ProveedorPrendas.pantalonSinTipo());
    }

    @Test
    public void debeValidarCorrectamentePrendasSinTela() {
        thrown.expect(ValidadorPrenda.SinMaterialException.class);
        validador.validar(TestHelper.ProveedorPrendas.zapatosSinMaterial());
    }

    @Test
    public void debeValidarCorrectamentePrendasSinColorPrincipal() {
        thrown.expect(ValidadorPrenda.SinColorPrincipalException.class);
        validador.validar(TestHelper.ProveedorPrendas.camisaSinColorPrincipal());
    }
}
