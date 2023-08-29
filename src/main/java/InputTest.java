import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {
    /*Проверить на возможность ввести различные цифровые и нецифровые значения,
    используя Keys.ARROW_UP  И Keys.ARROW_DOWN*/

    @Test
    public void verifyKeysArrowUp() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String value = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(value, "1");
    }

    @Test
    public void verifyKeysArrowDown() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String value = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals(value, "-1");
    }

    @Test
    public void verifyNotNumbersValues() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("A1`2wssSD");
        String value = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals(value, "12");
    }
}
