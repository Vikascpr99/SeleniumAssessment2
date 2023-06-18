package SeleniumAssignment2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumassignment2 {



public static void main(String[] args) throws InterruptedException {

//WebDriverManager.firefoxdriver().setup();
WebDriverManager.chromedriver().setup();
//WebDriverManager.edgedriver().setup();

WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();
//WebDriver driver = new EdgeDriver();


driver.get("http://demo.automationtesting.in/Alerts.html");

Actions actions = new Actions(driver);

//Hovering mouse over SwitchTo navigation bar menu.
WebElement target = driver.findElement(By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li.dropdown.active > a"));
actions.moveToElement(target).perform();
Thread.sleep(100);

//Selecting alerts from dropdown of SwitchTo nav menu.
//WebElement clickalert = driver.findElement(By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li.dropdown.active.open > ul > li:nth-child(1) > a"));
//actions.moveToElement(clickalert);
//clickalert.click();

//Clicking Alert with ok 
WebElement alertWithOk = driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li.active > a"));
alertWithOk.click();
Thread.sleep(500);
//Clicking On "click the button to display an alert box"
WebElement clickTheButtonToDisplayAlertMsg = driver.findElement(By.cssSelector("#OKTab > button"));
clickTheButtonToDisplayAlertMsg.click();
Thread.sleep(500);
//Checking alert pop up appears or not
String alertmsg = driver.switchTo().alert().getText();
if(alertmsg == "") {
	System.out.println("Don't have alert message");
}
else {
	System.out.println("Contains Alert message");
}
Thread.sleep(500);
//Clicking Ok at alert popup
driver.switchTo().alert().accept();
Thread.sleep(500);

//Clicking "Alert with Ok & cancel"  
WebElement alertWithOkandCancel = driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(2) > a"));
alertWithOkandCancel.click();
Thread.sleep(500);
//Clicking the button to display conform box
WebElement displayConfirmBox = driver.findElement(By.cssSelector("#CancelTab > button"));
displayConfirmBox.click();
Thread.sleep(500);
//conform box pop up appears or not
String confirmBoxPopUp = driver.switchTo().alert().getText();
if(confirmBoxPopUp == "") {
	System.out.println("Don't have confirm alert pop up");
}
else {
	System.out.println("Contains Confirm alert pop up");
}
Thread.sleep(500);
//Cancelling the alert message after getting by "Alert with Ok & cancel"
driver.switchTo().alert().dismiss();
String msg = driver.findElement(By.cssSelector("#demo")).getText();
System.out.println(msg);
Thread.sleep(500);
//Clicking "Alert With Textbox"
WebElement alertWithTextBox = driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(3) > a"));
alertWithTextBox.click();
Thread.sleep(500);
//Clicking the button to demonstrate the promote box
WebElement clickPromoteBox = driver.findElement(By.cssSelector("#Textbox > button"));
clickPromoteBox.click();
Thread.sleep(3000);
//Checking whether "Promote Pop up " appears or not
String confirmPromotePopUp = driver.switchTo().alert().getText();
if(confirmPromotePopUp == "") {
	System.out.println("Don't have Promote Pop Up");
}
else {
	System.out.println("Contains Promote Pop Up");
}
//
//clickPromoteBox.sendKeys("Vikas");
driver.switchTo().alert().sendKeys("Vikas");
driver.switchTo().alert().accept();
Thread.sleep(3000);
//Checking if "Hello <my name> How are you today" is printing or not
String OutPut = driver.findElement(By.id("demo1")).getText();
//Printing the OutPut on Console
System.out.println(OutPut);

Thread.sleep(3000);

driver.quit();

Thread.sleep(3000);
driver.quit();



}



}