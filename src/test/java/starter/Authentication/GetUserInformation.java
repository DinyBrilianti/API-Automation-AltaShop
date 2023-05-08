package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformation {
    public String url = "https://altashop-api.fly.dev/api/auth/info";

    @Step("user is on the get info user page endpoint")
    public String userOnTheGetInfoUserPage() {
        return url;
    }

    @Step("user is on the request page with an endpoint and a GET method")
    public void userRequestEndpointAndGetMethod(String token) {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(userOnTheGetInfoUserPage());
    }

    @Step("user get information data")
    public void userGetInfoData() {
        System.out.println(lastResponse().getBody().jsonPath().get("data").toString());
    }

    @Step("user receive response code 200 OK")
    public void userReceiveresponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
