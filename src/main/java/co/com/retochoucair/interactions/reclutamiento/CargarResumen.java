package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

import java.io.File;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class CargarResumen implements Interaction {

    private TablaCandidatos tablaCandidatos ;

    public CargarResumen(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String ruta = rutaArchivos+"\\"+tablaCandidatos.getArchivo();
        Target campo = SUBIR_ARCHIVO;
        File file = new File(ruta);
        campo.resolveFor(actor).sendKeys(file.getAbsolutePath());
    }

    public static CargarResumen enLaPagina(TablaCandidatos tablaCandidatos) {
        return Tasks.instrumented(CargarResumen.class,tablaCandidatos);
    }
}
