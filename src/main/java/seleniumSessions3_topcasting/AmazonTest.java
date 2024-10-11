package seleniumSessions3_topcasting;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("edge");// TestData is browser, url and title(these are hardcoded value)

		brUtil.launchURL("https://www.amazon.com");
		String title = brUtil.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println("Title Pass");
		} else {
			System.out.println("Title Fail");
		}
		System.out.println(brUtil.getPageURL());
		brUtil.quitBrowser();
	}
}
