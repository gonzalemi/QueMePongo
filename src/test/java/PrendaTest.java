import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {
    public Prenda prenda;

    @Before
    public void init() {
        prenda = TestHelper.ProveedorPrendas.camisaConTramaRayada();
    }

    @Test
    public void unUsuarioDebePoderEspecificarElTipoDePrenda() {
        Assert.assertEquals(Tipo.CAMISA, prenda.getTipo());
    }

    @Test
    public void unUsuarioDebePoderIdentificarLaCategoriaDeUnaPrenda() {
        Assert.assertEquals(Categoria.ACCESORIOS, TestHelper.ProveedorPrendas.parDeAnteojos().getCategoria());
    }

    @Test
    public void unUsuarioDebePoderIndicarLaTelaDeUnaPrenda() {
        Assert.assertEquals(Material.ALGODON, prenda.getMaterial());
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorPrincipalDeUnaPrenda() {
        Color color = prenda.getColorPrincipal();

        Assert.assertEquals(color.getRojo(), 155);
        Assert.assertEquals(color.getVerde(), 233);
        Assert.assertEquals(color.getAzul(), 444);
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorSecundarioDeUnaPrenda() {
        Color color = TestHelper.ProveedorPrendas.pantalonConColorSecundario().getColorSecundario();

        Assert.assertEquals(color.getRojo(), 155);
        Assert.assertEquals(color.getVerde(), 233);
        Assert.assertEquals(color.getAzul(), 444);
    }

    @Test
    public void unUsuarioDebePoderIndicarLaTrama() {
        Assert.assertEquals(Trama.RAYADA, prenda.getTrama());
    }
}


