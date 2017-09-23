package by.selenium.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import by.selenium.pages.InboxPage;
import by.selenium.pages.MainPage;
import by.selenium.pages.NewLetterPage;

public class Main {
	//private static WebDriver driver;
	private final static String CHROME = "webdriver.chrome.driver";
	private final static String CHROMEDRIVERPATH = "/usr/local/bin/chromedriver";

	public static void main(String[] args) {

		

	}

//	public static WebDriver createChromeDriver() {
//		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		return driver;
//	}
//
//	public static void sendNewLetterTest() {
//		// Open main page
//		MainPage mainPage = new MainPage(getDriver());
//		mainPage.open();
//		// Authorization
//		InboxPage inboxPage = mainPage.authorization();
//		// Send New Letter
//		NewLetterPage newLetterPage = inboxPage.pressButtonNewLetter();
//		InboxPage resultPage = newLetterPage.sendLetter();
//		// Log out
//		resultPage.logOut();
//	}
//
//	public static void destroyBrowser() {
//		getDriver().quit();
//	}
//
//	public static WebDriver getDriver() {
//		return driver;
//	}
//
//	public void setDriver(WebDriver driver) {
//		Main.driver = driver;
//	}

}
