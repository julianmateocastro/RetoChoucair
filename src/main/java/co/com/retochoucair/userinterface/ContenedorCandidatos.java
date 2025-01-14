package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ContenedorCandidatos {

    public static final Target DATO_VACANTE = Target.the("Dato vacante").locatedBy("(//div[@role='row'])[2]/div[2]");

    public static final Target DATO_CANDIDATO = Target.the("Dato candidato").locatedBy("(//div[@role='row'])[2]/div[3]");

    public static final Target DATO_GERENTE_CONTRATO = Target.the("Dato gerente contrato").locatedBy("(//div[@role='row'])[2]/div[4]");
    public static final Target DATO_FECHA_APLICACION = Target.the("Dato fecha aplicacion").locatedBy("(//div[@role='row'])[2]/div[5]");

    public static final Target DATO_ESTADO = Target.the("Dato estado").locatedBy("(//div[@role='row'])[2]/div[6]");


}
