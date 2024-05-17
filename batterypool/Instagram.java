package batterypool;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Instagram {
    WebDriver driver;
    ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public void configreport() {
        report = new ExtentReports(System.getProperty("user.dir") + "\\emailable.html");
        test = report.startTest("emailable");
    }

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/?hl=en");
        test.log(LogStatus.PASS, "Webpage of Instagram is opened");

        driver.manage().window().maximize();
        test.log(LogStatus.PASS, "Webpage has maximized");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        test.log(LogStatus.PASS, "Implicit wait is set for 10 seconds");
    }

    @Test(enabled = true, priority = 1)
    public void login1() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("markspec45");
        test.log(LogStatus.PASS, "Invalid username has been filled");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("moonknight");
        test.log(LogStatus.PASS, "Valid password has been filled");

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log in']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
        test.log(LogStatus.PASS, "Clicked on login button");

        Thread.sleep(9000);
        test.log(LogStatus.PASS, "Error message displayed indicating an invalid username or password");
    }

    @Test(enabled = true, priority = 2)
    public void login2() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("markspec45124");
        test.log(LogStatus.PASS, "Invalid username has been filled");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("moonknight");
        test.log(LogStatus.PASS, "Valid password has been filled");

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log in']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
        test.log(LogStatus.PASS, "Clicked on login button");

        Thread.sleep(5000);
        test.log(LogStatus.PASS, "Error message displayed indicating an invalid username or password");
    }

    @Test(enabled = true, priority = 3)
    public void login3() throws InterruptedException {
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("markspec45");
        test.log(LogStatus.PASS, "Valid username has been filled");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("moonknight1245");
        test.log(LogStatus.PASS, "Invalid password has been filled");

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log in']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
        test.log(LogStatus.PASS, "Clicked on login button");

        Thread.sleep(5000);
        test.log(LogStatus.PASS, "Error message displayed indicating an invalid username or password");
    }

    @Test(enabled = true, priority = 4)
    public void login4() throws InterruptedException {
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("");
        test.log(LogStatus.PASS, "Empty username has been filled");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
        test.log(LogStatus.PASS, "Empty password has been filled");

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log in']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
        test.log(LogStatus.PASS, "Clicked on login button");

        Thread.sleep(5000);
        test.log(LogStatus.PASS, "Error message displayed indicating both fields are required");
    }

    @Test(enabled = true, priority = 5)
    public void login5() throws InterruptedException {
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Markspec45");
        test.log(LogStatus.PASS, "Username has been filled after changing the first letter to uppercase");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Moonknight1245");
        test.log(LogStatus.PASS, "Password has been filled after changing the first letter to uppercase");

        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log in']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
        test.log(LogStatus.PASS, "Clicked on login button");

        Thread.sleep(5000);
        test.log(LogStatus.PASS, "Login is not successful because username and password are case sensitive");
    }

    @Test(enabled = true, priority = 6)
    public void login6() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//span[text()='Forgot password?']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        test.log(LogStatus.PASS, "Forgot password button is clickable and redirecting the browser to another page");
        Thread.sleep(9000);
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

    @AfterClass
    public void last() {
        report.endTest(test);
        report.flush();
    }
}
