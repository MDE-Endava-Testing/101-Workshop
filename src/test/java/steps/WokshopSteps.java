package steps;

import cucumber.annotation.en.*;
import elements.ColombiaPage;
import elements.Homepage;
import cucumber.annotation.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class WokshopSteps {

    protected WebDriver wd = Driver.getDriver();

    @Given("the user visits the El Tiempo website")
    public void the_user_visits_the_El_Tiempo_website() {
        wd.get("https://www.eltiempo.com");
    }

    @When("the user clicks on the Colombia option")
    public void the_user_clicks_on_the_Colombia_option() {
        Homepage hp = new Homepage(wd);
        hp.clickColombia();
    }

    @Then("the Colombia page should load")
    public void the_Colombia_page_should_load() {
        ColombiaPage col = new ColombiaPage(wd);
        Assert.assertEquals("COLOMBIA",col.getColombiaMenu().getText());
    }

    @After
    public void afterScenario() {
        wd.quit();
    }
}
