package mi.semana.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mi.semana.model.DiaSemana;
import mi.semana.view.VistaSemana; // Importamos la interfaz List

public class ControladorSemana {

    // Cambiamos a la interfaz List
    private List<DiaSemana> dias = new ArrayList<>();

    private VistaSemana vista;

    public ControladorSemana(VistaSemana vista) {
        this.vista = vista;
        crearListaDias();
    }

    // Un método para crear la lista de los días de la semana
    public void crearListaDias() {
        dias.clear(); // Limpiamos por si se llama varias veces
        dias.add(new DiaSemana("Lunes", 1));
        dias.add(new DiaSemana("Martes", 2));
        dias.add(new DiaSemana("Miércoles", 3));
        dias.add(new DiaSemana("Jueves", 4));
        dias.add(new DiaSemana("Viernes", 5));
        dias.add(new DiaSemana("Sábado", 6));
        dias.add(new DiaSemana("Domingo", 7));
    }

    // Un método que retorne los días de la semana
    public List<DiaSemana> getDiasDeLaSemana() {
        return dias;
    }
    
    // Un método que retorne el largo de la lista
    public int getLargoDeLaLista() {
        return dias.size();
    }

    // Un método para eliminar un día de la semana
    public void eliminarDia(String nombreDia) {
        DiaSemana diaAEliminar = null;
        for (DiaSemana dia : dias) {
            if (dia.getNombre().equalsIgnoreCase(nombreDia)) {
                diaAEliminar = dia;
                break;
            }
        }
        if (diaAEliminar != null) {
            dias.remove(diaAEliminar);
            vista.imprimirMensaje("El día '" + nombreDia + "' ha sido eliminado.");
        } else {
            vista.imprimirMensajeError("El día '" + nombreDia + "' no se encontró en la lista.");
        }
    }

    // Un método que retorne el día de la semana solicitado
    public DiaSemana getDiaSolicitado(String nombreDia) {
        for (DiaSemana dia : dias) {
            if (dia.getNombre().equalsIgnoreCase(nombreDia)) {
                return dia;
            }
        }
        return null;
    }

    // Un método que retorne si el día solicitado existe en la lista
    public boolean existeDia(String nombreDia) {
        for (DiaSemana dia : dias) {
            if (dia.getNombre().equalsIgnoreCase(nombreDia)) {
                return true;
            }
        }
        return false;
    }

    // Un método para ordenar la lista de días por orden alfabético
    public void ordenarPorAlfabeto() {
        Collections.sort(dias, Comparator.comparing(DiaSemana::getNombre));
        vista.imprimirMensaje("La lista de días ha sido ordenada alfabéticamente.");
    }
    
    // Un método para vaciar la lista
    public void vaciarLista() {
        dias.clear();
        vista.imprimirMensaje("La lista de días ha sido vaciada.");
    }
    
    public void mostrarTodosLosDias() {
        vista.imprimirTodosLosDias(dias);
    }
}