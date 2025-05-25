package stepDefinition;


import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import library.CommonLibrary;
import utils.ConfigProperties;
import utils.TestContext;

public class Hooks {

	CommonLibrary commonLib;
	TestContext context;

	public Hooks(TestContext context) {
		this.context = context;
		commonLib = context.getCommonLib();
	}

	@BeforeAll
	public static void beforeAll() {
		ConfigProperties.initializePropertyFile();
	}

	@After
	public void teardown() {
		commonLib.closeBrowser();
	}
}
