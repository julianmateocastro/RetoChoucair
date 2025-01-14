package co.com.retochoucair.interactions.reclutamiento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicBotonContratado implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_CONTRATADO));
    }

    public static ClicBotonContratado clic() {
        return Tasks.instrumented(ClicBotonContratado.class);
    }
}
