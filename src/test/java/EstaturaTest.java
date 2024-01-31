import edu.upvictoria.fpoo.EstructurasRepetitivas.Problema6.Ahorro;
import static org.junit.Assert.*;
import org.junit.Test;
public class EstaturaTest {
    @Test
    public void testAhorroAnualConDepositosPositivos() {
        float[] dinero = {125.36f, 147.32f, 145.32f, 147.52f, 159.36f, 852.36f, 789.25f, 147.21f, 456.321f, 478.65f, 489.459f, 745.147f};
        assertEquals(4683.277, Ahorro.AhorroAnual(dinero, 12), 0.001);
    }

    @Test
    public void testAhorroAnualConDepositosCero() {
        float[] dinero = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(0.0, Ahorro.AhorroAnual(dinero, 12), 0.001);
    }
}
