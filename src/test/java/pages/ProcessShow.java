package pages;

import org.openqa.selenium.By;
import support.DriverQA;

public class ProcessShow extends BasePage {

    public ProcessShow(DriverQA stepsDriver) {
        super(stepsDriver);
    }

    public String getNotice() {
        return driver.getText("notice");
    }

    public String getCode() {
        return driver.getText("codigo");
    }

    public Boolean getGridCode(String code) {
        String idDelete = "btn-delete_" + code;
        return driver.getDriver().findElement(By.id(idDelete)) == null;
    }
}
