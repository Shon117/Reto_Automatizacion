package demo.orange.UserInterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class RecruitmentPage {

    public static final Target BTN_ADD = Target.the("Click en boton add").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    public static final Target BTN_SHORTLIST = Target.the("Click en boton shortlist").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target BTN_SCHEDULE_INTERVIEW =  Target.the("Click en boton SCHEDULE INTERVIEW").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target BTN_MARK_INTERVIEW_PASSED = Target.the("click en el boton mark interview passed").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target BTN_OFFER_JOB = Target.the("click en el boton offer job").located(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--success'])[2]"));
    public static final Target BTN_HIRE = Target.the("click en boton hire").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target LBL_DESCRIPTION = Target.the("El usuario ve la informacion").located(By.xpath("//p[text()='Status: Hired']"));
}
