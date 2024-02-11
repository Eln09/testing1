package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MethodBasic {

    public WebDriver driver;

    public MethodBasic(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Webelem(By by){
        WebElement a= driver.findElement(by);
        return a;
    }
    public List<WebElement> WebelemList(By by){
        List<WebElement> a= driver.findElements(by);
        return a;
    }

    public boolean is_elem_present(WebElement a) {
        boolean flag = false;

        try {
            if (a.isDisplayed()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    public void clicking(WebElement a) {

        try {
            if (a.isDisplayed()) {
                a.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
