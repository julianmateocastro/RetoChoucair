package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.userinterface.ContenedorProgramarEntrevista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retochoucair.userinterface.ContenedorProgramarEntrevista.*;

public class ObtenerGerenteYEstado implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_GERENTE_CONTRATACION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
        actor.remember("GerenteContratacion", CAMPO_GERENTE_CONTRATACION.resolveFor(actor).getText());
        actor.remember("EstadoContratacion", DATO_ESTADO.resolveFor(actor).getText());
    }

    public static ObtenerGerenteYEstado obtener(){
        return Tasks.instrumented(ObtenerGerenteYEstado.class);
    }
}
