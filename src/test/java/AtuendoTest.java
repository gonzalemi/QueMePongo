import org.junit.Assert;
import org.junit.Test;

public class AtuendoTest {

    @Test
    public void unUsuarioDebePoderAgregarUnaPrendaAUnAtuendo() {
        Atuendo atuendo = new Atuendo();
        atuendo.agregarPrenda(TestHelper.ProveedorPrendas.parDeAnteojos());

        Assert.assertEquals(1, atuendo.prendas.size());
    }
}
