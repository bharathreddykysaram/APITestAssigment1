package API1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class APITestDemo {

    @Test
            public void Post(){
        RestAssured.baseURI="https://reqres.in/api/";
        RequestSpecification requestSpecification=RestAssured.given();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","jhonson");
        jsonObject.put("job","leader");
        requestSpecification.header("Content-Type","application/json");
        requestSpecification.body(jsonObject.toJSONString());


        Response response=requestSpecification.request(Method.POST,"/users");
        String Resonsebody=response.getBody().asString();
        System.out.println("Resonsebody"+Resonsebody);
        int getStatuscode=response.getStatusCode();
        System.out.println("getStatuscode"+getStatuscode);
        String getStatusline=response.getStatusLine();
        System.out.println("getStatusline"+getStatusline);





    }


}
