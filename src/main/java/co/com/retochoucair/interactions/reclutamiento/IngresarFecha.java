package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import co.com.retochoucair.userinterface.ContenedorReclutamiento;
import co.com.retochoucair.utils.FechaAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class IngresarFecha implements Interaction {
    
    private TablaCandidatos tablaCandidatos;
    
    public IngresarFecha(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaCandidatos.getFechaAplicacion().contains("aleatorio")){
            FechaAleatoria fechaAleatoria = new FechaAleatoria();
            String fecha = fechaAleatoria.generarFecha();
            actor.attemptsTo(
                    Click.on(CAMPO_FECHA_APLICACION),
                    Click.on(BOTON_BORRAR),
                    Enter.theValue(fecha).into(CAMPO_FECHA_APLICACION));
            actor.remember("FechaAplicacion", fecha);
        }else{
            actor.attemptsTo(
                    Click.on(CAMPO_FECHA_APLICACION),
                    Click.on(BOTON_BORRAR),
                    Enter.theValue(tablaCandidatos.getFechaAplicacion()).into(CAMPO_FECHA_APLICACION));
            actor.remember("FechaAplicacion", tablaCandidatos.getFechaAplicacion());

        }

    }
    
    public static IngresarFecha enElCampoFecha(TablaCandidatos tablaCandidatos){
        return Tasks.instrumented(IngresarFecha.class,tablaCandidatos);
    }
}

