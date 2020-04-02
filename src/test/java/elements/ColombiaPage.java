package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColombiaPage {

    public ColombiaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='colombia first']")
    WebElement colombiaMenu;

    public WebElement getColombiaMenu() {
        return colombiaMenu;
    }
}
