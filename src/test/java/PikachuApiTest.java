import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PikachuApiTest {

@Test
    void testPikachu()

    {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/25/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();

        ResponseBody body = response.getBody();

        String bodyAsString = body.asString();
        Assert.assertEquals(bodyAsString.contains("\"move\":{\"name\":\"thunder-punch\"") /*Expected value*/, true /*Actual Value*/, "Response body contains thunder-punch");
    }

    @Test
    void testEncounterYellowGame()

    {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/25/encounters";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();

        ResponseBody body = response.getBody();

        System.out.println(body);
        String bodyAsString = body.asString();
    }
}
