package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    static
    {

        Logger logger= Logger.getLogger(""); // bütün loglara ulaştım
        logger.setLevel(Level.SEVERE);// sadece errorları göster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_APPEND_LOG_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // ekranı max yapıyor
        driver.manage().deleteAllCookies(); // sitenin senin bilgisayarında yaptığı ayarlar siliniyor

        Duration dr=Duration.ofSeconds(5);
        driver.manage().timeouts().pageLoadTimeout(dr);// sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili
        //bu eklenmezse selenium sayfa yüklenene kadar(sonsuza) bekler: 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn beklemez

        driver.manage().timeouts().implicitlyWait(dr);// bütün webelemenetlerin element bazında elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre

        

        }

    public static void driverBekleKapat()

        {
            MyFunc.bekle(10);
            driver.quit();
        }


    }



