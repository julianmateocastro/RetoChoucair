package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class IngresarPalabrasClave implements Interaction {
    private TablaCandidatos tablaCandidatos;

    public IngresarPalabrasClave(TablaCandidatos tablaCandidatos) {
        this.tablaCandidatos = tablaCandidatos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (tablaCandidatos.getPalabrasClave().contains("aleatorio")) {
            actor.attemptsTo(
                    Enter.theValue(Faker.instance().lorem().word()).into(CAMPO_PALABRAS_CLAVE)
            );
        }else{
            actor.attemptsTo(
                    Enter.theValue(tablaCandidatos.getPalabrasClave()).into(CAMPO_PALABRAS_CLAVE)
            );

        }

    }

    public static IngresarPalabrasClave enElCampoPalabrasClave(TablaCandidatos tablaCandidatos) {
        return Tasks.instrumented(IngresarPalabrasClave.class,tablaCandidatos );
    }
}
