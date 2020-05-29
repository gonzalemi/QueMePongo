import Prenda.Prenda;
import Sugerencias.GeneradorSugerenciasImpl;
import Sugerencias.ServicioClimaAdapterAccuWeather;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestGeneradorSugerencias {

    GeneradorSugerenciasImpl generador;
    List<Prenda> prendas = new ArrayList<>();

    @Mock
    ServicioClimaAdapterAccuWeather adapter = mock(ServicioClimaAdapterAccuWeather.class);

    @Before
    public void init() {

        MockitoAnnotations.initMocks(this);

        prendas.add(TestHelper.ProveedorPrendas.camisaConTramaRayada());
        prendas.add(TestHelper.ProveedorPrendas.pantalonConColorSecundario());
        prendas.add(TestHelper.ProveedorPrendas.parDeAnteojos());

        generador = new GeneradorSugerenciasImpl(adapter);
    }

    @Test
    public void seGeneranSugerenciasAcordesALasCondicionesClimaticas() {

        when(adapter.getTemperatura(anyString())).thenReturn(11);
        Assert.assertEquals(1, generador.getPrendasAptas(prendas, "Buenos Aires").size());
        Mockito.verify(adapter, Mockito.only());
    }
}