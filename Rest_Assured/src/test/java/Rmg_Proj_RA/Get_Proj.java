package Rmg_Proj_RA;

import org.apache.http.impl.client.AbstractAuthenticationHandler;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

@Test
public class Get_Proj {


	public void getAllProjectTest()
	{


		Response rsp=RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse resVal=rsp.then();
		resVal.log().all();
		System.out.println(rsp.getStatusCode());
		System.out.println(rsp.getContentType()); 
	}

}
