package mi.semana;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiasSemanaTest {

    private DiasSemana diasSemana;

    @BeforeEach
    void setUp() {
        diasSemana = new DiasSemana();
    }

    @Test
    void testCrearListaDeDias() {
        diasSemana.crearListaDeDias();
        assertEquals(7, diasSemana.getLargoDeLaLista(), "La lista debe tener 7 días después de ser creada.");
        assertTrue(diasSemana.existeDia("Lunes"), "La lista debe contener 'Lunes'.");
        assertTrue(diasSemana.existeDia("Domingo"), "La lista debe contener 'Domingo'.");
    }

    @Test
    void testGetLargoDeLaLista() {
        assertEquals(0, diasSemana.getLargoDeLaLista(), "La lista debe estar vacía al inicio.");
        diasSemana.crearListaDeDias();
        assertEquals(7, diasSemana.getLargoDeLaLista(), "El largo de la lista debe ser 7.");
    }

    @Test
    void testEliminarDia() {
        diasSemana.crearListaDeDias();
        assertTrue(diasSemana.eliminarDia("Lunes"), "Se debe poder eliminar 'Lunes'.");
        assertEquals(6, diasSemana.getLargoDeLaLista(), "El largo de la lista debe ser 6 después de eliminar un día.");
        assertFalse(diasSemana.existeDia("Lunes"), "La lista no debe contener 'Lunes' después de ser eliminado.");

        assertFalse(diasSemana.eliminarDia("Día Inexistente"), "No se debe poder eliminar un día que no existe.");
    }

    @Test
    void testGetDiaPorIndice() {
        diasSemana.crearListaDeDias();
        assertEquals("Lunes", diasSemana.getDiaPorIndice(0), "El día en el índice 0 debe ser 'Lunes'.");
        assertEquals("Domingo", diasSemana.getDiaPorIndice(6), "El día en el índice 6 debe ser 'Domingo'.");
        assertNull(diasSemana.getDiaPorIndice(7), "Un índice fuera de rango debe retornar null.");
        assertNull(diasSemana.getDiaPorIndice(-1), "Un índice negativo debe retornar null.");
    }

    @Test
    void testExisteDia() {
        diasSemana.crearListaDeDias();
        assertTrue(diasSemana.existeDia("Lunes"), "Debe retornar true para un día que existe.");
        assertFalse(diasSemana.existeDia("Día Inexistente"), "Debe retornar false para un día que no existe.");
    }

    @Test
    void testOrdenarListaAlfabeticamente() {
        diasSemana.crearListaDeDias();
        diasSemana.ordenarListaAlfabeticamente();

        List<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Domingo");
        listaEsperada.add("Jueves");
        listaEsperada.add("Lunes");
        listaEsperada.add("Martes");
        listaEsperada.add("Miércoles");
        listaEsperada.add("Sábado");
        listaEsperada.add("Viernes");

        assertEquals(listaEsperada, diasSemana.getDiasDeLaSemana(), "La lista debe estar ordenada alfabéticamente.");
    }

    @Test
    void testVaciarLista() {
        diasSemana.crearListaDeDias();
        assertFalse(diasSemana.getDiasDeLaSemana().isEmpty(), "La lista no debe estar vacía antes de vaciarla.");
        diasSemana.vaciarLista();
        assertTrue(diasSemana.getDiasDeLaSemana().isEmpty(), "La lista debe estar vacía después de llamar a vaciarLista().");
        assertEquals(0, diasSemana.getLargoDeLaLista(), "El largo de la lista debe ser 0 después de vaciarla.");
    }
}
