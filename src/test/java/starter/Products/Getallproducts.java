package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Getallproducts {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("user is on the products GET page endpoint")
    public String userOnTheProductsGetPageEndpoint() {
        return url;
    }
    @Step("user is on the request page with an endpoint and GET method")
    public void userRequestPageWithEndpointAndGetMethod() {
        SerenityRest.given().get(userOnTheProductsGetPageEndpoint());
    }
    @Step("user should receive a list of products")
    public void userShouldReceiveListProduct() {
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the response code 200 OK")
    public void userReceiveTheResponseCode200Ok() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
