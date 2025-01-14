package co.com.retochoucair.models;

public class TablaFiltrosBusqueda {

    private String tituloTrabajo;

    private String vacante;

    private String gerenteContratacion;


    private String estado;


    private String nombreCandidato;

    private String palabrasClave;

    private String fechaAplicacionDesde;

    private String fechaAplicacionHasta;

    private String metodoAplicacion;

    public TablaFiltrosBusqueda(String tituloTrabajo, String vacante, String gerenteContratacion, String estado, String nombreCandidato, String palabrasClave, String fechaAplicacionDesde, String fechaAplicacionHasta, String metodoAplicacion) {
        this.tituloTrabajo = tituloTrabajo;
        this.vacante = vacante;
        this.gerenteContratacion = gerenteContratacion;
        this.estado = estado;
        this.nombreCandidato = nombreCandidato;
        this.palabrasClave = palabrasClave;
        this.fechaAplicacionDesde = fechaAplicacionDesde;
        this.fechaAplicacionHasta = fechaAplicacionHasta;
        this.metodoAplicacion = metodoAplicacion;
    }


    public String getTituloTrabajo() {
        return tituloTrabajo;
    }

    public void setTituloTrabajo(String tituloTrabajo) {
        this.tituloTrabajo = tituloTrabajo;
    }

    public String getVacante() {
        return vacante;
    }

    public void setVacante(String vacante) {
        this.vacante = vacante;
    }

    public String getGerenteContratacion() {
        return gerenteContratacion;
    }

    public void setGerenteContratacion(String gerenteContratacion) {
        this.gerenteContratacion = gerenteContratacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getFechaAplicacionDesde() {
        return fechaAplicacionDesde;
    }

    public void setFechaAplicacionDesde(String fechaAplicacionDesde) {
        this.fechaAplicacionDesde = fechaAplicacionDesde;
    }

    public String getFechaAplicacionHasta() {
        return fechaAplicacionHasta;
    }

    public void setFechaAplicacionHasta(String fechaAplicacionHasta) {
        this.fechaAplicacionHasta = fechaAplicacionHasta;
    }

    public String getMetodoAplicacion() {
        return metodoAplicacion;
    }

    public void setMetodoAplicacion(String metodoAplicacion) {
        this.metodoAplicacion = metodoAplicacion;
    }
}
