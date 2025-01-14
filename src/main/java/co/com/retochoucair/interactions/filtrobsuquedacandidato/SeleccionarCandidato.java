package co.com.retochoucair.interactions.filtrobsuquedacandidato;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorTablaFiltros.*;

public class SeleccionarCandidato implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String candidato = actor.recall("PrimerNombre");
        actor.attemptsTo(
                Enter.theValue(candidato).into(CAMPO_BUSQUEDA_CANDIDATO),
                Click.on(OPCION_CANDIDATO.of(candidato))

        );
    }

    public static SeleccionarCandidato enElCampo(){
        return Tasks.instrumented(SeleccionarCandidato.class);
    }
}
