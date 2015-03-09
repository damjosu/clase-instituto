
/**
 * Write a description of class Alumno here.
 * 
 * @author (josu) 
 * @version (09/03/2015)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private int numeroClase;
    private int notas[];
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;    
        notas = new int[0];
    }

    public void addNota(int nota) {
        int temp[] = new int[notas.length + 1];
        int i;
        for(i = 0; i < notas.length; i++) {
            temp[i] = notas[i];
        }
        temp[i] = nota;
        notas = temp;
    }
         
    public int media() {
        
    }

}