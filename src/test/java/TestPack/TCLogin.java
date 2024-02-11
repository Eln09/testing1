package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TCLogin {
    WebDriver driver=null;

    @Parameters("url")
    @BeforeClass
    public void launchBrowser(String url){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void doDevlabsHoverMenuValid() throws Exception{
        WebElement ele = null;
        Actions action = new Actions(driver);
        ele = driver.findElement(By.xpath("//button[text()='Log in']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLabs login button is present");
            ele.click();
            Thread.sleep(3000);
        }
    }

}
