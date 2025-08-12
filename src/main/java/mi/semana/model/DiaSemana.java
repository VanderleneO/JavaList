package mi.semana.model;

public class DiaSemana { 
    private String nombre;
    private int numero;

    public DiaSemana(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
}
