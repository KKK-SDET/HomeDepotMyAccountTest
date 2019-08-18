package JDBC;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class JDBC_Helper {

    WebDriver driver;

    JDBC_Helper(){

    }

    public void JDBCinit(WebDriver driver) {
        this.driver = driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewDataBase", "root", "Altair2504*");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from HomeDepot");

            while (resultSet.next()) {
                driver.get("https://secure2.homedepot.com/account/view/logon/redirect/%252Faccount%252Fview%252Fprofile");
                driver.findElement(By.xpath("//*[@id=\"signinEmail\"]")).sendKeys(resultSet.getString(2));
                driver.findElement(By.id("password")).sendKeys(resultSet.getString(3));
                driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
                //System.out.println(resultSet.getString(1)+"    "+resultSet.getString(2)+"   "+resultSet.getString(3));
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
