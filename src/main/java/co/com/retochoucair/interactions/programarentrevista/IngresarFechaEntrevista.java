package co.com.retochoucair.interactions.programarentrevista;

import co.com.retochoucair.models.TablaEntrevista;
import co.com.retochoucair.userinterface.ContenedorReclutamiento;
import co.com.retochoucair.utils.FechaAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class IngresarFechaEntrevista implements Interaction {
    
    private TablaEntrevista tablaEntrevista;
    
    public IngresarFechaEntrevista(TablaEntrevista tablaEntrevista){
        this.tablaEntrevista = tablaEntrevista;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaEntrevista.getFechaEntrevista().contains("aleatorio")){
            FechaAleatoria fechaAleatoria = new FechaAleatoria();
            String fecha = fechaAleatoria.generarFecha();
            actor.attemptsTo(
                    Click.on(CAMPO_FECHA_APLICACION),
                    Click.on(BOTON_BORRAR),
                    Enter.theValue(fecha).into(CAMPO_FECHA_APLICACION));
        }else{
            actor.attemptsTo(
                    Click.on(CAMPO_FECHA_APLICACION),
                    Click.on(BOTON_BORRAR),
                    Enter.theValue(tablaEntrevista.getFechaEntrevista()).into(CAMPO_FECHA_APLICACION));
        }
    }
    
    public static IngresarFechaEntrevista enElCampoFecha(TablaEntrevista tablaEntrevista){
        return Tasks.instrumented(IngresarFechaEntrevista.class,tablaEntrevista);
    }
}

