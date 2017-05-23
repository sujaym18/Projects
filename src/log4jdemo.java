import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class log4jdemo {
	//static final 
	Logger log=Logger.getLogger("sujay");
@Test
//public static void main(String args[]){
public void test1(){
	//4rd commit
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	log.debug("Site opens");
	driver.close();
	log.debug("site close");
	}
}
