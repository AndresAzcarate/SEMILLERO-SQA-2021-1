import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] argd) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Entrar a una pagina web
        driver.get("https://www.amazon.com/");

        // Maximizar ventana.
        driver.manage().window().maximize();

        // llamar un elemento.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("echo dot 4th generation");

        // dar click.
        driver.findElement(By.id("nav-search-submit-button")).click();

        // parcialmente el texto
        driver.findElement(By.partialLinkText("Altavoz inteligente con Alexa")).click();

        // dar click.
        driver.findElement(By.id("buy-now-button")).click();

        // dar click.
        driver.findElement(By.id("ap_email")).sendKeys("asar170917@gmail.com");

        // continuar
        driver.findElement(By.xpath("//input[@id=\"continue\" and @class=\"a-button-input\"]")).click();

        driver.findElement(By.id("ap_password")).sendKeys("Asazcarate123");

        driver.findElement(By.id("signInSubmit")).click();


        // delay
        //Thread.sleep(5000);

        // Exit
        //driver.quit();
    }
}
