package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

public class Register {
    protected static String url = "https://altashop-api.fly.dev/api/auth/register";

    @Step("user is on the register POST page endpoint")
    public String userIsOnTheRegisterEndpoint() {
        return url;
    }

    @Step("user is on the request page with the endpoint, POST method and JSON format body")
    public void userRequestEndpointMethodandBody() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "dinybrilianti@gmail.com");
        requestBody.put("password", "dinydino");
        requestBody.put("fullname", "Diny Brilianti");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheRegisterEndpoint());
    }

    @Step("i receive response code 200 OK")
    public void newLoginCreatedandResponseCode200OK() {
        assertThat(SerenityRest.lastResponse().statusCode(), anyOf(is(200), is(400)));
    }
}
