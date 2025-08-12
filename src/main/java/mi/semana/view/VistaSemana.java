package mi.semana.view;

import java.util.List;

import mi.semana.model.DiaSemana; // Importamos la interfaz List

public class VistaSemana {
    
    public void imprimirDetalleDia(DiaSemana dia) {
        System.out.println("--- Información del Día ---");
        System.out.println("Nombre: " + dia.getNombre());
        System.out.println("Número: " + dia.getNumero());
        System.out.println("---------------------------");
    }

    // El método ahora recibe una List en lugar de un ArrayList
    public void imprimirTodosLosDias(List<DiaSemana> dias) {
        System.out.println("--- Todos los Días de la Semana ---");
        for (DiaSemana dia : dias) {
            System.out.println("Día " + dia.getNumero() + ": " + dia.getNombre());
        }
        System.out.println("-----------------------------------");
    }

    public void imprimirMensajeError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }
    
    public void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
