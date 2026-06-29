package structures.models;

public class contacto {
    private String nombre;
    private String telefono;

    public contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}