package testNG;

import org.testng.annotations.Test;

import pageObjectModel.pageObjectModel;

import org.testng.annotations.BeforeTest;
import dataProvider.configFileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class TestNG
{
	WebDriver driver;
	pageObjectModel WebElements;
	String baseUrl;
	configFileReader configFileReader;
  @Test
  public void getSubscription() 
  {
	  WebElements.clickOnGetSubscription();
	  WebElements.clickOnSelectICONIC();
	  WebElements.clickOnPlan();
	  WebElements.clickOnPay();
	  WebElements.clickOnPay();
  }
  @BeforeTest
  public void launchApplication() 
  {
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-notifications");
      configFileReader=new configFileReader();
      baseUrl=configFileReader.getApplicationUrl();
        System.out.println("before senario");
        System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
        driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        driver.get(baseUrl); 
        WebElements=new pageObjectModel(driver);
  }

  @AfterTest
  public void closeBrowser() 
  {
	  driver.quit();
  }

}