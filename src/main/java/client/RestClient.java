package client;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

// Reusable HTTP methods
public class RestClient {

    // get
    public Response getRequest(String endpoint) {
        return given().filter(new AllureRestAssured())
                .contentType(ContentType.JSON)
                .when()
                .get(endpoint);
    }

    // post
    public Response postRequest(String endpoint, Object body) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(endpoint);
    }

    // Add put/delete if needed later
}
