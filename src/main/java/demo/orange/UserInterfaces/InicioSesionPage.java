package demo.orange.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class InicioSesionPage {

    public static final Target TXT_USUARIO = Target.the("Ingresa el usuario").located(By.name("username"));
    public static final Target TXT_CONTRASENA = Target.the("ingresa la contrsena").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Click en boton login").located(By.xpath("//button[@type='submit']"));
}
