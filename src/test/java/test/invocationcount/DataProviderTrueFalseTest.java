package test.invocationcount;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderTrueFalseTest extends DataProviderBase {
  @BeforeMethod(firstTimeOnly = true)
  public void beforeMethod() {}

  @AfterMethod(lastTimeOnly = false)
  public void afterMethod() {}
}
