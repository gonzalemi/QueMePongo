import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {
    public Prenda prenda;

    @Before
    public void init() {
        prenda = TestHelper.ProveedorPrendas.prendaVacia();
    }

    @Test
    public void unUsuarioDebePoderEspecificarElTipoDePrenda() {
        prenda.setTipo(TipoPrenda.ZAPATOS);
        Assert.assertEquals(TipoPrenda.ZAPATOS, prenda.getTipo());
    }

    @Test
    public void unUsuarioDebePoderIdentificarLaCategoriaDeUnaPrenda() {
        Assert.assertEquals(CategoriaPrenda.ACCESORIOS, TestHelper.ProveedorPrendas.parDeAnteojos().getCategoria());
    }

    @Test
    public void unUsuarioDebePoderIndicarLaTelaDeUnaPrenda() {
        prenda.setTela("Algodon");
        Assert.assertEquals("Algodon", prenda.getTela());
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorPrincipalDeUnaPrenda() {
        prenda.setColorPrincipal("Verde");
        Assert.assertEquals("Verde", prenda.getColorPrincipal());
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorSecundarioDeUnaPrenda() {
        prenda.setColorSecundario("Azul");
        Assert.assertEquals("Azul", prenda.getColorSecundario());
    }
}


