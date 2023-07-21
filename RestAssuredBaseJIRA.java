package week3_RAPIweek1_Day2_Assignment_JIRA;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredBaseJIRA {
	public static String Iss_id;
	
	@BeforeMethod
	public void setUP() {
		
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/";

			//Authorization
			RestAssured.authentication=RestAssured.preemptive().basic("feb2023restAPI@gmail.com", "ATATT3xFfGF0SjbHR9BzIlxYl8MmgPuq8F1hKgxlFyUc87GlX8PX924Fdy_VTo5I0XqpvqM0kCU4nDXwedQHXy0O173on59iyMfuVJHqmPTRaslKBjVFDff5tfSTw4bUeVoNr5s4iNAvsZkzqe1PjeW-JIr0KAWze_ST1o6udIcyVQFIbkPC7ek=7691F46D");
}}
