package demo.orange.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class PaginaPrincipalPage {

    public static final Target BNT_RECRUITMENT = Target.the("click sobre recruitment").located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));
}
