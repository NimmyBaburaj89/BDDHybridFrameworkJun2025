package com.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Nimmy
 * This class has common method to take screenshot
 */
public class CaptureScreenshot {

	/**
	 * @author Nimmy This return the object of captured screenshot in byte
	 *         format
	 */

	public static byte[] captureImage(WebDriver driver) {

		TakesScreenshot srcShot = (TakesScreenshot) driver;

		byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);

		return srcFile;
	}

}
	
