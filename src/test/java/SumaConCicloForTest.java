import edu.upvictoria.fpoo.EstructurasRepetitivas.Problema2.SumaConCicloFor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SumaConCicloForTest {
    @Test
    public void prueba_suma_10_numeros_enteros() {
        float[] valores = {76, 15, 42, 36, 92, 85, 12, 74, 36, 95};
        assertEquals(563.0f, SumaConCicloFor.Sumar(valores), 0.001);
    }
    @Test
    public void prueba_suma_10_numeros_negativos() {
        float[] valores = {-76, -15, -42, -36, -92, -85, -12, -74, -36, -95};
        assertEquals(-563.0f, SumaConCicloFor.Sumar(valores), 0.001);
    }
    @Test
    public void prueba_suma_10_numeros_entyneg() {
        float[] valores = {76, -15, 42, -36, 92, -85, 12, -74, 36, -95};
        assertEquals(-47.0f, SumaConCicloFor.Sumar(valores), 0.001);
    }
    @Test
    public void prueba_suma_10_numeros_floats() {
        float[] valores = {76.364f, 15.258f, 42.147f, 36.147f, 92.789f, 85.159f, 12.365f, 74.147f, 36.012f, 95.354f};
        assertEquals(565.742f, SumaConCicloFor.Sumar(valores), 0.001);
    }
    @Test
    public void prueba_suma_10_numeros_varios() {
        float[] valores = {76.364f, -15.258f, 42.147f, -36.147f, 92, 85.159f, 12, 74.147f, 36, -95};
        assertEquals(271.412f, SumaConCicloFor.Sumar(valores), 0.001);
    }
}
