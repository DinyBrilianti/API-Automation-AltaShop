package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Login {
    protected static  String url = "https://altashop-api.fly.dev/api/auth/login";
    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpbnkgQnJpbGlhbnRpIiwiRW1haWwiOiJkaW55YnJpbGlhbnRpQGdtYWlsLmNvbSJ9.GIpV-6zrVxN1DzEFfqaQHZ9HEYTf7m0a1A94S3G3vVM";

    @Step("user is on the login POST page endpoint")
    public String userOnLoginPageEnpoint() {
        return url;
    }
    @Step("user makes request page with the endpoint, POST method and JSON format body")
    public void userRequestEndpointwithMethodandBody() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "dinybrilianti@gmail.com");
        requestBody.put("password", "dinydino");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnLoginPageEnpoint());
    }
    @Step("user get the data bearer token")
    public String usertGetBearerToken() {
    token = lastResponse().getBody().jsonPath().get("data");
    return token;
    }
    @Step("user receive the response code 200 ok")
    public void userReceiveResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
