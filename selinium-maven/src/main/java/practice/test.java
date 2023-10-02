package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
    public static void main(String[] args) throws InterruptedException{
        methodalert();
    }

    public static void method1() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://signin.aws.amazon.com/");


        driver.findElement(By.xpath("//*[text()=' Sign In']")).click();


        WebElement ele = driver.findElement(By.xpath("//input[@type='email' and @class='aws-signin-textfield']"));
        ele.sendKeys("1234ytsdggadvkjdh@gmail.com");


        driver.findElement(By.id("next_button")).click();

        Thread.sleep(3000);
        WebElement error = driver.findElement(By.id("error_title"));
        String s = error.getText();
        System.out.println(s);
        WebElement error1 = driver.findElement(By.xpath("//span[contains(text(), 'does not exist')]"));
        String s1 = error1.getText();
        System.out.println(s1);

    }

    public static void method2uploadfile() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");

        driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys("D:\\TESTING\\Selinium by Raman sir\\files\\XpathExamples.txt");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();

        Thread.sleep(3000);
        String s = driver.findElement(By.xpath("//h3[@class='demo']")).getText();
        System.out.println(s);
    }

    public static void methoddropdown() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement ele = driver.findElement(By.id("select-demo"));
//       ele.click();
//       ele.sendKeys("Monday");
        Select s = new Select(ele);
        s.selectByValue("Friday");

        Thread.sleep(3000);

        WebElement page = driver.findElement(By.xpath("//select[@name='States']"));
//        page.sendKeys("Ohio");

        Select s11 = new Select(page);
        s11.selectByValue("Texas");

        WebElement text = driver.findElement(By.xpath("//a[contains(text(), 'Selenium Easy')]"));
       boolean b = text.isDisplayed();
        String t = text.getText();
        System.out.println( b + " --  text is :::"+t);
    }

    public static void methodalert() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\selinium-maven\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");

        WebElement al = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
        al.click();
        Thread.sleep(2000);
        Alert a = driver.switchTo().alert();
        a.accept();

        WebElement text = driver.findElement(By.id("demo"));
        System.out.println(text.isDisplayed());
        System.out.println(text.getText());

        Thread.sleep(2000);
        WebElement alertwithtext = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
        alertwithtext.click();

        Thread.sleep(2000);

        a.sendKeys("i like the conteent");
        a.accept();

        Thread.sleep(2000);
        WebElement text1 = driver.findElement(By.id("demoone"));
        System.out.println(text1.isDisplayed());
        System.out.println(text1.getText());

    }
}

