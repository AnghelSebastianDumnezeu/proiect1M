import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends PageObject{

    private final String SITE_NAME = "you tube";
    private final String VALID_URL = "www.youtube.com";


    @FindBy(xpath = "//*[@id=\"siteName\"]")
    private WebElement siteNameField;

    @FindBy(xpath ="//*[@id=\"urlName\"]")
    private WebElement urlField;

    @FindBy(xpath = "//*[@id=\"myForm\"]/button\"]")
    private WebElement submit;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void populateUrlField() {
        this.urlField.sendKeys(VALID_URL);
    }

    public void populateSiteNameField(){
        this.siteNameField.sendKeys(SITE_NAME);
    }
}
