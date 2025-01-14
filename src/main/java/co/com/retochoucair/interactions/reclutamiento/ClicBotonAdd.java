package co.com.retochoucair.interactions.reclutamiento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicBotonAdd implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_ADD));
    }

    public static ClicBotonAdd clic() {
        return Tasks.instrumented(ClicBotonAdd.class);
    }
}
