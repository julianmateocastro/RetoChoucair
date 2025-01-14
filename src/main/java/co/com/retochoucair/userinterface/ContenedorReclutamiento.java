package co.com.retochoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorReclutamiento {

    public static final Target OPCION_RECLUTAMIENTO = Target.the("Opción reclutamiento").locatedBy("//li/a/span[normalize-space()='Recruitment']");
    public static final Target BOTON_ADD = Target.the("Botón add").locatedBy("//button[normalize-space()='Add']");

    public static final Target CAMPO_PRIMER_NOMBRE = Target.the("primer nombre").located(By.name("firstName"));

    public static final Target CAMPO_SEGUNDO_NOMBRE = Target.the("segundo nombre").located(By.name("middleName"));

    public static final Target CAMPO_APELLIDO = Target.the("apellido").located(By.name("lastName"));

    public static final Target SELECIONABLE_VANCANTE = Target.the("Seleccionable vacante ").locatedBy("//div[@class='oxd-select-wrapper']");

    public static final Target CANTIDAD_REGISTROS_VACANTE = Target.the("Cantidad de registros vacante ").locatedBy("//div[@role=\"listbox\"]/div");

    public static final Target OPCION_VACANTE_POSICION = Target.the("Seleccionable vacante ").locatedBy("//div[@role=\"listbox\"]/div[{0}]");
    public static final Target OPCION_VACANTE_TEXTO = Target.the("Seleccionable vacante ").locatedBy("//div[@role=\"listbox\"]/div/span[contains(text(),'{0}')]");

    public static final Target CAMPO_CORREO = Target.the("Correo").locatedBy("//label[text()='Email']/following::input[1]");

    public static final Target CAMPO_NUMERO_CONTACTO = Target.the("Numero contacto").locatedBy("//label[text()='Contact Number']/following::input[1]");
    public static final Target CAMPO_PALABRAS_CLAVE = Target.the("RESUMEN").locatedBy("//label[text()='Keywords']/following::input[1]");

    public static final Target CAMPO_FECHA_APLICACION = Target.the("Palabras clave").locatedBy("//input[@placeholder='yyyy-dd-mm']");

    public static final Target BOTON_BORRAR = Target.the("Botón borrar").locatedBy("//div[@class='oxd-date-input-link --clear']");

    public static final Target CAMPO_NOTAS = Target.the("Notas").locatedBy("//textarea[@placeholder='Type here']");

    public static final Target CASILLA_CONSENTIMIENTO = Target.the("Casilla consetimiento").locatedBy("//input[@type='checkbox']/following-sibling::span");

    public static final Target BOTON_GUARDAR = Target.the("Botón guardar").locatedBy("//button[@type='submit']");
    public static final String rutaArchivos = "src\\main\\resources\\archivos";

    public static final Target SUBIR_ARCHIVO = Target.the("Subir archivo").locatedBy("//input[@type='file']");

    public static final Target BOTON_LISTA_CORTA = Target.the("Botón lista corta").locatedBy("//button[normalize-space()='Shortlist']");

    public static final Target BOTON_PROGRAMAR_ENTREVISTA = Target.the("Botón programar entrevista").locatedBy("//button[normalize-space()='Schedule Interview']");

    public static final Target BOTON_ENTREVISTA_APROBADA = Target.the("Entrevista aprobada").locatedBy("//button[normalize-space()='Mark Interview Passed']");
    public static final Target BOTON_OFRECER_TRABAJO = Target.the("Ofrecer trabajo").locatedBy("//button[normalize-space()='Offer Job']");

    public static final Target BOTON_CONTRATADO = Target.the("Hire").locatedBy("//button[normalize-space()='Hire']");


}

