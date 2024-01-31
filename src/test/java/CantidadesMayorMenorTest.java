import edu.upvictoria.fpoo.EstructurasRepetitivas.Problema7.CantidadesMayorMenor;
import static org.junit.Assert.*;
import org.junit.Test;
public class CantidadesMayorMenorTest {
    @Test
    public void testCantidadesMayorMenorConNumerosFlotantes() {
        double[] numeros = {1.5, -2.0, 3.7, 0.0, -1.8, 5.2};
        CantidadesMayorMenor.calcularCantidades(numeros);
    }

    @Test
    public void testCantidadesMayorMenorConNumerosNegativos() {
        double[] numeros = {-5.3, -2.8, -7.1, -1.0};
        CantidadesMayorMenor.calcularCantidades(numeros);
    }

    @Test
    public void testCantidadesMayorMenorConNumerosEnteros() {
        double[] numeros = {-3, 0, 2, -1, 5};
        CantidadesMayorMenor.calcularCantidades(numeros);
    }

    @Test
    public void testCantidadesMayorMenorConNumerosDoubles() {
        double[] numeros = {3.14, -2.71, 0.0, 1.618, -0.5};
        CantidadesMayorMenor.calcularCantidades(numeros);
    }

    @Test
    public void testCantidadesMayorMenorConVariedadDeDatos() {
        double[] numeros = {1, -2.5, 3.7, 0, -1.8, 5.2, -7, 10.6, 0.0, -3.14};
        CantidadesMayorMenor.calcularCantidades(numeros);
    }
}
