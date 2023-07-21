package week3_RAPIweek1_Day2_Assignment_JIRA;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateJIRA extends RestAssuredBaseJIRA {
	
	
	@Test
	public void incCreation() {
		

		//Add Request
		RequestSpecification req = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"TES\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"create issue in RA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Task\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}");
		
		//Sending Request
		Response resp = req.post("/issue/");
		resp.prettyPrint();
		
		int statusCode = resp.statusCode();
		System.out.println("Status code is.."+statusCode);
		Iss_id = resp.jsonPath().get("id");
		System.out.println("The Issue id is ..."+ Iss_id);
		
		//Assert Status Code
		resp.then().assertThat().statusCode(Matchers.equalTo(201));
		//resp.then().assertThat().body("key",Matchers.containsString("TES"));
		
			
	}
	
}
