package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DockerLog {
    WebDriver driver=null;
    MethodBasic MB;

    @Parameters("url")

    @BeforeClass
    public void launchBrowser(String url){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        this.MB = new MethodBasic(this.driver);

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    @Test(priority = 1)
    public void homepage(){
        WebElement logo= driver.findElement(By.xpath("//li[@class='logo']"));
           if(MB.is_elem_present(logo)){
               System.out.println("logo founded!");
           }
    }
    @Test
    public void check_for_mouse_hover() throws Exception {
        WebElement ele = null;
        Actions action = new Actions(this.driver);
        ele = this.driver.findElement(By.xpath("//span[text()='Courses']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Courses Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000L);
        }

        ele = this.driver.findElement(By.xpath("//button[text()='Consulting']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Consulting Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000L);
        }

        ele = this.driver.findElement(By.xpath("//button[text()='Enterprises']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Enterprises Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000L);
        }

        ele = this.driver.findElement(By.xpath("//button[text()='Enterprises']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Enterprises Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000L);
        }

        ele = this.driver.findElement(By.xpath("//button[text()='Certification']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Certification Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000L);
        }

        ele = this.driver.findElement(By.xpath("//button[text()='Resources']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Resources Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(3000L);
        }

    }
   /* @Test(priority = 3)
    public void getStarted() throws Exception{
        //go back to main page of Docker
        driver.navigate().to("https://www.docker.com/");
        Thread.sleep(3000);
        WebElement GetStartBtn= MB.WebelemXpath("(//a[@class='header_button'])[1]");
        if (GetStartBtn.isDisplayed()) {
            System.out.println("Get Started button found!");
            MB.clicking(GetStartBtn);
            Thread.sleep(3000);
            WebElement GetStartedHeader= MB.WebelemXpath("//div[@class='et_pb_text_inner']/h1");

            if(MB.is_elem_present(GetStartedHeader)){
                if(GetStartedHeader.getText().equals("Get Started with Docker")){
                    System.out.println("Header of Get Started page is correct");
                }else {
                    System.out.println("Header of Get Started page founded but not correct");
                }

            } else {
                System.out.println("Header of Get Started not found");
            }
            //check how to button //div/a[contains(text(),'Learn how to install Docker')] //div/a[@target='_blank'])
            if(MB.is_elem_present(MB.WebelemXpath("//div/a[contains(text(),'Learn how')]"))==true){
                System.out.println("Button Learn how to install Docker is present");
            }

        } else {
            System.out.println("Get Started button not found");
        }
    }
    @Test(priority = 2)
    public void signIn() throws Exception{
        WebElement startButton = MB.WebelemXpath("(//li/a[text()='Sign In'])[1]");
        try {
            if( startButton.isDisplayed()) {

                //going to login page
                startButton.click();
                System.out.println("Sign in page is displayed");
                Thread.sleep(3000);

                //getting text from all buttons of the login page
                int totalbtns = driver.findElements(By.xpath("//button[@type='submit']")).size();
                for(int a = 1; a <= totalbtns; ++a) {
                    String text = MB.WebelemXpath("(//button[@type='submit'])[" + a + "]").getText();
                    System.out.println("The " + a + " button text is: " + text);
                }
                Thread.sleep(3000);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        //driver.navigate().back();
    }*/

}
