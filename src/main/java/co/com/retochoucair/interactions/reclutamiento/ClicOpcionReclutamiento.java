package co.com.retochoucair.interactions.reclutamiento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicOpcionReclutamiento implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPCION_RECLUTAMIENTO));
    }

    public static ClicOpcionReclutamiento clic() {
        return Tasks.instrumented(ClicOpcionReclutamiento.class);
    }
}
