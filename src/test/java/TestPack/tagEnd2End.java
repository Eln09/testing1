package TestPack;

import org.testng.annotations.Test;

public class tagEnd2End {
    @Test(groups = "smoke")
    public void tc08(){
        System.out.println("this is tc01");
    }
    @Test(groups = "end2end")
    public void tc09(){
        System.out.println("this is tc01");
    }
    @Test(groups = "regression")
    public void tc10(){
        System.out.println("this is tc01");
    }
}
