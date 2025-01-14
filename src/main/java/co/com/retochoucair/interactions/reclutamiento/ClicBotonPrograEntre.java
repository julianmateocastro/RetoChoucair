package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.userinterface.ContenedorReclutamiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicBotonPrograEntre implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PROGRAMAR_ENTREVISTA)
        );
    }

    public static ClicBotonPrograEntre clic(){
        return Tasks.instrumented(ClicBotonPrograEntre.class);
    }
}
