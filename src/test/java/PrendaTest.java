import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {
    public Prenda prenda;
    Color color;

    @Before
    public void init() {
        prenda = TestHelper.ProveedorPrendas.parDeAnteojos();
        color = new Color(1,2, 4);
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

        prenda.setColorPrincipal(color);

        Assert.assertEquals(color, prenda.getColorPrincipal());
    }

    @Test
    public void unUsuarioDebePoderIndicarElColorSecundarioDeUnaPrenda() {
        prenda.setColorSecundario(color);
        Assert.assertEquals(color, prenda.getColorSecundario());
    }

    @Test
    public void unUsuarioDebePoderIndicarLaTramaQueTieneElMaterial() {
        Assert.assertEquals(Trama.RAYADA, TestHelper.ProveedorPrendas.camisaConTramaRayada().getTrama());
    }

    @Test
    public void copiaDeUnaPrenda() {
        Prenda copia =  prenda.copy();
        Assert.assertEquals(prenda.getTipo(), copia.getTipo());
        Assert.assertEquals(prenda.getColorPrincipal(), copia.getColorPrincipal());
        Assert.assertEquals(prenda.getMaterial(), copia.getMaterial());
        Assert.assertEquals(prenda.getCategoria(), copia.getCategoria());
        Assert.assertEquals(prenda.getColorSecundario(), copia.getColorSecundario());
        Assert.assertEquals(prenda.getTrama(), copia.getTrama());
    }
}


