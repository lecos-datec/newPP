import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //  driver.get("https://elgeniox.com/");
        driver.get("https://dmall-bolivia.myshopify.com/products/alcohol-en-gel-jamsa-lavanda-360-ml-717557-955");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement buyNow = driver.findElement(By.xpath("//*[@id='product-form-template--17141548482745__main']/div/div[2]/div/shopify-accelerated-checkout/shopify-buy-it-now-button/button"));
        buyNow.click();
        Thread.sleep(5000);
        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Iniciar sesión')]"));
        login.click();
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.id("CustomerEmail"));
        email.sendKeys("lecos@datec.com.bo");
        WebElement pass = driver.findElement(By.id("CustomerPassword"));
        pass.sendKeys("11111");
        Thread.sleep(2000);
        WebElement login2 = driver.findElement(By.id("boton-login"));
        login2.click();
        Thread.sleep(5000);
        WebElement delivery = driver.findElement(By.xpath("//*[@id='Form1']/div[1]/div/div/div[2]/div/div[2]/div[1]/button"));
        delivery.click();
        Thread.sleep(5000);
        WebElement send = driver.findElement(By.xpath("//*[@id='Form2']/div[1]/div/div/div/div/div[2]/div[1]/button"));
        send.click();
        Thread.sleep(5000);
        WebElement payMethod = driver.findElement(By.id("basic-customManualPayment-80948756665"));
        payMethod.click();
        WebElement finaly = driver.findElement(By.xpath("//*[@id='Form3']/div[1]/div/div/div[2]/div[1]/div/button"));
        finaly.click();
        /*
        WebElement cell = driver.findElement(By.id("email"));
        cell.sendKeys("70624869");
        Thread.sleep(5000);
        WebElement name = driver.findElement(By.id("TextField0"));
        name.sendKeys("Lucy");
        WebElement lastName = driver.findElement(By.id("TextField1"));
        lastName.sendKeys("Ecos");
        WebElement adress = driver.findElement(By.id("TextField2"));
        adress.sendKeys("mi casa");
        WebElement city = driver.findElement(By.id("TextField4"));
        city.sendKeys("La Paz");
        Thread.sleep(2000);
        WebElement delivery = driver.findElement(By.xpath("//*[@id='Form1']/div[1]/div/div/div[2]/div/div[2]/div[1]/button"));
        delivery.click();

         */
    }
}
