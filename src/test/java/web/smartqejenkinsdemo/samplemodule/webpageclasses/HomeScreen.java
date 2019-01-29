package web.smartqejenkinsdemo.samplemodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"SmartQE-Jenkins-Demo\",\"project_description\":\"desc\",\"project_id\":211,\"module_name\":\"SampleModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":354,\"testcase_name\":\"TC_Home\",\"testcase_id\":425,\"testset_id\":0,\"executed_timestamp\":-1715949018,\"browser_type\":\"chrome\"}";

	public static String projectName = "smartqejenkinsdemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_294673A;
	public String clkAContact_294673() {
		waitForExpectedElement(driver, Contact_294673A);		
		String text = Contact_294673A.getText();
		Contact_294673A.click();
		return text;
	}

}