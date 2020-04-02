package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "colombia")
    WebElement colombiaOption;

    public void clickColombia() {
        colombiaOption.click();
    }
}
