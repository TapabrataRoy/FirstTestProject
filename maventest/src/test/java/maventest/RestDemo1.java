package maventest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestDemo1 {
	
	
	@Test
	public static void getweather()

    {

         // RestAssured.baseURI="https://restapi.demoqa.com/utilities/weather/city";

         
          RestAssured.baseURI="https://restcountries.eu/rest/v2/all";
         

          RequestSpecification httpRequest = RestAssured.given();

         

         // Response response = httpRequest.request(Method.GET,"/Delhi");
          Response response = httpRequest.request(Method.GET);

         

          System.out.println(response.getBody().asString());

    }

}
