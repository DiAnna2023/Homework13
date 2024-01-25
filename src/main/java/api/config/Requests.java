package api.config;
import io.restassured.response.Response;
import static api.config.RequestService.request;
import static groovy.json.JsonOutput.toJson;
import static io.restassured.RestAssured.given;

public class Requests {

   public Response post(Object body, String endpoint){
       return given()
               .spec(request())
               .body(toJson(body))
               .when()
               .post(endpoint);
   }
}
