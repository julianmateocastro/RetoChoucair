package co.com.retochoucair.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorLogin {
    public static final String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static final Target NOMBRE_USUARIO = Target.the("nombre usuario").located(By.name("username"));
    public static final Target CONTRASENA = Target.the("contraseña").located(By.name("password"));

    public static final Target BOTON_LOGIN = Target.the("Botón login").locatedBy("//button[@type='submit']");


}
