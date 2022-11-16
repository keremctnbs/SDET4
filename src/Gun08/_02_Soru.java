package Gun08;
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Dogum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies(); // girilikten sonra cookies ler silindi

        MyFunc.bekle(1);
        // //* [text()='Allow essential and optional cookies']
        WebElement cookiesAccept=driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        cookiesAccept.click();

        MyFunc.bekle(1);
        WebElement btnyenihesap=driver.findElement(By.linkText("Create New Account"));
        btnyenihesap.click();

        MyFunc.bekle(1);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("kerem");

        MyFunc.bekle(1);
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("çetinbaş");

        List<WebElement> secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.Email su an gözüküyor mu",(secondEmail.size()==1));

        MyFunc.bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("keremcetinbas03@gmail.com");

        secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.Email su an gözüküyor mu",(secondEmail.size()==0));
        //göründüğünü kontrol edileceği yer

        WebElement email2=driver.findElement(By.name("reg_email_confirmation__"));// 2.email i girdik
        email2.sendKeys("keremcetinbas03@gmail.com");

        MyFunc.bekle(1);
        WebElement day=driver.findElement(By.id("Day"));
        Select dropDownday = new Select(day);
        dropDownday.selectByValue("4");

        MyFunc.bekle(1);
        WebElement Mont=driver.findElement(By.id("Mont"));
        Select dropDownMont = new Select(day);
        dropDownMont.selectByValue("10");

        MyFunc.bekle(1);
        WebElement Year=driver.findElement(By.id("Year"));
        Select dropDownYear = new Select(day);
        dropDownYear.selectByValue("2000");

        MyFunc.bekle(1);
        WebElement sex=driver.findElement(By.cssSelector("input[vaale='2'][name='sex'"));
        sex.click();


        driverBekleKapat();







    }

}
