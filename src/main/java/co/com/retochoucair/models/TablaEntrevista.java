package co.com.retochoucair.models;

public class TablaEntrevista {
    private String tituloEntrevista;
    private String entrevistador;

    private String fechaEntrevista;
    private String hora;

    private String minuto;

    private String formato;

    public TablaEntrevista(String tituloEntrevista, String entrevistador, String fechaEntrevista, String hora, String minuto, String formato) {
        this.tituloEntrevista = tituloEntrevista;
        this.entrevistador = entrevistador;
        this.fechaEntrevista = fechaEntrevista;
        this.hora = hora;
        this.minuto = minuto;
        this.formato = formato;
    }

    public String getTituloEntrevista() {
        return tituloEntrevista;
    }

    public void setTituloEntrevista(String tituloEntrevista) {
        this.tituloEntrevista = tituloEntrevista;
    }

    public String getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(String entrevistador) {
        this.entrevistador = entrevistador;
    }

    public String getFechaEntrevista() {
        return fechaEntrevista;
    }

    public void setFechaEntrevista(String fechaEntrevista) {
        this.fechaEntrevista = fechaEntrevista;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
