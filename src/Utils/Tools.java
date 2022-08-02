package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void compareToList(List<String>menuExpectedList,List<WebElement>menuActualList){

        for (int i = 0; i < menuExpectedList.size(); i++)
            Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText());
    }

public static void successMessageValidation(){
    WebElement message= GenelWebDriver.driver.findElement(By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']"));
    Assert.assertTrue(message.isDisplayed());
    }
}
