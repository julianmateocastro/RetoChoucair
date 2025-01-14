package co.com.retochoucair.interactions.reclutamiento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.BOTON_GUARDAR;

public class ClicBotonGuardar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_GUARDAR));
    }

    public static ClicBotonGuardar clic() {
        return Tasks.instrumented(ClicBotonGuardar.class);
    }
}
