import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Users {
    public static WebDriver driver;

    @Test

    public void AddNewUser () throws InterruptedException {     // добавление нового пользователя
        System.setProperty("webdriver.chrome.driver", "C:\\CRdriver85\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html"); // открытие сайта в браузере

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("SillyHil@mail.ru");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")).sendKeys("1111");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[3]//td[2]//input[1]")).click();

    }
    @Test
    public void FindUser () throws InterruptedException {     // поиск пользователя
        System.setProperty("webdriver.chrome.driver", "C:\\CRdriver85\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/"); // открытие сайта в браузере

        driver.findElement(By.xpath("//input[@placeholder='Введите email или имя']")).sendKeys("SillyHil");
        driver.findElement(By.xpath("//button[@class='btn btn-submit']")).click();

    }
    @Test
    public void Login () throws InterruptedException {     // логин
        System.setProperty("webdriver.chrome.driver", "C:\\CRdriver85\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html"); // открытие сайта в браузере

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("SillyHil@mail.ru");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")).sendKeys("1111");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[3]//td[2]//input[1]")).click();

//личный кабинет

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.xpath("//li[@id='fat-menu']//li[1]//a[1]")).click();

    }

}




