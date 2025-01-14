package co.com.retochoucair.models;

public class TablaCandidatos {
    private String primerNombre;
    private String segundoNombre;
    private String apellido;

    private String vacante;

    private String correo;

    private String numeroContacto;
    private String palabrasClave;

    private String fechaAplicacion;

    private String notas;

    private String casillaVerificacion;

    private String archivo;

    private String status;

    public TablaCandidatos(String primerNombre, String segundoNombre, String apellido, String vacante, String correo, String numeroContacto, String palabrasClave, String fechaAplicacion, String notas, String casillaVerificacion, String archivo, String status){
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.vacante = vacante;
        this.correo = correo;
        this.numeroContacto = numeroContacto;
        this.palabrasClave = palabrasClave;
        this.fechaAplicacion = fechaAplicacion;
        this.notas = notas;
        this.casillaVerificacion= casillaVerificacion;
        this.archivo = archivo;
        this.status = status;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getVacante() {
        return vacante;
    }

    public void setVacante(String vacante) {
        this.vacante = vacante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getCasillaVerificacion() {
        return casillaVerificacion;
    }

    public void setCasillaVerificacion(String casillaVerificacion) {
        this.casillaVerificacion = casillaVerificacion;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
