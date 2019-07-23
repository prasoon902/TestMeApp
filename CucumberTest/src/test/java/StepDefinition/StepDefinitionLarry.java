package StepDefinition;

import cucumber.api.java.en.Given;

public class StepDefinitionLarry {
	@Given("^I want to write a step with precondition$")
	public void I_want_to_write_a_step_with_precondition() throws Throwable{
		System.out.println("Test is Passed");
	}
}
