package pages;

import controls.Button;
import controls.TextBox;
import controls.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import models.UserLoginDetails;

public class LoginPage {

    private WebDriver driver;

    private TextBox emailTextBox(){
        return new TextBox(driver,By.id("email"));
    }

    private TextBox passwordTextBox(){
        return new TextBox(driver,By.id("password"));
    }


    public LoginPage open(){
        driver.get("https://www.cleartrip.com/signin");
        return this;
    }


}
