package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.userinterface.ContenedorReclutamiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicEntrevistaAprobada implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_ENTREVISTA_APROBADA));
    }

    public static ClicEntrevistaAprobada clic() {
        return Tasks.instrumented(ClicEntrevistaAprobada.class);
    }
}
