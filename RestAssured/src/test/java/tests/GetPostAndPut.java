package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.util.logging.Log;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetPostAndPut {
	@Test
	public void voit_1() {
		baseURI = "https://reqres.in/api";
		
		given().
			get("/users?page=2").
		then().
		statusCode(200).
		body("data[4].first_name",equalTo("George")).
		body("data.first_name",hasItems("George","Rache0l"));
		
	}
}
