import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestLogin {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='flash'] ")
    WebElement homePageHeaderText;
}
