import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_SauceDemo {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else {
            System.out.println("Wrong Browser Name");
        }
//2. Open URL.
        driver.get(baseUrl);

//3. Print the title of the page.
        System.out.println(driver.getTitle());

        //4. Print the current url.
        System.out.println(driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println(driver.getPageSource());

        //6. Enter the email to email field.
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("Chetan");

        //7. Enter the password to password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("chetan");

//8. Click on Login Button.
        WebElement loginlink = driver.findElement(By.id("login-button"));
        loginlink.click();

        //9. Print the current url.
        System.out.println(driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();


    }
}
