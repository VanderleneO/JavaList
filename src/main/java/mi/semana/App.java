package mi.semana;

import mi.semana.controller.ControladorSemana;
import mi.semana.view.VistaSemana;
import mi.semana.model.DiaSemana; 

public class App {
    public static void main(String[] args) {
        VistaSemana vista = new VistaSemana();
        ControladorSemana controlador = new ControladorSemana(vista);
        
        // --- Probar todos los métodos ---
        
        // 1. Mostrar la lista inicial
        controlador.mostrarTodosLosDias();
        
        // 2. Obtener y mostrar el largo de la lista
        vista.imprimirMensaje("El largo de la lista es: " + controlador.getLargoDeLaLista());
        
        // 3. Eliminar un día
        controlador.eliminarDia("Martes");
        controlador.mostrarTodosLosDias();
        
        // 4. Buscar y mostrar un día específico
        DiaSemana diaEncontrado = controlador.getDiaSolicitado("Jueves");
        if (diaEncontrado != null) {
            vista.imprimirMensaje("Se encontró el día solicitado:");
            vista.imprimirDetalleDia(diaEncontrado);
        } else {
            vista.imprimirMensajeError("No se encontró el día.");
        }
        
        // 5. Verificar si un día existe
        vista.imprimirMensaje("¿Existe 'Viernes' en la lista? " + controlador.existeDia("Viernes"));
        vista.imprimirMensaje("¿Existe 'Martes' en la lista? " + controlador.existeDia("Martes"));
        
        // 6. Ordenar la lista alfabéticamente
        controlador.ordenarPorAlfabeto();
        controlador.mostrarTodosLosDias();
        
        // 7. Vaciar la lista
        controlador.vaciarLista();

        controlador.mostrarTodosLosDias();
    }
}
