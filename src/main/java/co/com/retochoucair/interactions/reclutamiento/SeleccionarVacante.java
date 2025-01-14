package co.com.retochoucair.interactions.reclutamiento;


import co.com.retochoucair.models.TablaCandidatos;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class SeleccionarVacante implements Interaction {

    private TablaCandidatos tablaCandidatos;

    public SeleccionarVacante(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaCandidatos.getVacante().equals("aleatorio")) {
            actor.attemptsTo(
                    Click.on(SELECIONABLE_VANCANTE));
            int cantidadRegistros = CANTIDAD_REGISTROS_VACANTE.resolveAllFor(actor).size();
            actor.attemptsTo(
                    Click.on(OPCION_VACANTE_POSICION.of(String.valueOf(Faker.instance().number().numberBetween(1, cantidadRegistros)))));

        }else{
            actor.attemptsTo(
                    Click.on(SELECIONABLE_VANCANTE),
                    Click.on(OPCION_VACANTE_TEXTO.of(tablaCandidatos.getVacante()))
            );
        }
        String seleccionVacante = SELECIONABLE_VANCANTE.resolveFor(actor).getText();
        actor.remember("Vacante", seleccionVacante);

    }

    public static SeleccionarVacante enElSeleccionableVacante(TablaCandidatos tablaCandidatos){
        return Tasks.instrumented(SeleccionarVacante.class, tablaCandidatos);
    }
}
