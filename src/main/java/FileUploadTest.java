import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void verifyFileUpload() {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\Ремонт водопровода\\Проект2.jpg");
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();
        String nameOfFile = driver.findElement(By.xpath("//*[@id='uploaded-files']")).getText();
        Assert.assertEquals(nameOfFile, "Проект2.jpg", "Names is not equals");
    }
}
