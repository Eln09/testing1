package TextPack02;

import TestPack.MethodBasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwagLabs {
    WebDriver driver=null;
    MethodBasic MB;
    PageElems PE;

    @Parameters("url")

    @BeforeClass
    public void launchBrowser(String url){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        this.MB = new MethodBasic(this.driver);
        this.PE= new PageElems();

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void saucepage() throws Exception{
        MB.Webelem(PE.username()).sendKeys("standard_user");
        MB.Webelem(PE.password()).sendKeys("secret_sauce");
        MB.clicking(MB.Webelem(PE.loginbtn()));
        Thread.sleep(3000);

        MB.clicking(MB.Webelem(PE.bike()));
        MB.clicking(MB.Webelem(PE.shirt()));
        Thread.sleep(2000);

        MB.clicking(MB.Webelem(PE.cartbtn()));
        if(MB.WebelemList(PE.shoppinglist()).size()==2){
            System.out.println("2 elements in the cart!");
            Thread.sleep(2000);
            MB.clicking(MB.Webelem(PE.gocheckoutbtn()));
            Thread.sleep(2000);
            MB.Webelem(PE.firstname()).sendKeys("Elena");
            MB.Webelem(PE.lastname()).sendKeys("Alas");
            MB.Webelem(PE.postalcode()).sendKeys("3301");
            Thread.sleep(2000);
            MB.clicking(MB.Webelem(PE.CompleteCheckoutbtn()));
            Thread.sleep(2000);

            if(MB.is_elem_present(MB.Webelem(PE.checkoutheaderpage()))){
                System.out.println("Checkout page founded");
                MB.clicking(MB.Webelem(PE.finishshoppingbtn()));
                if (MB.is_elem_present(MB.Webelem(PE.FinishShoppingheader()))){
                    System.out.println("Checkout completed!");
                }
            }

        }else {
            System.out.println("not right amount of elements in cart");
        }

    }
}
