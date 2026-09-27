import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Testing {

    public static void main(String[] args) {
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX);
        try {
            driver.get("http://172.31.11.58:8080/testapp/");
            System.out.println(driver.getCurrentUrl());

            String expmsg = "Hello, World!";
            String actmsg = driver.findElement(By.tagName("body")).getText();

            System.out.println("Expected Message : " + expmsg);
            System.out.println("Actual Message   : " + actmsg);

            if (expmsg.equals(actmsg)) {
                System.out.println("Testing has Passed");
            } else {
                System.out.println("Testing has Failed");
            }
        } catch (Exception e) {
            System.out.println("Test encountered an error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
