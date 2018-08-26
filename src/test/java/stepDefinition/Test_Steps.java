package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	@Given("^User creates a method$")
	public void userCreateMethod(){
	
		System.out.println("Usser Method Created");
	}
	
	@When("^Function is created$")
	public void userFunctionCreated(){
		
		System.out.println("Usser Function Created");
	}
	@And("^System.out.println statement is writted$")
	public void PrintStatementWritten(){
		
		System.out.println("Print Statement Written");
	}
	@Then("^Hello World is printed$")
	public void Print(){
		
		System.out.println("Print Hello World");
	}


}
