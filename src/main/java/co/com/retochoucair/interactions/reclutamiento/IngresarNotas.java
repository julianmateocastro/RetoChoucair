package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class IngresarNotas implements Interaction{

    private TablaCandidatos tablaCandidatos;

    public IngresarNotas(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaCandidatos.getNotas().equals("aleatorio")){
            actor.attemptsTo(
                    Enter.theValue(Faker.instance().lorem().sentence()).into(CAMPO_NOTAS)
            );}else {
            actor.attemptsTo(
                    Enter.theValue(tablaCandidatos.getNotas()).into(CAMPO_NOTAS)
            );
        }


    }

    public static IngresarNotas enElCampoNotas(TablaCandidatos tablaCandidatos){
        return Tasks.instrumented(IngresarNotas.class, tablaCandidatos);
    }
}
