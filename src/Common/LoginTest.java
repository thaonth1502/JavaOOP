package Common;

public class LoginTest extends BaseTest{
    public void testLoginSuccess(){
        createBrowser();
        System.out.println("navigate to url http...");
        System.out.println("Set email valid");
        System.out.println("Enter password valid");
        System.out.println("Click on Login Button");
        System.out.println("Verify login success");
        closedBrowser();
    }

    public void testLoginWithEmailInvalid(){
        createBrowser();
        System.out.println("navigate to url http...");
        System.out.println("Set email invalid");
        System.out.println("Enter password valid");
        System.out.println("Click on Login Button");
        System.out.println("Verify login unsuccess");
        closedBrowser();
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.testLoginSuccess();
        loginTest.testLoginWithEmailInvalid();
    }
}
