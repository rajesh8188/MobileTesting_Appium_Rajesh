package khan_academy_appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import frame_khan_academy.khan_capability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class testACD extends khan_capability {
	  AndroidDriver<AndroidElement> driver;
	    @BeforeTest
	    public void setup() throws Exception {
	        System.out.println("welcome to khan_academy");
	        Thread.sleep(7000);
	        service = startServer();
	        Thread.sleep(5000);
	        driver = academy(deviceName, platformName, appPackage, appActivity);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
}
	    @Test
	    public void perform_on_Cryptography() throws InterruptedException
	    {
	        
	        
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.AccessibilityId("Search")).click();
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Computing']")).click();
	        driver.findElement(MobileBy.xpath("//*[@text='Computer science']")).click();
	                                                                                          //first i tried  informtion theory 	        
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Information theory']")).click();
	        Thread.sleep(3000);
	        driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
	        Thread.sleep(3000);
	        driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
	        Thread.sleep(3000);
	        driver.pressKey(new KeyEvent(AndroidKey.BACK));
                                                                                       //	        second i tried cryptography	        
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Cryptography']")).click();
	        Thread.sleep(5000);
	        driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
	        Thread.sleep(2000);
                                                                                  //	        second time popup message was not coming
	        // driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
	        Thread.sleep(5000);
	        driver.findElement(MobileBy.AccessibilityId("Bookmarks")).click();	       
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Edit']")).click();
	        Thread.sleep(3000);
	        driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
	        driver.findElement(MobileBy.xpath("//*[@text='Delete']")).click();
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Edit']")).click();
	        Thread.sleep(3000);
	        driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
	        driver.findElement(MobileBy.xpath("//*[@text='Delete']")).click();
//	                                                                                   // checking the message after removing the bookmarks
//	        AndroidElement bookmarkmessage = driver.findElement(MobileBy.xpath("//*[@text='You have no bookmarks.']"));
//	        boolean isbookmarkmessage = bookmarkmessage.isDisplayed();
//	        // say true are false
//	        System.out.println(" You have no bookmarks._is displayed " + isbookmarkmessage);
	        
	        Thread.sleep(5000);
	        driver.findElement(MobileBy.AccessibilityId("Search")).click();
	        Thread.sleep(5000);
	        driver.findElement(MobileBy.AccessibilityId("Search")).click();
	        Thread.sleep(5000);
	        driver.findElement(MobileBy.xpath("//*[@text='Life skills']")).click();
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Financial Literacy']")).click();
	        Thread.sleep(5000);
	        driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
	        Thread.sleep(5000);
	        String before_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
	        System.out.println("before_seen_textname:" + before_seen);
	        Thread.sleep(3000);
	        driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
	        Thread.sleep(15000);
	        driver.findElement(MobileBy.xpath("//*[@text='Home']")).click();
	                                                                              // again watching recent 
	        Thread.sleep(3000);
	        String After_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
	        System.out.println("After_seen_textname:" + After_seen);
	        AndroidElement lesson_name = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']"));
	        boolean recent_lesson_name = lesson_name.isDisplayed();
	        // say true are false
	        System.out.println("Recent lesson name is  " + recent_lesson_name);
	        service.stop();
	        driver.close();
	    }
	    
}