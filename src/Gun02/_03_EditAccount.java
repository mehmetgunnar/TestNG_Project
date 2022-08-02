package Gun02;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_EditAccount extends GenelWebDriver {
    /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

    @Test (priority = 1)
    void editFunction(){
        WebElement edit= driver.findElement(By.linkText("Edit Account"));
        edit.click();
        WebElement name= driver.findElement(By.id("input-firstname"));
        name.clear();
        name.sendKeys("mehmet");
        WebElement surname= driver.findElement(By.id("input-lastname"));
        surname.clear();
        surname.sendKeys("gunnar");
        WebElement contin= driver.findElement(By.cssSelector("[class='btn btn-primary'"));
        contin.click();
        WebElement message= driver.findElement(By.xpath("//*[text()=' Success: Your account has been successfully updated.']"));
        Assert.assertTrue(message.isDisplayed());
    }
    @Test (priority = 2)
    void editFunction2(){
        WebElement edit= driver.findElement(By.linkText("Edit Account"));
        edit.click();
        WebElement name= driver.findElement(By.id("input-firstname"));
        name.clear();
        name.sendKeys("memo");
        WebElement surname= driver.findElement(By.id("input-lastname"));
        surname.clear();
        surname.sendKeys("guno");
        WebElement contin= driver.findElement(By.cssSelector("[class='btn btn-primary'"));
        contin.click();
        WebElement message= driver.findElement(By.xpath("//*[text()=' Success: Your account has been successfully updated.']"));
        Assert.assertTrue(message.isDisplayed());
    }

}
