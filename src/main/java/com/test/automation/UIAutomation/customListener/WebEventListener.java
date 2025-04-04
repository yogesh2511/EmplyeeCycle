package com.test.automation.UIAutomation.customListener;

import  java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import com.test.automation.UIAutomation.utility.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.testng.Reporter;

import com.test.automation.UIAutomation.errorScreenShot.ErrorScreenShot;
import com.test.automation.UIAutomation.utility.DateTimeHelper;

public class WebEventListener extends AbstractWebDriverEventListener{

	
	public void beforeNavigateTo(String url, WebDriver driver) {
		try {
			log("inside method beforeNavigateTo on : "+url);
		} catch (Exception e) {
			getScreenShot(driver);
			e.printStackTrace();
		}
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		
		try {
			log("Navigated to:'" + url + "'");
		} catch (Exception e) {
			getScreenShot(driver);
			e.printStackTrace();
		}
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		//System.out.println("inside method beforeChangeValueOf on " + driver.toString());
		try {
			log("Value of the:" + element.toString()				+ " before any changes made");
		} catch (Exception e) {
			getScreenShot(driver);
			e.printStackTrace();
		}
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		//System.out.println("inside method afterChangeValueOf on " + driver.toString());
		try {
			log("Element value changed to: " + element.toString());
		} catch (Exception e) {
			getScreenShot(driver);
			e.printStackTrace();
		}
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		//System.out.println("inside method beforeClickOn on " + driver.toString());
		try {
			log("Trying to click on: " + element.toString());
		} catch (Exception e) {
			getScreenShot(driver);
			e.printStackTrace();
		}
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		//System.out.println("inside method afterClickOn on " + driver.toString());
		
		try {
			log("Clicked on: " + element.toString());
		} catch (Exception e) {
			getScreenShot(driver);
			e.printStackTrace();
		}
	}

	public void beforeNavigateBack(WebDriver driver) {
		//System.out.println("inside method beforeNavigateBack on " + driver.toString());
		try {
			log("Navigating back to previous page");
		} catch (Exception e) {
			getScreenShot(driver);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("inside method afterNavigateBack on " + driver.toString());
		try {
			log("Navigated back to previous page");
		} catch (Exception e) {
			getScreenShot(driver);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void beforeNavigateForward(WebDriver driver) {
		//System.out.println("inside method beforeNavigateForward on " + driver.toString());
		try {
			log("Navigating forward to next page");
		} catch (Exception e) {
			getScreenShot(driver);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void afterNavigateForward(WebDriver driver) {
		//System.out.println("inside method afterNavigateForward on " + driver.toString());
		try {
			log("Navigated forward to next page");
		} catch (Exception e) {
			getScreenShot(driver);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onException(Throwable error, WebDriver driver) {
		  System.out.println("Caught Exception");
		  File scrFile = ((TakesScreenshot) driver)
		    .getScreenshotAs(OutputType.FILE);
		  try {
		   org.apache.commons.io.FileUtils.copyFile(scrFile, new File(
		     "C:\\Users\\yogeshsolanki\\Desktop\\Error_ScreenShot\\"+DateTimeHelper.getCurrentDateTime()+".png"));
		  } catch (Exception e) {
		   System.out.println("Unable to Save");
		  }
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		try {
			System.out.println("inside method beforeFindBy on " + driver.toString());
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		//log("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		try {
			System.out.println("inside method afterFindBy on " + driver.toString());
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		//log("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver driver) {
		try {
			log("beforeScript to next page : "+script);
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("Just before beforeScript " + driver);
	}

	public void afterScript(String script, WebDriver driver) {
		try {
			log("afterScript to next page : "+script);
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("Just after afterScript " + driver);

	}

	public void beforeAlertAccept(WebDriver driver) {
		try {
			log("beforeAlertAccept to next page");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("inside method beforeAlertAccept on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		try {
			log("inside method afterAlertAccept on");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("inside method afterAlertAccept on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		try {
			log("inside method afterAlertDismiss on");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		try {
			log("inside method beforeAlertDismiss on");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		try {
			log("inside method beforeNavigateRefresh on");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		try {
			log("inside method afterNavigateRefresh on ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		try {
			log("inside method beforeChangeValueOf on :" +element.getText()+" Clicked");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		try {
			log("inside method afterChangeValueOf on  :" +element.getText()+" Clicked");
		} catch (Exception e) {
			getScreenShot(driver);
			log(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void getScreenShot(WebDriver driver)
	{		
		 try {
			 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File output = new File("C:\\Users\\yogeshsolanki\\Desktop\\Error_ScreenShot\\"+DateTimeHelper.getCurrentDateTime()+".png");
			FileUtils.copyFile(file, output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void log(String data){
		Logger.info(data);
		Reporter.log(data);
	}
}
