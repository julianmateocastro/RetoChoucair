package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.userinterface.ContenedorReclutamiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicOfrecerTrabajo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_OFRECER_TRABAJO));
    }

    public static ClicOfrecerTrabajo clic() {
        return Tasks.instrumented(ClicOfrecerTrabajo.class);
    }
}
