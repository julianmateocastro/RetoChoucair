package co.com.retochoucair.interactions.programarentrevista;

import co.com.retochoucair.models.TablaEntrevista;
import co.com.retochoucair.userinterface.ContenedorProgramarEntrevista;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static co.com.retochoucair.userinterface.ContenedorProgramarEntrevista.*;

public class IngresarHora implements Interaction {
    private TablaEntrevista tablaEntrevista;

    public IngresarHora(TablaEntrevista tablaEntrevista){
        this.tablaEntrevista = tablaEntrevista;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        if(tablaEntrevista.getHora().equals("aleatorio") && tablaEntrevista.getMinuto().equals("aleatorio") ) {
            int randomMonth = Faker.instance().number().numberBetween(1, 12);
            String formattedMonth = String.format("%02d", randomMonth);
            int randomIndex = Faker.instance().number().numberBetween(0, 5);
            int randomMultipleOf15 = randomIndex * 15;
            String formattedNumber = String.format("%02d", randomMultipleOf15);
            actor.attemptsTo(
                    Click.on(CAMPO_TIEMPO),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_HORA),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_HORA),
                    Enter.theValue(formattedMonth).into(CAMPO_HORA),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_MINUTOS),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_MINUTOS),
                    Enter.theValue(formattedNumber).into(CAMPO_MINUTOS),
                    Click.on(CAMPO_FORMATO.of(tablaEntrevista.getFormato())));
        }else{
            actor.attemptsTo(
                    Click.on(CAMPO_TIEMPO),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_HORA),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_HORA),
                    Enter.theValue(tablaEntrevista.getHora()).into(CAMPO_HORA),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_MINUTOS),
                    SendKeys.of(Keys.BACK_SPACE).into(CAMPO_MINUTOS),
                    Enter.theValue(tablaEntrevista.getMinuto()).into(CAMPO_MINUTOS),
                    Click.on(CAMPO_FORMATO.of(tablaEntrevista.getFormato())));
        }

    }


    public static IngresarHora enElCampo(TablaEntrevista tablaEntrevista){
        return Tasks.instrumented(IngresarHora.class ,tablaEntrevista);
    }
}
