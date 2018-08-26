package RestAssured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

//import org.testng.annotations.Test;

public class GETRequest {
	
	
	public static void main(String args[]){
		
		System.out.println("ABC");
		RequestSpecification request=RestAssured.given();
		request.header("", "", "");
	}

}
