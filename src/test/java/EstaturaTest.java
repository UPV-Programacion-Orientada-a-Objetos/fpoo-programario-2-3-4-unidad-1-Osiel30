import edu.upvictoria.fpoo.EstructurasRepetitivas.Problema5.Estatura;
import static org.junit.Assert.*;
import org.junit.Test;
public class EstaturaTest {

    @Test
    public void TresPersonas() {
        float[] estaturas = {1.70f, 1.75f, 1.80f};
        assertEquals(1.75, Estatura.calcularEstatura(estaturas, 3), 0.001);
    }

    @Test
    public void UnaSolaPersona() {
        float[] estaturas = {1.65f};
        assertEquals(1.65, Estatura.calcularEstatura(estaturas, 1), 0.001);
    }

    @Test
    public void CincoPersonas() {
        float[] estaturas = {1.60f, 1.65f, 1.70f, 1.75f, 1.80f};
        assertEquals(1.70, Estatura.calcularEstatura(estaturas, 5), 0.001);
    }
    @Test
    public void CincoPersonasnegativo() {
        float[] estaturas = {-1.60f, -1.65f, -1.70f, -1.75f, -1.80f};
        assertEquals(-1.70, Estatura.calcularEstatura(estaturas, 5), 0.001);
    }
}
