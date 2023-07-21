package week3_RAPIweek1_Day2_Assignment_JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteJIRA extends RestAssuredBaseJIRA{
	
	@Test(dependsOnMethods = "Chaining.UpdateIncident.update")
	public void delete() {
		Response resp2 = RestAssured.delete("/issue/"+Iss_id);
		int statusCode = resp2.getStatusCode();
		System.out.println("Response Status Code is.."+statusCode);
		
	}

}
