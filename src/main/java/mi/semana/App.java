package mi.semana;

public class App {

    public static void main(String[] args) {
       
        System.out.println("--- Creando lista de días de la semana ---");
        DiasSemana diasSemana = new DiasSemana();

        
        diasSemana.crearListaDeDias();
        System.out.println("Lista inicial: " + diasSemana.getDiasDeLaSemana());
        
        //  Obtener el tamaño de la lista
        System.out.println("\n--- Obteniendo el largo de la lista ---");
        System.out.println("El largo de la lista es: " + diasSemana.getLargoDeLaLista());

       
        System.out.println("\n--- Obteniendo un día por su índice ---");
        System.out.println("El día en el índice 0 es: " + diasSemana.getDiaPorIndice(0));
        System.out.println("El día en el índice 6 es: " + diasSemana.getDiaPorIndice(6));

        System.out.println("\n--- Verificando si un día existe ---");
        System.out.println("¿Existe 'Lunes'?: " + diasSemana.existeDia("Lunes"));
        System.out.println("¿Existe 'Festivo'?: " + diasSemana.existeDia("Festivo"));

        System.out.println("\n--- Eliminando un día de la lista ---");
        System.out.println("Se eliminó 'Miércoles': " + diasSemana.eliminarDia("Miércoles"));
        System.out.println("Lista después de la eliminación: " + diasSemana.getDiasDeLaSemana());

      
        System.out.println("\n--- Ordenando la lista alfabéticamente ---");
        diasSemana.ordenarListaAlfabeticamente();
        System.out.println("Lista ordenada: " + diasSemana.getDiasDeLaSemana());

     
        System.out.println("\n--- Vaciando la lista ---");
        diasSemana.vaciarLista();
        System.out.println("Lista después de vaciarla: " + diasSemana.getDiasDeLaSemana());
    }
}
