package structures.collections_set;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Sets {
    
    // El set principal que utilizará tu clase
    private Set<String> coleccion;

    public Sets() {
        this.coleccion = new HashSet<>();
    }

    // Método para agregar un elemento al set
    public void agregarElemento(String elemento) {
        coleccion.add(elemento);
    }

    // Método para eliminar un elemento
    public void eliminarElemento(String elemento) {
        coleccion.remove(elemento);
    }

    // Método para verificar si un elemento existe
    public boolean contiene(String elemento) {
        return coleccion.contains(elemento);
    }

    // Método para mostrar todos los elementos
    public void mostrarElementos() {
        Iterator<String> it = coleccion.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Método para obtener el tamaño del set
    public int obtenerTamano() {
        return coleccion.size();
    }
}