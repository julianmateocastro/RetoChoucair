package co.com.retochoucair.models;

public class TablaUsuarios {

    private String nombreUsuario;
    private String contrasenna;

    public TablaUsuarios(String nombreUsuario, String contrasenna){
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
}
