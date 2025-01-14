package co.com.retochoucair.interactions.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class ClicCasillaConsentimiento implements Interaction{

    private TablaCandidatos tablaCandidatos;

    public ClicCasillaConsentimiento(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        if(tablaCandidatos.getCasillaVerificacion().equals("true")){
            actor.attemptsTo(
                Click.on(CASILLA_CONSENTIMIENTO)
            );}

    }
    public static ClicCasillaConsentimiento clic(TablaCandidatos tablaCandidatos) {
        return Tasks.instrumented(ClicCasillaConsentimiento.class, tablaCandidatos);
    }


}
