package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Createnewproduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("user is on the product POST page endpoint")
    public String userOnTheProductPostPageEndpoint() {
        return url;
    }
    @Step("user is on the request page with the endpoint, method POST and JSON format body")
    public void userRequestPageWithEndpointMethodAndBody() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","PS 5");
        requestBody.put("description","game 5 star");
        requestBody.put("price",499);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnTheProductPostPageEndpoint());
    }
    @Step("i receive the response code 200 OK")
    public void iReceiveTheResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
