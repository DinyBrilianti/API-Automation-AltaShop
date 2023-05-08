package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetproductbyID {
    protected static String url = "https://altashop-api.fly.dev/api/products/13522";

    @Step("User is on the product by ID GET page endpoint")
    public String userOnTheProductByIdGetEndpoint() {
        return url;
    }
    @Step("user is on the request page with an endpoint and get method")
    public void userOnTheRequestPageWithEndpointGetMethod() {
        SerenityRest.given().get(userOnTheProductByIdGetEndpoint());
    }
    @Step("user should receive a product by ID")
    public void userShouldReceiveProductbyID() {
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200 ok")
    public void userReceiveResponseCode2000k() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
