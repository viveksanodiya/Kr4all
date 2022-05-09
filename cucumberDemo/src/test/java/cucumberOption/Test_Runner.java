package cucumberOption;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/FeaturePackage" ,
glue="StepDefinations"
       )

public class Test_Runner  {
	

}
