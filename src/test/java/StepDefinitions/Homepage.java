package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

   public WebDriver driver = null;


    @Given("^I go to the home page$")
    public void I_go_to_the_home_page() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\" + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.qa15codebloomingdales.fds.com/");
    }

    @When("^I search for a product$")
    public void I_search_for_a_product() {
        driver.findElement(By.name("keyword")).sendKeys("dresses");
    }

    @When("^I click on fob$")
    public void I_click_on_fob() {
        driver.findElement(By.linkText("HANDBAGS")).click();
    }
}
