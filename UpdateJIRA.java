package week3_RAPIweek1_Day2_Assignment_JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateJIRA extends RestAssuredBaseJIRA {
	
	@Test(dependsOnMethods = "Chaining.CreateIncident.incCreation")  //pack name.class name.methodname
	
	public void update() {
		
		//Add Req
		
		RequestSpecification req1 = RestAssured.given().contentType("application/json").body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "\r\n"
				+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}");
		
		//Send Req
		
		Response resp1 = req1.put("/issue/"+Iss_id);
		resp1.prettyPrint();
	}
	
	

}
