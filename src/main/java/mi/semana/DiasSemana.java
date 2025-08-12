
package mi.semana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiasSemana {

    private List<String> diasDeLaSemana;

    public DiasSemana() {
        this.diasDeLaSemana = new ArrayList<>();
    }

    public void crearListaDeDias() {
        this.diasDeLaSemana.add("Lunes");
        this.diasDeLaSemana.add("Martes");
        this.diasDeLaSemana.add("Miércoles");
        this.diasDeLaSemana.add("Jueves");
        this.diasDeLaSemana.add("Viernes");
        this.diasDeLaSemana.add("Sábado");
        this.diasDeLaSemana.add("Domingo");
    }

    public List<String> getDiasDeLaSemana() {
        return this.diasDeLaSemana;
    }

    public int getLargoDeLaLista() {
        return this.diasDeLaSemana.size();
    }

    public boolean eliminarDia(String dia) {
        return this.diasDeLaSemana.remove(dia);
    }

    public String getDiaPorIndice(int indice) {
        if (indice >= 0 && indice < this.diasDeLaSemana.size()) {
            return this.diasDeLaSemana.get(indice);
        }
        return null;
    }

    public boolean existeDia(String dia) {
        return this.diasDeLaSemana.contains(dia);
    }

    public void ordenarListaAlfabeticamente() {
        Collections.sort(this.diasDeLaSemana);
    }

    public void vaciarLista() {
        this.diasDeLaSemana.clear();
    }
}

