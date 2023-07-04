package utility;

import basetest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * This method is use to click on any element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
        //driver.findElement(by).click(); use always use this 1 line code to avoid repetitive line.
    }

    /**
     * This method is use to send value on any element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method is used to get text from any element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method is used to get attributive of value @ return
     */
    public String getAttributeValueFromElement(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    /**
     * This method is used to verify to element with first text and second text String Type
     */
    public void verifyTwoTextMessage(String firstText, String secondText) {
        Assert.assertEquals(firstText, secondText);
    }

    /**
     * This method is used to verify to element first text and second text Int Type
     */
    public void verifyTwoTextMessage(int firstText, int secondText) {

        Assert.assertEquals(firstText, secondText);
    }

    /**
     * This method is used to  select value from drop down by text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByVisibleText(text);
    }

    /**
     * This method is used to  select radio button
     */
    public void selectRadioButton(By by) {
        driver.findElement(by).click();
    }

    /**
     * This method is used to select CheckBox
     */
    public void selectCheckBox(By by) {
        WebElement checkBox = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBox);
        actions.perform();
        if (checkBox.isSelected()) {
        } else {
            checkBox.click();
        }
    }

    /**
     * This method is used to mouseHover and click by InterruptedException
     */

    /**
     * This method is used to mouseHover by interruptedException
     */

    public void verifyTextElement(String Text, By by) {
        String expectedText = Text;
        String actualText = getTextFromElement(by);
        Assert.assertEquals(actualText, expectedText);
    }

    public void mouseHoverAndClickOnElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    public void mouseHoverOnElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
}