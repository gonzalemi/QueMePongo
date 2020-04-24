import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {
    public Prenda prenda;

    @Before
    public void init() {
        prenda = TestHelper.ProveedorPrendas.parDeAnteojos();
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
        prenda.setMaterial(Material.ALGODON);
        Assert.assertEquals(Material.ALGODON, prenda.getMaterial());
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorPrincipalDeUnaPrenda() {
        Color color = new Color(1,2, 4);
        prenda.setColorPrincipal(color);

        Assert.assertEquals(color, prenda.getColorPrincipal());
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorSecundarioDeUnaPrenda() {
        prenda.setColorSecundario("Azul");
        Assert.assertEquals("Azul", prenda.getColorSecundario());
    }
}


