package RunnerTest;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test",
        glue = {"StepDefinitions"}
)

public class RunnerTest {
}
