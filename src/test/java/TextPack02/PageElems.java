package TextPack02;

import org.openqa.selenium.By;

public class PageElems {

    public By username(){

        By a= By.xpath("//input[@id='user-name']");
    return a;
    }

    public By password(){

        By a= By.xpath("//input[@id='password']");
        return a;
    }
    public By loginbtn(){

        By a= By.xpath(   "//input[@id='login-button']");
        return a;
    }

    public By cartbtn(){
        By a= By.xpath("//a[@class='shopping_cart_link']");
        return a;
    }
    public By gocheckoutbtn(){
        By a= By.xpath("//button[@id='checkout']");
        return a;
    }

    public By shoppinglist(){
        By a= By.xpath("//div[@class='cart_list']/div[@class='cart_item']");
        return a;
    }

    public By bike(){
        By a= By.id("add-to-cart-sauce-labs-bike-light");
        return a;
    }

    public By shirt(){
        By a= By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
        return a;
    }

    public By firstname(){
        By a= By.id("first-name");
        return a;
    }
    public By lastname(){
        By a= By.id("last-name");
        return a;
    }
    public By postalcode(){
        By a= By.id("postal-code");
        return a;
    }

    public By CompleteCheckoutbtn(){
        By a= By.id("continue");
        return a;
    }

    public By checkoutheaderpage(){
        By a= By.xpath("//span[@class='title']");
        return a;
    }

    public By finishshoppingbtn(){
        By a= By.id("finish");
        return a;
    }

    public By FinishShoppingheader(){
        By a= By.xpath("//h2[@class='complete-header']");
        return a;
    }
}
