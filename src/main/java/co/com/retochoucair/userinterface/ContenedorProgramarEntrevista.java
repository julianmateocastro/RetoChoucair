package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorProgramarEntrevista {


    public static final Target CAMPO_GERENTE_CONTRATACION = Target.the("Gerente contratación").locatedBy("//label[text()='Hiring Manager']/ancestor::div[@class='oxd-input-group']//p");
    public static final Target DATO_ESTADO = Target.the("Dato estado").locatedBy("//p[contains(@class, 'oxd-text--subtitle-2')]");



    public static final Target CAMPO_TITULO_ENTREVISTA = Target.the("Titulo entrevista").locatedBy("//label[text()='Interview Title']/following::input[1]");


    public static final Target CAMPO_ENTREVISTADOR = Target.the("Entrevistador").locatedBy("//input[@include-employees=\"onlyCurrent\"]");


    public static final Target PRIMER_VALOR_CAMPO_ENTREVISTADOR = Target.the("Primer valor campo entrevistador").locatedBy("//div[contains(@class, 'oxd-autocomplete-option')][1]");



    public static final Target INGRESAR_FECHA = Target.the("Fecha").locatedBy(" //input[@placeholder='yyyy-dd-mm']");

    public static final Target CAMPO_TIEMPO = Target.the("Tiempo").locatedBy("//input[@placeholder='hh:mm']");

    public static final Target CAMPO_HORA = Target.the("Hora").locatedBy("(//div[@role='alert']/div/input)[1]");

    public static final Target CAMPO_MINUTOS = Target.the("Minutos").locatedBy("(//div[@role='alert']/div/input)[2]");
    public static final Target CAMPO_FORMATO = Target.the("Formato").locatedBy("//div/div/input[@name='{0}']");

    public static final Target OPCION_ENTREVISTADOR = Target.the("Seleccionable entrevistador ").locatedBy("//div[contains(@class, 'oxd-autocomplete-option')]//span[contains(text(), '{0}')]");



}
