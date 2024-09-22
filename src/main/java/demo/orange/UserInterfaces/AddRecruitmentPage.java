package demo.orange.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class AddRecruitmentPage {

    public static final Target TXT_FIRSTNAME = Target.the("Ingresa el primer nombre").located(By.name("firstName"));
    public static final Target TXT_MIDDLENAME = Target.the("Ingresa el segundo nombre").located(By.name("middleName"));
    public static final Target TXT_LASTNAME = Target.the("Ingresa el apellido").located(By.name("lastName"));
    public static final Target LST_VACANCY = Target.the("Ingrese la vacante").located(By.xpath("//div[@class='oxd-select-text-input']"));
    public static final Target OPT_VACANCY = Target.the("Selecciona la opcion").located(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public static final Target TXT_EMAIL = Target.the("Ingresa el email").located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
    public static final Target BTN_SAVE = Target.the("Click den el boton save").located(By.xpath("//button[@type='submit']"));

}
