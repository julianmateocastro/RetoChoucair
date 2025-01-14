package co.com.retochoucair.interactions.programarentrevista;

import co.com.retochoucair.models.TablaEntrevista;
import co.com.retochoucair.userinterface.ContenedorProgramarEntrevista;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorProgramarEntrevista.*;

public class IngresarTituloEntrevista implements Interaction {

    private TablaEntrevista tablaEntrevista;

    public IngresarTituloEntrevista(TablaEntrevista tablaEntrevista){
        this.tablaEntrevista = tablaEntrevista;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(tablaEntrevista.getTituloEntrevista().equals("aleatorio")){
            actor.attemptsTo(
                    Enter.theValue(Faker.instance().lorem().word()).into(CAMPO_TITULO_ENTREVISTA));
        }else{
            actor.attemptsTo(
                    Enter.theValue(tablaEntrevista.getTituloEntrevista()).into(CAMPO_TITULO_ENTREVISTA));

        }

    }

    public static IngresarTituloEntrevista enElCampo(TablaEntrevista  tablaEntrevista){
        return Tasks.instrumented(IngresarTituloEntrevista.class, tablaEntrevista);
    }
}
