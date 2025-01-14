package co.com.retochoucair.interactions.filtrobsuquedacandidato;

import co.com.retochoucair.userinterface.ContenedorTablaFiltros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorTablaFiltros.*;

public class ClicBotonBusqueda implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_BUSCAR));
    }

    public static ClicBotonBusqueda clic() {
        return Tasks.instrumented(ClicBotonBusqueda.class);
    }
}

