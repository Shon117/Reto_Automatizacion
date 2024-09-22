package demo.orange.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ScheduleInterviewPage {
    public static final Target TXT_INTERVIEW_TITLE = Target.the("Ingresa el titulo de la entrevista").located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]"));
    public static final Target TXT_INTERVIEWER = Target.the("Ingresa el entrevistador").located(By.xpath("//input[@placeholder='Type for hints...']"));
    public static final Target OPT_INTERVIEWER = Target.the("Selecciona el entrevistador").located(By.xpath("//div[@class='oxd-autocomplete-dropdown --positon-bottom']"));
    public static final Target TXT_FECHA = Target.the("Ingresar la fecha").located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
    public static final Target BTN_SAVE = Target.the("Click en save").located(By.xpath("//button[@type='submit']"));

}
