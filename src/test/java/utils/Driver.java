package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {

    /**
     * Get Chrome Driver
     * @return
     */
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
        WebDriver wd = new ChromeDriver();
        // Implicit Wait
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return wd;
    }

    /**
     * Given a WebElement (we) wait for the element to be clickable
     * @param we
     */
    public void explicitWait(WebElement we) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(we));
    }

    /**
     * Return current browser dimensions
     * @return
     */
    public String getSize () {
        Dimension size = getDriver().manage().window().getSize();
        int h = size.getHeight();
        int w = size.getWidth();
        return "Browser dimensions are " + h + "," + w;
    }

    /**
     * Resize browser to given dimensions
     * @param width
     * @param height
     */
    public void setSize (int width, int height) {
        Dimension d = new Dimension(width, height);
        getDriver().manage().window().setSize(d);
    }

    /**
     * Forward to the next visited page in the Browser
     */
    public void forwardBrowser() {
        getDriver().navigate().forward();
    }

    /**
     * Refresh page
     */
    public void refreshBrowser() {
        getDriver().navigate().refresh();
    }

    /**
     * Move back to the last visited page in the Browser
     */
    public void backBrowser() {
        getDriver().navigate().back();
    }

    /**
     * Return the current page title
     * @return
     */
    public String getTitlePage() {
        String PageTitle = getDriver().getTitle();
        return PageTitle;
    }

    /**
     * Maximize current browser instance
     */
    public void maximizeBrowser() {
        getDriver().manage().window().maximize();
    }

    /**
     * Given a Web Element press Enter when that element is focused
     * @param we
     */
    public void sendEnter(WebElement we) {
        we.sendKeys(Keys.ENTER);
    }

    /**
     * Get a particular cookie content based on the cookie name
     * @param cookieName
     * @return
     */
    public Cookie getCookies(String cookieName) {
        return getDriver().manage().getCookieNamed(cookieName);
    }

    /**
     * Switch to different window handle (works only for 2 window handles)
     */
    public void switchHandle() {
        String currentHandle = getDriver().getWindowHandle();
        for (String windowHandle : getDriver().getWindowHandles()) {
            if (!currentHandle.contentEquals(windowHandle)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
    }
}
