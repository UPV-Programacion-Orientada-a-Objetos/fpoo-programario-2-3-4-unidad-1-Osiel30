import edu.upvictoria.fpoo.EstructurasRepetitivas.Problema4.PromedioDeGrupo;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class PromedioDeGrupoTest {
    @Test
    public void ValoresPositivos() {
        int[] edades = {18, 20, 22, 19, 21};
        double resultado = PromedioDeGrupo.calcularPromedio(edades, edades.length);
        assertEquals(20.0, resultado, 0.001);
    }

    @Test
    public void ValoresNegativos() {
        int[] edades = {-5, -10, -15, -20};
        double resultado = PromedioDeGrupo.calcularPromedio(edades, edades.length);
        assertEquals(-12.5, resultado, 0.001);
    }

    @Test
    public void ValoresCero() {
        int[] edades = {0, 0, 0, 0, 0};
        double resultado = PromedioDeGrupo.calcularPromedio(edades, edades.length);
        assertEquals(0.0, resultado, 0.001);
    }

}

