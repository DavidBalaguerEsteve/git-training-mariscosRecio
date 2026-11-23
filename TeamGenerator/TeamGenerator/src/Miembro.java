import java.util.ArrayList;
import java.util.List;

public class Miembro {

    private String nombre;
    private String rol;
    private List<String> tecnologias;

    public Miembro(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
        this.tecnologias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void agregarTecnologia(String tecnologia) {
        tecnologias.add(tecnologia);
    }

    @Override
    public String toString() {
        return nombre + " (" + rol + ")";
    }
}