package TestPack;

import org.testng.annotations.Test;

public class tagUnderstand {

    @Test( priority = 3)
    public void tc08(){
        System.out.println("this is tc01");
    }
    @Test(priority = 2)
    public void tc09(){
        System.out.println("this is tc01");
    }
    @Test(priority = 1)
    public void tc10(){
        System.out.println("this is tc01");
    }
}
