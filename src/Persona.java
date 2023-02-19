public class Persona {

    private Integer cedula;
    private String nombre;
    private Boolean discapacidad;

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public Persona(Integer cedula, String nombre, Boolean discapacidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.discapacidad = discapacidad;
    }
}
