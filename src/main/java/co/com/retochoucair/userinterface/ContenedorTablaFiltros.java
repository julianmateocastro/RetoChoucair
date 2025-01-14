package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ContenedorTablaFiltros {

    public static final Target CAMPO_BUSQUEDA_CANDIDATO = Target.the("Campo busqueda candidato").locatedBy("//input[@placeholder='Type for hints...']");

    public static final Target OPCION_CANDIDATO = Target.the("Seleccionable candidato ").locatedBy("//div[contains(@class, 'oxd-autocomplete-option')]//span[contains(text(), '{0}')]");

    public static final Target BOTON_BUSCAR = Target.the("Boton buscar").locatedBy("//button[@type='submit']");

}
