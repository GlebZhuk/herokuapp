import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {
    @Test
    public void verifyFrame() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement iframe = driver.findElement(By.xpath("//*[@id='tinymce']/p"));
        String frameText = iframe.getText();
        Assert.assertEquals(frameText, "Your content goes here.");
    }
}
