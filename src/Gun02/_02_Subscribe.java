package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Subscribe extends GenelWebDriver {
    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
  3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */
    By link=By.cssSelector("[id='content']  :nth-child(8) a");
    By yesBtn=By.cssSelector("[type='radio'][value='1']");
    By noBtn=By.cssSelector("[type='radio'][value='0']");
    By ctn=By.cssSelector("[class='btn btn-primary']");

    @Test (priority = 1)
    void subscribe(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement yes= driver.findElement(yesBtn);
        yes.click();
        WebElement contin=driver.findElement(ctn);
        contin.click();
        Tools.successMessageValidation();
    }
    @Test (priority = 2)
    void unsubscribe(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement no= driver.findElement(noBtn);
        no.click();
        WebElement contin=driver.findElement(ctn);
        contin.click();
        Tools.successMessageValidation();
    }
    @Test (priority = 3)
    void subscribeControl(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement yes= driver.findElement(yesBtn);
        WebElement no= driver.findElement(noBtn);

        if (yes.isSelected())
            no.click();
        else
            yes.click();

        WebElement contin=driver.findElement(ctn);
        contin.click();
        Tools.successMessageValidation();
    }
}
