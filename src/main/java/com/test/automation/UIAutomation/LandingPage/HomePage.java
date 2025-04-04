package com.test.automation.UIAutomation.LandingPage;

import java.util.ArrayList;
import java.util.List;

import com.test.automation.UIAutomation.utility.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation.config.ElementLoad;
import com.test.automation.UIAutomation.testBase.TestBase;
import com.test.automation.UIAutomation.uiActions.RequirementsLifeCycle.RequirementDetailsPage;

public class HomePage extends TestBase {

	
	// public static List<WebElement> Allmenus = new ArrayList<>();
	public static List<WebElement> AllHeaderMenuslinks = null;
	public static List<WebElement> AllHeaderSubMenuLinks = null;
	public static List<WebElement> AllRequirementlinks = null;
	public static String requirmentDetailsPage = null;

	public static void serachKeyword(String keyword) {
		try {
			Logger.info("**************serachKeyword method startd*******************");
			WebElement searchKeywors = ElementLoad.getWebElement("Requirements", hompagePropertyFile);
			Logger.info(searchKeywors.toString());

			sendKeys(searchKeywors, keyword);
			Logger.info("searchKeywors entered" + keyword);
			click(ElementLoad.getWebElement("SearchBtn", hompagePropertyFile));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static WebElement Requirements() throws Exception {
		WebElement Requirements = null;
		try {
			Requirements = ElementLoad.getWebElement("Requirements", hompagePropertyFile);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Requirements;
	}

	public static WebElement requirementList() {
		WebElement RequirementList = null;
		try {
			RequirementList = ElementLoad.getWebElement("RequirementList", hompagePropertyFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return RequirementList;

	}

	public static void allHeaderMenu() {
		try {
			
			AllHeaderMenuslinks = ElementLoad.getWebElements("Mainheader", hompagePropertyFile);
			// Logger.info("AllHeaderMenuslinks:"+AllHeaderMenuslinks);
			// singleHeaderMethod(Header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void singleHeaderMethod(String Header) {
		allHeaderMenu();
		try {
			for (int i = 0; i < AllHeaderMenuslinks.size(); i++) {

				String SingleHeader = AllHeaderMenuslinks.get(i).getText();
				 Logger.info("SingleHeader:"+SingleHeader);
				if (SingleHeader.equalsIgnoreCase(Header)) {
					Logger.info("Click on"+Header);
					click(AllHeaderMenuslinks.get(i));
					break;
					// Logger.info("****************equalsIgnoreCase
					// display*********"+Header);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void allSubHeaderMenu(String Header) {
		singleHeaderMethod(Header);
		try {
			// Logger.info("****************try*********");
			AllHeaderSubMenuLinks = ElementLoad.getWebElements("submenu", hompagePropertyFile);
			Logger.info("AllHeaderMenuslinks:" + AllHeaderMenuslinks.size());
			// singleHeaderMethod(Header);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public static void subHeaderMethod(String Header, String subHeader) {
		allSubHeaderMenu(Header);
		try {
			for (int i = 0; i < AllHeaderSubMenuLinks.size(); i++) {

				String SingleHeader = AllHeaderSubMenuLinks.get(i).getText();
				Logger.info("subElement:" + SingleHeader);
				if (SingleHeader.equalsIgnoreCase(subHeader)) {
					click(AllHeaderSubMenuLinks.get(i));
					break;

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebElement priorityCheck() {
		WebElement prioritydropdown = null;
		try {
			prioritydropdown = com.test.automation.UIAutomation.config.ElementLoad.getWebElement("PriorityDropdown",
					hompagePropertyFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prioritydropdown;
	}

	public static WebElement selectPageSize() {
		WebElement selectPageSizedropdown = null;
		try {
			selectPageSizedropdown = com.test.automation.UIAutomation.config.ElementLoad.getWebElement("PageSize",
					hompagePropertyFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return selectPageSizedropdown;
	}

	public static void selecByColorPriority() {
		try {
			// Logger.info("****************try*********");
			AllRequirementlinks = com.test.automation.UIAutomation.config.ElementLoad
					.getWebElements("RequirementTotalList", hompagePropertyFile);
			// Logger.info("AllRequirementlinks:"+AllRequirementlinks.size());
			// singleHeaderMethod(Header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void singleSelecBbyColor(String color) {

		selecByColorPriority();

		try {
			for (int i = 0; i < AllRequirementlinks.size(); i++) {
				String SingleHeader = AllRequirementlinks.get(i).getAttribute("style");

				String[] colorsdetails = SingleHeader.split(":");

				for (String colors : colorsdetails) {
					// Logger.info("colorsdetails:" + colorsdetails[i].toString());
					Logger.info("colors:" + colors);
					if (color.equalsIgnoreCase(colors)) {
						Logger.info("pink color");

						swapToRequirementDetailsPage(AllRequirementlinks.get(i));

						// AllRequirementlinks.get(i).click();
						// break;
					} else if (color.equalsIgnoreCase(colors)) {
						Logger.info("orange color" + AllRequirementlinks.get(i));
						swapToRequirementDetailsPage(AllRequirementlinks.get(i));
						// return colorslist=orange;
						// AllRequirementlinks.get(i).click();
						// break;
						// Logger.info(w.length());
					} else if (color.equalsIgnoreCase(colors)) {
						Logger.info("light green color color" + AllRequirementlinks.get(i));
						swapToRequirementDetailsPage(AllRequirementlinks.get(i));
						// return colorslist=lemongreen;
						// AllRequirementlinks.get(i).click();
						// break;
						// Logger.info(w.length());
					} else if (color.equalsIgnoreCase(colors)) {
						Logger.info("red color color" + AllRequirementlinks.get(i));
						swapToRequirementDetailsPage(AllRequirementlinks.get(i));
						// return colorslist=red;
						// AllRequirementlinks.get(i).click();
						// break;
						// Logger.info(w.length());
					}

					else {
						Logger.info("color not found");
					}
				}

				/*
				 * if(SingleHeader.equalsIgnoreCase(color)) {
				 * click(AllHeaderMenuslinks.get(i)); break; //Logger.info(
				 * "****************equalsIgnoreCase display*********"+Header);
				 * }
				 */
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return colorslist;
	}

	public static void swapToRequirementDetailsPage(WebElement element) throws InterruptedException {
		String winHandleBefore = driver.getWindowHandle();
		Logger.info("winHandleBefore: " + winHandleBefore);
		click(element);
		// Perform the click operation that opens new window
		ArrayList<String> window = new ArrayList<String>();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			Logger.info("winHandle: " + winHandle);
		}

		Logger.info(" currnt winHandle: " + driver.getWindowHandle());
		Logger.info("Title:" + driver.getTitle());
		// requirmentDetailsPage= driver.getWindowHandle();

		Pages.RequirementDetails();
		// SwaptoOtherPage();
		RequirementDetailsPage.selectHeader("Requirement Details");
		// Perform the actions on new window
		Thread.sleep(5000);
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		// Logger.info("winHandleBefore: "+winHandleBefore);

	}

	public static void SwaptoOtherPage() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			Logger.info("winHandle: " + winHandle);
		}

		Logger.info(" currnt winHandle: " + driver.getWindowHandle());
		Logger.info("Title:" + driver.getTitle());
	}

	@Test
	public static String selectColor(String color) {
		String col = "";
		if (color.equalsIgnoreCase("pink")) {
			col = new String(" rgb(232, 69, 181);");
			singleSelecBbyColor(col);
			Logger.info("Color: " + col);
		} else if (color.equalsIgnoreCase("orange")) {
			col = new String(" rgb(248, 148, 6);");
			singleSelecBbyColor(col);
			Logger.info("Color: " + col);
		} else if (color.equalsIgnoreCase("light green")) {
			col = new String(" rgb(189, 185, 37);");
			singleSelecBbyColor(col);
			Logger.info("Color: " + col);
		} else if (color.equalsIgnoreCase("red")) {
			col = new String(" rgb(255, 0, 0);");
			singleSelecBbyColor(col);
			Logger.info("Color: " + col);
		} else {
			Logger.info("colors not found");
		}
		return col;
	}

	public static WebElement selectOption(String name,String options)
	{
		return driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::h4/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/a[contains(text(),'"+options+"')]"));
	}
}
